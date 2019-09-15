import java.applet.*;
import java.io.*;
import java.awt.*;

public class BasicApplet extends Applet
{
	TextField f1,f2;
	String s1;
	int n1,n2,n3;
	public void init()
	{
		f1=new TextField(8);
		f2=new TextField(8);
		add(f1);
		add(f2);
	}
	public void paint(Graphics g)
	{
		try
		{
			n1=Integer.parseInt(f1.getText());
			n2=Integer.parseInt(f2.getText());
		}
		catch(Exception e){}
		n3=n1+n2;
		s1=String.valueOf(n3);
		g.drawString("The sum is",10,50);
		g.drawString(s1,100,50);
	}	
	public boolean action(Object object,Event event)
	{
		repaint();
		return true;
	}
}