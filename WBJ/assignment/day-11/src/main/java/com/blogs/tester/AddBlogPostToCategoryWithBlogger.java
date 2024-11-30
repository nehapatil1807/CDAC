package com.blogs.tester;

import static com.blogs.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.blogs.dao.BlogPostDao;
import com.blogs.dao.BlogPostDaoImpl;
import com.blogs.dao.CategoryDao;
import com.blogs.dao.CategoryDaoImpl;
import com.blogs.pojos.BlogPost;
import com.blogs.pojos.Category;
import com.blogs.pojos.User;
import com.blogs.pojos.UserRole;
/*
 * 2. Add a blog under specified category
i/p : blog details(title , desc , contents) +category id 
o/p : mesg

 */

public class AddBlogPostToCategoryWithBlogger {

	public static void main(String[] args) {

		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create dao instance
			BlogPostDao postDao = new BlogPostDaoImpl();
			System.out.println("Enter blog post details - title,  description,  content ");
			String title = sc.nextLine();
			System.out.println("Enter blog  desc");
			String desc = sc.nextLine();
			System.out.println("Enter blog  contents");
			String contents = sc.nextLine();
			BlogPost newPost = new BlogPost(title, desc, contents);
			System.out.println("Enter category id n blogger id");
			System.out.println(postDao.addNewBlog(newPost, sc.nextLong(),sc.nextLong()));
		} // JVM - sf.close() => DBCP is cleaned up !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
