package com.blogs.tester;

import static com.blogs.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.blogs.dao.CommentDao;
import com.blogs.dao.CommentDaoImpl;

public class GetCommentsByPostTitle {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create comment dao instance
			CommentDao dao = new CommentDaoImpl();
			// for testing - do not add any white space
			System.out.println("Enter post title , to list it's comments ");
			System.out.println("All comments for the given post title");
			dao.getCommentsByPost(sc.next()).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
