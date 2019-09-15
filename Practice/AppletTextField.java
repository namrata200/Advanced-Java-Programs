import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="AppletTextField" height="300" width="300"></applet>
public class AppletTextField extends Applet implements ActionListener
{
	TextField uid,pass;
	public void init()
	{
		Label User=new Label("User Name");
		Label Passp=new Label("Password");
		uid=new TextField("Vishal Patil",20);
		pass=new TextField(20);
		add(User);
		add(uid);
		add(Passp);
		add(pass);
		pass.setEchoChar('?');
		uid.addActionListener(this);
		pass.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name:   "+uid.getText(),10,70);
		g.drawString("Selected text:  "+uid.getSelectedText(),10,80);
		g.drawString("Password:    "+pass.getText(),10,90);
	}
}