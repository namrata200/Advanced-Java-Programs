import java.sql.*;
import javax.sql.*;

public class PreparedStatementInsertDemo
{
	public static void main(String args[])
	{
		Connection con;
		ResultSet rs;
		PreparedStatement ps;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			
			ps=con.prepareStatement("insert into student1 values(?,?,?)");
			
			ps.setInt(1,8);
			ps.setString(2,"hello");
			ps.setString(3,"a1");
			
			int i=ps.executeUpdate();
			System.out.println("Inserted "+i);
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