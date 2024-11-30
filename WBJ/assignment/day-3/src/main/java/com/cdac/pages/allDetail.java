package com.cdac.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.Date;

//import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.utils.DBUtils;

@WebServlet("/allDetail")
public class allDetail extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
        try {
            // Open the database connection when the servlet initializes
            DBUtils.openConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			try {
				Connection conn = DBUtils.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * from users");
				pw.println("<html><body>");
				pw.println("<table border='1'>");
				pw.println("<tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Password</th><th>DOB</th><th>Status</th><th>Role</th>");
				
				while(rs.next()) {
					pw.println("<tr><td>"+rs.getInt("id")+ "</td>");
					pw.println("<td>" + rs.getString("first_name") + "</td>");
					pw.println("<td>" + rs.getString("last_name") + "</td>");
					pw.println("<td>" + rs.getString("email") + "</td>");
					pw.println("<td>" + rs.getString("password") + "</td>");
					pw.println("<td>" + rs.getDate("dob") + "</td>");
					pw.println("<td>" + rs.getString("status") + "</td>");
					pw.println("<td>" + rs.getString("role") + "</td></tr>");
				}
				
				pw.println("</table>");
				pw.println("</body></html>");
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
}
