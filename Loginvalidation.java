

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;



import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Loginvalidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","sindhu");
			String em=request.getParameter("loginid");
			String p=request.getParameter("psw");
			 PreparedStatement ps=con.prepareStatement("select * from project.member where email=? and password=?");
			 ps.setString(1, em);
			 ps.setString(2,p);
			 ResultSet rs=ps.executeQuery();
			 if(rs.next())
			 {
				  RequestDispatcher rd=request.getRequestDispatcher("gamehomepage.html");
				  rd.forward(request, response);
			 }
			 else
			 {
				 RequestDispatcher rd=request.getRequestDispatcher("password.html");
				 rd.forward(request, response);

			 }
 

		 } catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}  
	}

}
