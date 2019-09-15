import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="Frame1" height="300" width="300"></applet>

class FrameDemo extends Frame
{
	public FrameDemo(String title)
	{
		super(title);
		
	}
	public void paint(Graphics g)
	{
		g.drawString("This is frame window",10,50);
	}
}
public class Frame1 extends Applet
{
	Frame f;
	public void init()
	{
		f=new FrameDemo("Frame Example");
		f.setSize(300,300);
	}
	public void paint(Graphics g)
	{
		g.drawString("This applet window",10,50);
	}
	public void start()
	{
		f.setVisible(true);
	}
	public void stop()
	{
		f.setVisible(false);
	}
}
