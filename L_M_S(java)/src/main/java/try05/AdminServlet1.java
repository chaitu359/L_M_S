package try05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet1
 */
@WebServlet("/AdminServlet1")
public class AdminServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String n=request.getParameter("txtName");
		String p=request.getParameter("txtPwd");
		if(n.equals("qwerty") && p.equals("asdf")) {
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}
		else {
			out.println("<font color=red size=18>Login Failed <br> ");
			out.println("<a href=AdminSignup.jsp>Try again |");
			RequestDispatcher rd=request.getRequestDispatcher("AdminSignup.jsp");
		}
	}

}
