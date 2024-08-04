package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found!!!");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bhupesh","root","dell");
		System.out.println("Connection Suucess");

		
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee Id= ");
		int id = s.nextInt();
		System.out.println("Enter Employee Name= ");
		String name = s.next();
		System.out.println("Enter Employee Salary= ");
		float Salary = s.nextFloat();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, Salary);
		
		int Status = pstmt.executeUpdate();
		System.out.println(Status);
		
		ResultSet rs = pstmt.executeQuery("Select * from employee");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
	}

}