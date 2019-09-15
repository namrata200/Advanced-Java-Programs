import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class FrameDemo extends Frame
{
	FrameDemo(String title)
	{
		super(title);
		Label l1=new Label("onasas");
		add(l1);
	}
	
}
public class Frame2 extends Applet
{
	Frame f;
	public void init()
	{
		f=new FrameDemo("Example");
		f.setVisible(true);
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
		g.drawString("This is applet windpw",10,20);
	}
	}