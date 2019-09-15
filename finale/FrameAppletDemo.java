import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="FrameAppletDemo" height="300" width="300"></applet>

class FrameDemo extends Frame
{
	public FrameDemo(String title)
	{
		super(title);
		addWindowListener(new MyWindowAdapter(this));
	}
	public void paint(Graphics g)
	{
		g.drawString("this is frame",10,50);
	}
}
class MyWindowAdapter extends WindowAdapter
{
	FrameDemo framedemo;
	public MyWindowAdapter(FrameDemo framedemo)
	{
		
		this.framedemo=framedemo;
	}
	public void windowClosing(WindowEvent we)
	{
		framedemo.setVisible(false);
	}
}

public class FrameAppletDemo extends Applet
{
	Frame f;
	
	public void init()
	{
		f=new FrameDemo("This frame example");
		f.setSize(300,300);
	
	}
	public void start()
	{
		f.setVisible(true);
	}	
	public void stop()
	{
		f.setVisible(false);
	}	
	public void paint(Graphics g)
	{
		g.drawString("this is applet window",10,20);
	}
}