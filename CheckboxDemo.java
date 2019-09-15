import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheckboxDemo extends Applet implements ItemListener
{
	Checkbox cbJP2,cbJSP,cbAND,cbCS,cbST;
	String msg;
	public void init()
	{
		cbJP2=new Checkbox("Java Programming");
		cbJSP=new Checkbox("Java Servlet Programming");
		cbAND=new Checkbox("Android");
		cbCS=new Checkbox("Computer Security",true);
		cbST=new Checkbox("Software Testing",true);
		
		add(cbJP2);
		add(cbJSP);
		add(cbAND);
		add(cbCS);
		add(cbST);
		cbJP2.addItemListener(this);
		cbJSP.addItemListener(this);
		cbAND.addItemListener(this);
		cbCS.addItemListener(this);
		cbST.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="current state";
		g.drawString(msg,10,50);
		msg="Java Programming 2="+cbJP2.getState();
		g.drawString(msg,10,80);
		msg="Java Servlet Programming="+cbJSP.getState();
		g.drawString(msg,10,90);
		msg="Android="+cbAND.getState();
		g.drawString(msg,10,100);
		msg="Computer Security="+cbCS.getState();
		g.drawString(msg,10,110);
		msg="Software Testing="+cbST.getState();
		g.drawString(msg,10,120);
	}
	
}