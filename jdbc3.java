import java.sql.*;
import javax.sql.*;
import java.util.*;
public class jdbc3
{
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		ResultSet rs;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select *from std");
			System.out.println("id\tname\tdepartment");
			while(rs.next())
			{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			String c=rs.getString(3);			
	
			System.out.println(a+"\t"+b+"\t"+c);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			//con.close();
		}
	}
}