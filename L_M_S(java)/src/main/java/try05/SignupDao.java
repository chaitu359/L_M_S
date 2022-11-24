package try05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignupDao {
	private String dburl="jdbc:mysql://localhost:3306/try01";
	private String dbuname="root";
	private String dbpassword="qwertyuiop" ;
	private String dbDriver="com.mysql.jdbc.Driver" ;
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*public Connection getConnection() {
		
		Connection con=null;
		try {
			DriverManager.getConnection(dburl,dbuname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}*/
	///Connection con=DriverManager.getConnection(dburl,dbuname,dbpassword);
	public String insert(Member member) {
		loadDriver(dbDriver);
		String res="Welcome to Library";
		//String sql="insert into try01.user values(?,?,?,?,?)"; "INSERT INTO user (username, Email, Phone, Address, Password) " +
        //"VALUES (?, ?, ?, ?, ?)";
		String sql="INSERT INTO try01.user (username, Email, Phone, Address, Password) " +
		        "VALUES (?, ?, ?, ?, ?)";
		Connection con;
		try {
			con = DriverManager.getConnection(dburl,dbuname,dbpassword);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getUsername());
			ps.setString(2, member.getEmail());
			ps.setString(3, member.getPhone());
			ps.setString(4, member.getAddress());
			ps.setString(5, member.getPassword());
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}/*catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res="Data Not Entered";
		}		*/
		return res;
	}

}
