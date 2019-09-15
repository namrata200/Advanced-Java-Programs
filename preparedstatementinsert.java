import java.util.*;
import java.sql.*;
import javax.sql.*;
public class preparedstatementinsert
{
	public static void main(String args[])
	{
		Connection con;
		int i;
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			System.out.println("Insert data into table");
			System.out.println("Insert id");
			PreparedStatement ps=con.prepareStatement("insert into std values(?,?,?)");
			ps.setInt(1,sc.nextInt());
			System.out.println("Insert name");
			ps.setString(2,sc.next());
			System.out.println("Insert department");
			ps.setString(3,sc.next());
			i=ps.executeUpdate();
			System.out.println("record inserted");
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