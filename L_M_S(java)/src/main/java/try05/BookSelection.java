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
 * Servlet implementation class BookSelection
 */
@WebServlet("/BookSelection")
public class BookSelection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/try01", "root","qwertyuiop");
			String Book=request.getParameter("Book");
			int Quantity=Integer.parseInt(request.getParameter("Quantity"));     //try01`.`books` SET `Quantity` = 'Quantity-?' WHERE (`Book_name` = '?')
			/*PreparedStatement ps=con.prepareStatement("update books set Quantity = Quantity-? where(Book_name = ?)");
			//pstmt=con.prepareStatement(sql);
			ps.setInt(1, Quantity);
			ps.setString(2,Book);
			ps.executeUpdate();*/
			PreparedStatement ps1=con.prepareStatement("select Quantity from books where Book_name=?");
			ps1.setString(1,Book);
			ResultSet rs=ps1.executeQuery();
			while(rs.next()) {
				if(Integer.parseInt(rs.getString(1))>0) {
					PreparedStatement ps=con.prepareStatement("update books set Quantity = Quantity-? where(Book_name = ?)");
					//pstmt=con.prepareStatement(sql);
					ps.setInt(1, Quantity);
					ps.setString(2,Book);
					ps.executeUpdate();
					out.println("Enjoy Reading");}
					//RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");}
				else{
					out.println("The Book you selected is out of quantity");
				}
					
				}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


