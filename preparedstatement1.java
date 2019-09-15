import java.util.*;
import java.sql.*;
import javax.sql.*;
public class preparedstatement1
{
	public static void main(String args[])
	{
		Connection con;
		ResultSet rs;
		Statement stmt;
		int i=0,ch;
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			stmt=con.createStatement();
			do
			{
				System.out.println("1-Insert\n2-Display\n3-Delete\n4-Update\n5-Search\n6-Sort\n7-Exit");
				System.out.println("Enter choice");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
							System.out.println("Insert data into table");
							System.out.println("Insert id");
							PreparedStatement ps=con.prepareStatement("insert into std values(?,?,?)");
							ps.setInt(1,sc.nextInt());
							System.out.println("Insert name");
							ps.setString(2,sc.next());
							System.out.println("Insert department");
							ps.setString(3,sc.next());
							i=ps.executeUpdate();
							if(i>=1)
							{
								System.out.println("record inserted");
							}
							break;
					case 2:
							System.out.println("\t\tData is table is as follow");
							System.out.println("---------------------------------------------------");
							System.out.println("ID\tName\tDepartment");
							rs=stmt.executeQuery("select *from std");
							while(rs.next())
							{
							int a=rs.getInt(1);
							String b=rs.getString(2);			
							String c=rs.getString(3);			
					
							System.out.println(a+"\t"+b+"\t"+c);
							}
							break;
					case 3:
							System.out.println("Insert id to delete");
							ps=con.prepareStatement("delete from std where id=?");
							ps.setInt(1,sc.nextInt());
						
							i=ps.executeUpdate();
							if(i>=1)
							{
								System.out.println("record deleted");
							}
							break;
					case 4:
							System.out.println("Insert id for updation");
							ps=con.prepareStatement("update std set name=?,department=? where id=?");
							ps.setInt(3,sc.nextInt());
							System.out.println("Insert name for updation");
							ps.setString(1,sc.next());
							System.out.println("Insert department for updation");
							ps.setString(2,sc.next());
						
							i=ps.executeUpdate();
							if(i>=1)
							{
								System.out.println("record updated");
							}
							break;
					case 5:	System.out.println("Insert id to serach");
							ps=con.prepareStatement("select * from std where id=?");
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
					
							System.out.println(a+"\t"+b+"\t"+c+"\n\n");
							i++;
							}
							if(i==0)
							{
								System.out.println("no data found");
							}
							break;
					case 6:
							System.out.println("\t\tData is table is as follow");
							System.out.println("---------------------------------------------------");
							System.out.println("ID\tName\tDepartment");
							rs=stmt.executeQuery("select *from std order by id ASC");
							while(rs.next())
							{
							int a=rs.getInt(1);
							String b=rs.getString(2);			
							String c=rs.getString(3);			
					
							System.out.println(a+"\t"+b+"\t"+c);
							}
							break;
					case 7:
							System.exit(0);
							break;
					default:
							System.out.println("no data found");
				}
				System.out.println("Do you want to continur press 9");
				ch=sc.nextInt();
			}while(ch==9);
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