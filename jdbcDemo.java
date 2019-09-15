import java.sql.*;
import javax.sql.*;

public class jdbcDemo
{
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		ResultSet rs;
		try{
			//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			
			//create the statement object
			stmt=con.createStatement();
			
			//execute query
			
			rs=stmt.executeQuery("select *from student1");
			System.out.println("Rollno\tSname\tSclass");
			
			while(rs.next())
			{
				int x=rs.getInt(1);
				String y=rs.getString(2);
				String z=rs.getString(3);
				System.out.println(x+"\t"+y+"\t"+z);
			}
			con.close();
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
