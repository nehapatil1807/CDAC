package com.blogs.dao;

import static com.blogs.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.blogs.pojos.BlogPost;
import com.blogs.pojos.Category;
import com.blogs.pojos.User;
import com.blogs.pojos.UserRole;

public class BlogPostDaoImpl implements BlogPostDao {

	@Override
	public String addNewBlog(BlogPost post, Long categoryId, Long bloggerId) {
		String mesg = "adding blog failed !!!!";
		// 1. Get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			//3. Validate category - get category details by id
			Category category=session.get(Category.class, categoryId);
			//4. Validate Blogger - get blogger details by it's id
			User blogger=session.get(User.class, bloggerId);
			//null checking 
			if(category != null && blogger != null 
					&& blogger.getRole()==UserRole.BLOGGER)
			{
				//category -persistent
				//blogger-persistent
				//post -transient
				//valid data 
				//5. Establish uni dir association BlogPost ---> User(blogger)
				post.setBlogger(blogger);
				//simply invoke a helper method to establish a bi dir association 
				//between Category n BlogPost
				category.addBlogPost(post);//modifying the state of the persistent entity - category
//				//6. Establish bi dir association BlogPost *--->1 Category
//				post.setBlogCategory(category);
//				//7. Establish bi dir association BlogPost *<---1 Category
//				category.getBlogPosts().add(post);
//				session.persist(post);//No Longer required explicitly , since using CascadeType.ALL
				mesg="Added new blog post !";
			}
					
			tx.commit();//session.flush() -> detects the change in category --> new transient entity post
			//-> auto inserts the rec in posts table!
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

	@Override
	public String removeBlog(String catName, String postTitle) {
		String mesg = "removing blog failed";
		String jpql1="select c from Category c where c.categoryName=:name";
		String jqpl2="select b from BlogPost b where b.title =:title";

		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			//3. get category from it's name
			Category category=session.createQuery(jpql1, Category.class)
					.setParameter("name", catName)
					.getSingleResult();
			//4. get blog post form it's title
			BlogPost post=session.createQuery(jqpl2, BlogPost.class)
					.setParameter("title", postTitle)
					.getSingleResult();
			//category , post : persistent
			//de link (or un establish) bi dir association between Category n Post
			category.removeBlogPost(post);
			//how to  de link the uni association between post n blogger ?
			post.setBlogger(null);			
			tx.commit();// DML -
			/*
			 * After adding CascadeType.ALL (delete) + orphanRemoval=true
			 * hibernate will auto delete the orphan record(i.e entity w/o any association)
			 *  , upon commit
			 * 
			 */
			mesg="Removed blog post from the category !";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return mesg;
	}

}
