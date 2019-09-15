import java.sql.*;
import javax.sql.*;
import java.util.*;

public class PreparedStatementSearchDemo
{
	public static void main(String args[])
	{
		Connection con;
		ResultSet rs;
		PreparedStatement ps;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			
			System.out.println("Enetr roll number to search");
			Scanner sc=new Scanner(System.in);
			int enr=sc.nextInt();
			ps=con.prepareStatement("select *from student1 where Rollno=?");
			
			//pass values to question mark ?
			
			ps.setInt(1,enr);
			
			//execute query
			rs=ps.executeQuery();
			
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