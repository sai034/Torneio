

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SignupAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out=response.getWriter();
		String fname = request.getParameter("firstName");
		String sname = request.getParameter("secondName");
		String phone = request.getParameter("phoneNo");
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		String gen = request.getParameter("Gender");
		String usn = request.getParameter("Usn");
		String name = request.getParameter("Name");
		String game = request.getParameter("Game");
		String sem = request.getParameter("Sem");
		String sec = request.getParameter("Sec");
		String phoneno = request.getParameter("phoneNo1");
		if(fname!="") {
		Member member = new Member(fname,sname,phone,email,pwd,gen);
		RegisterDao rDao = new RegisterDao();
		String result = rDao.insert(member);
		response.getWriter().print(result);
		out.println("<br><a href=loginpage.jsp>login</a>");
		}
		if(usn!=""){
		Member2 member2 = new Member2(usn, name, game, sem, sec, phoneno);
		RegisterDao2 rDao2 = new RegisterDao2();
		String result2 = rDao2.insert(member2);
		response.getWriter().print(result2);
		}
	}

}
