import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class LoginPage extends Applet implements ActionListener
{
	String uname,upass,msg;
	Label Luname,Lupass;
	TextField tuname,tupass;
	Button blogin;
	public void init()
	{
		Luname=new Label("User Name");
		Lupass=new Label("Password");
		tuname=new TextField(20);
		tupass=new TextField(20);
		blogin=new Button("Login");
		add(Luname);
		add(tuname);
		add(Lupass);
		add(tupass);
		add(blogin);
		blogin.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		uname=tuname.getText();
		upass=tupass.getText();
		if(uname.equals("vishal")&&upass.equals("1234"))
		{
			msg="welcome";
		}
		else
		{
			msg="you entered wrong choice";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,80,90);
	}
}