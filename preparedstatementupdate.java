import java.util.*;
import java.sql.*;
import javax.sql.*;
public class preparedstatementupdate
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
			System.out.println("Insert id for updation");
			PreparedStatement ps=con.prepareStatement("update std set name=?,department=? where id=?");
			ps.setInt(3,sc.nextInt());
			System.out.println("Insert name for updation");
			ps.setString(1,sc.next());
			System.out.println("Insert department for updation");
			ps.setString(2,sc.next());
		
			i=ps.executeUpdate();
			System.out.println("record updated");
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