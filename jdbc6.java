import java.sql.*;
import javax.sql.*;
import java.util.*;
public class jdbc6
{
	public static void main(String args[])
	{
		Connection con;
		ResultSet rs;
		PreparedStatement ps;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			ps=con.prepareStatement("insert into std values(?,?,?)");
			ps.setInt(1,8);
			ps.setString(2,"kalu");
			ps.setString(3,"EE");
			int i=ps.executeUpdate();
			if(i>=1)
			{
				System.out.println("data inserted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}