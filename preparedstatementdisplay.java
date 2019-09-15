import java.util.*;
import java.sql.*;
import javax.sql.*;
public class preparedstatementdisplay
{
	public static void main(String args[])
	{
		Connection con;
		ResultSet rs;
		Statement stmt;
		int i;
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			stmt=con.createStatement();
			System.out.println("\t\tData is table is as follow");
			System.out.println("---------------------------------------------------");
			System.out.println("ID\tName\tDepartment");
			rs=stmt.executeQuery("select *from std");
			while(rs.next())
			{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			String c=rs.getString(3);			
	
			System.out.println(a+"\t"+b+"\t"+c);
			}
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}