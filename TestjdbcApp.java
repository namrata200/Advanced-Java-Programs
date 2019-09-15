import javax.sql.*;
import java.sql.*;
class TestjdbcApp
{
 public static void main(String args) throws Exception
 {
   Class.forName("oracle.jdbc.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","vishal");
   System.out.println("connection:"+con);
   PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?)");
   ps.setInt(1,101);
   ps.setString(2,"Ramesh");
   ps.setString(3,"abc");
   int i=ps.executeUpdate();
   if(i>0)
   {
	   System.out.println("record save");
   }
 }
}
   