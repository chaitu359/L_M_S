package try05;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/try01", "root","qwertyuiop");
			String n=request.getParameter("txtBook");
			String sql="select * from try01.books where Book_name=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, n);
			ResultSet rs=ps.executeQuery();
			   out.println("<html><body>");
			   out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
			   out.println("<tr>");
			   out.println("<td><b>Book_id</b></td>");
			   out.println("<td><b>Book_name</b></td>");
			   out.println("<td><b>Quantity</b></td>");
			   out.println("</tr>");
			   while(rs.next()) {
				   if(Integer.parseInt(rs.getString(4))>0) {
				    out.println("<tr>");
				    out.println("<td>"+rs.getString(1) + "</td>");
				    out.println("<td>"+rs.getString(2) + "</td>");
				    out.println("<td>"+rs.getString(4) + "</td>");
				    out.println("</tr>");

				   }
				   else {
					   out.println("the book is not available currently");
					   out.println("<tr>");
					    out.println("<td>"+rs.getString(1) + "</td>");
					    out.println("<td>"+rs.getString(2) + "</td>");
					    out.println("<td>"+rs.getString(4) + "</td>");
					    out.println("</tr>");}
				   }
			   
			   out.println("</table></br><hr></body></html>");
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
