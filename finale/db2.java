import java.sql.*;
import javax.sql.*;

public class db2
{
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		ResultSet rs;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from fg");
			while(rs.next())
			{
				int a=rs.getInt(1);
				String s=rs.getString(2);
				System.out.println(""+a+""+s);
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