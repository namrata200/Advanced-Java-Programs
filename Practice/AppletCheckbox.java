import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletCheckbox extends Applet implements ItemListener
{
	Checkbox M1,M2,M3;
	String msg;
	public void init()
	{
		M1=new Checkbox("Math 1");
		M2=new Checkbox("Math 2",true);
		M3=new Checkbox("Math 3");
		add(M1);
		add(M2);
		add(M3);
		M1.addItemListener(this);
		M2.addItemListener(this);
		M3.addItemListener(this);
	}	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Current state of checkbox element is below",10,30);
		msg="M1:"+M1.getState();
		g.drawString(msg,10,40);
		msg="M2:"+M2.getState();
		g.drawString(msg,10,50);
		msg="M3:"+M3.getState();
		g.drawString(msg,10,60);		
	}
}