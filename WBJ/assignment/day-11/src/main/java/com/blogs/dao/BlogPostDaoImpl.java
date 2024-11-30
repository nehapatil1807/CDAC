package com.blogs.dao;

import static com.blogs.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.blogs.pojos.BlogPost;
import com.blogs.pojos.Category;

public class BlogPostDaoImpl implements BlogPostDao {

	@Override
	public String addNewBlog(BlogPost post, Long categoryId, Long bloggerId) {
		String mesg = "adding blog failed !!!!";
		// 1. Get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

	@Override
	public String removeBlog(Long catId, Long blogId) {
		String mesg = "removing blog failed";

		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			tx.commit();// DML
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return mesg;
	}

}
