package com.blogs.tester;

import static com.blogs.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.blogs.dao.UserDao;
import com.blogs.dao.UserDaoImpl;
import com.blogs.pojos.User;
import com.blogs.pojos.UserRole;

public class RestoreImageFromDB {

	public static void main(String[] args) {
		/*
		 * 5. Restore user image from DB
			i/p - user id ,new image file name(path)
			 - where the image from DB should be stored
			o/p - message
		 */
		try (Scanner sc = new Scanner(System.in);
				SessionFactory sf = getFactory()) {
			// create dao instance
			UserDao userDao = new UserDaoImpl();
			System.out.println("Enter image file path");
			String filePath=sc.nextLine();
			System.out.println("Enter user id");
			Long userId=sc.nextLong();
			// invoke dao's method
			System.out.println(userDao.restoreUserImage(filePath,userId));
																					
			
		} // JVM - sf.close() => DBCP is cleaned up !
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
