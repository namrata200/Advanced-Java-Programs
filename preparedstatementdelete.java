import java.util.*;
import java.sql.*;
import javax.sql.*;
public class preparedstatementdelete
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
			System.out.println("Insert id to delete");
			PreparedStatement ps=con.prepareStatement("delete from std where id=?");
			ps.setInt(1,sc.nextInt());
		
			i=ps.executeUpdate();
			System.out.println("record deleted");
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