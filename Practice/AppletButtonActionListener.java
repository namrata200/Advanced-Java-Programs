import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletButtonActionListener extends Applet implements ActionListener
{
	Button b1,b2;
	String msg;
	public void init()
	{
		b1=new Button("Xyz");
		b2=new Button("Button 2");
		add(b1);
		add(b2);
		b1.setLabel("Button 1");
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Button 1"))
		{
			msg="you clicked button 1";
		}
		else if(ae.getSource()==b2)
		{
			msg="you clicked button 2";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,60);
		String st=b1.getLabel();
		g.drawString(st,50,70);
	}
}