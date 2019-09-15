import java.sql.*;
import javax.sql.*;
import java.util.*;

public class jdbccreatetableDemo
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
			
			rs=stmt.executeQuery("create table ok(id varchar(20), pass varchar(20), primary key(id))");
			System.out.println("table created");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 for display record and 0 for exit");
			int ch=sc.nextInt();
			if(ch==2)
			{
				rs=stmt.executeQuery("select *from ok");
				System.out.println("ID\tPassword");
				while(rs.next())
			{
				String y=rs.getString(1);
				String z=rs.getString(2);
				System.out.println(y+"\t"+z);
			}
			}
			else if(ch==0)
			{
				System.exit(0);
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
