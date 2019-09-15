import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class FontDemo1 extends Applet
{
	int curX=0,curY=0;
	String msg;
	public void init()
	{
		Font f1=new Font("Courier",Font.BOLD,19);
		setFont(f1);
	}
	public void paint(Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		nextline("This is next line",g);
		nextline("This too",g);
		sameline("This is same line",g);
		sameline("This too",g);
	}
	void nextline(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		curY+=fm.getHeight();
		curX=0;
		msg=s;
		g.drawString(msg,curX,curY);
		curX=fm.stringWidth(s);
	}
	void sameline(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		msg=s;
		g.drawString(msg,curX,curY);
		curX+=fm.stringWidth(s);
	}
}
