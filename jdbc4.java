import java.sql.*;
import javax.sql.*;
import java.util.*;

public class jdbc4
{
	public static void main(String args[])
	{
		Connection con;
		//Declare connection
		
		ResultSet rs;
		//Declare result set to gain data
		
		PreparedStatement ps;
		//Declare prepared statement
		
		Scanner sc=new Scanner(System.in);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//create the driver class
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			//connect the database
			
			ps=con.prepareStatement("insert into std values(?,?,?)");
			System.out.println("Insert id");
			ps.setInt(1,sc.nextInt());
			System.out.println("Insert name");
			ps.setString(2,sc.next());
			System.out.println("Insert depart");
			ps.setString(3,sc.next());
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