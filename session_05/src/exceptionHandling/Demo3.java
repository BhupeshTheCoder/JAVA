package exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Demo3 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		
		con = DriverManager.getConnection("","","");
		
		//con.close();
		
		}catch (Exception e) {
			// TODO: handle exception
			//con.close();
		}
		finally {
			con.close();	
		}		
	}
}
