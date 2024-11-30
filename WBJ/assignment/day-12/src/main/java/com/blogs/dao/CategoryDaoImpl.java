package com.blogs.dao;

import static com.blogs.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.blogs.pojos.Category;

public class CategoryDaoImpl implements CategoryDao {

	@Override
	public String addNewCategory(Category category) {
		String mesg = "adding category failed !";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(category);//causes transient -> persistent
			//category : persistent
			tx.commit();//DML - insert
			mesg = "added new category with id=" + category.getId();//not null - 1
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return mesg;
	}

	@Override
	public Category getCategoryDetails(String categoryName) {
		Category category = null;
		String jpql="select c from Category c where c.categoryName=:nm";
			// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			category=session.createQuery(jpql, Category.class)
					.setParameter("nm",categoryName)
					.getSingleResult();
				tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return category;// detached
	}

	@Override
	public Category getCategoryDetailsById(Long categoryId) {
		Category category = null;
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return category;// detached
	}

	@Override
	public Category getCategoryAndPostDetails(String categoryName) {
		Category category = null;
//		String jpql="select c from Category c where c.categoryName=:nm";
		String jpql="select c from Category c  join fetch c.blogPosts where c.categoryName=:nm";

		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			category=session.createQuery(jpql, Category.class)
					.setParameter("nm",categoryName)
					.getSingleResult(); //select:fired only on categories table
//				category.getBlogPosts().forEach(System.out::println); //select query will be fired on post table
				//category:persistent,session-open-within the session scope
//			category.getBlogPosts().size();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return category;// detached

	}

}
