package session_11;

import java.sql.*;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt;
		ResultSet rs;
		Scanner s = new Scanner(System.in);
		
		try
		{
			//1.Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			
			//2. Establish Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
			System.out.println("Connection Established");
			
			//3.create a statement
			pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			
			System.out.println("Enter employee Id: ");
			int id = s.nextInt();
			System.out.println("Enter Employee Name: ");
			String name= s.next();
			System.out.println("Enter Employee Salary: ");
			float salary = s.nextFloat();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setFloat(3, salary);
			
			//4. Exceute Statement
			
				int i = pstmt.executeUpdate();
				if(i>0)
					System.out.println("Record Successfully Inserted!!!");
				else
					System.out.println("Failed!!!");
				
				
				rs = pstmt.executeQuery("select *from employee");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
				}
				
			/*
			 * pstmt.execute() --- boolean 
			 * pstmt.executeQuery() --- ResultSet
			 * pstmt.executeUpdate() --- int
			 */
	
		}catch (Exception e) {	System.out.println(e);}
		finally {
			con.close();
		}	
	}

}
