import java.sql.*;
import javax.sql.*;

public class db1
{
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		PreparedStatement ps;
		ResultSet rs;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			ps=con.prepareStatement("insert into fg values(?,?)");
			ps.setInt(1,1);
			ps.setString(2,"vishal");
			ps.executeUpdate();
			System.out.println("iserred");
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