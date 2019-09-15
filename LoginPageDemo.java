import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;

public class LoginPageDemo extends Applet implements ActionListener
{
	Label lid,lpass;
	TextField tid,tpass;
	Button bsubmit;
	String msg;
	int cnt=1;
	public void init()
	{
		setLayout(new FlowLayout());
		lid=new Label("User ID");
		lpass=new Label("Password");
		tid=new TextField(20);
		tpass=new TextField(20);
		bsubmit=new Button("Submit");
		add(lid);
		add(tid);
		add(lpass);
		add(tpass);
		add(bsubmit);
		
		bsubmit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsubmit)
		{
		Connection con;
		ResultSet rs;
		PreparedStatement ps;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
			
			Scanner sc=new Scanner(System.in);
			String x=tid.getText();
			String y=tpass.getText();
			ps=con.prepareStatement("select *from student1 where id=? pass=?");
			
			//pass values to question mark ?
			
			ps.setString(1,x);
			ps.setString(2,y);
			//execute query
			rs=ps.executeQuery();
			
			System.out.println("id\tpass");
			
			while(rs.next())
			{
				cnt++;
				String w=rs.getString(1);
				String z=rs.getString(2);
				System.out.println(w+"\t"+z);
			}
			if(cnt==1)
			{
				
				msg="inavlid";
			}
			else if(cnt>1)
			{
				msg="valid";
			}
			con.close();
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
	public void paint(Graphics g)
	{
		g.drawString(msg,70,70);
	}
	
}