import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//creating frame subclass
class FrameDemo extends Frame
{
	public FrameDemo(String title)
	{
		super(title);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is frame window",10,20);
	}
}
public class Applet2 extends Applet
{
	//create frame object
	Frame f1;
	public void init()
	{
		f1=new FrameDemo("Example");
		f1.setSize(300,300);
		f1.setVisible(true);
	}
	public void start()
	{
		f1.setVisible(true);
	}
	public void stop()
	{
		f1.setVisible(false);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is applet ",10,20);
	}	
}