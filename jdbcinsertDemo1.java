import java.sql.*;
import javax.sql.*;
import java.util.*;

public class jdbcinsertDemo1
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
			Scanner sc=new Scanner(System.in);
			System.out.println("1-insert\n2-display");
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter roll no");
				int rollno=sc.nextInt();
				System.out.println("Enter name");
				String Sname=sc.nextChar();
				System.out.println("Enter class");
				String Sclass=sc.nextChar();
				int i=stmt.executeUpdate("insert into student1 values(rollno+",'"+Sname+"','"+Sclass+"'")");
			System.out.println(""+i);
			break;
			case 2:
			rs=stmt.executeQuery("select * from student1");
			System.out.println("Rollno\tSname\tSclass");
			
			while(rs.next())
			{
				int x=rs.getInt(1);
				String y=rs.getString(2);
				String z=rs.getString(3);
				System.out.println(x+"\t"+y+"\t"+z);
			}
			break;
			default:
			System.out.println("invalid values");
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
