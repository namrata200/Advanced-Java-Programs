import java.sql.*;
import javax.sql.*;
import java.util.*;

public class jdbc10 
{
	public static void main(String args[])
	{
		Connection con;
		Statement st;
		PreparedStatement ps;
		ResultSet rs;
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			st=con.createStatement();
			System.out.println("enter 1 to display and 2 for insert");
			int ch=sc.nextInt();
			if(ch==1)
			{
				rs=st.executeQuery("select * from std");
				System.out.println("");
				while(rs.next())
				{
					int a=rs.getInt(1);
					String b=rs.getString(2);
					String c=rs.getString(3);
					System.out.println(a+"\t"+b+"\t"+c);
				}
			}
			else if(ch==2)
			{
				ps=con.prepareStatement("insert into std values(?,?,?)");
				System.out.println("Enter id name depart");
				ps.setInt(1,sc.nextInt());
				ps.setString(2,sc.next());
				ps.setString(3,sc.next());
				int o=ps.executeUpdate();
				if(o>=1)
				{
					System.out.println("inserted");
				}
			}
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
		finally
		{
			//con.close();
		}
		
	}
}