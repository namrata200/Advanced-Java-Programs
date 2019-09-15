import java.sql.*;
import javax.sql.*;
import java.util.*;

public class jdbc5
{
	public static void main(String args[])
	{
		Connection con;
		ResultSet rs;
		Statement st;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			st=con.createStatement();
			rs=st.executeQuery("select * from std");
			DatabaseMetaData dm=con.getMetaData();
			String d=dm.getUserName();
			System.out.println(d);
			String da=dm.getTables();
			System.out.println(da);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}