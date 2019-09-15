import java.util.*;
import java.sql.*;
import javax.sql.*;
public class preparedstatementsearch
{
	public static void main(String args[])
	{
		Connection con;
		ResultSet rs;
		Statement stmt;
		int i=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			stmt=con.createStatement();
			System.out.println("Insert id to serach");
			PreparedStatement ps=con.prepareStatement("select * from std where id=?");
			ps.setInt(1,sc.nextInt());
			
		
			rs=ps.executeQuery();
			System.out.println("\t\tData is table is as follow");
			System.out.println("---------------------------------------------------");
			System.out.println("ID\tName\tDepartment");
			while(rs.next())
			{
				int a=rs.getInt(1);
			String b=rs.getString(2);			
			String c=rs.getString(3);			
	
			System.out.println(a+"\t"+b+"\t"+c);
			i++;
			}
			if(i==0)
			{
				System.out.println("no data found");
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