import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="MouseDemo" height="300" width="300"></applet>

public class MouseDemo extends Applet implements MouseListener,MouseMotionAdapter,MouseWheelListener
{
	String msg="":
	int x,y;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Clicked";
	}
	public void mousePressed(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Pressed";
	}
	public void mouseReleased(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse released";
	}
	public void mouseEntered(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Entered";
	}
	public void mouseExited(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Exited";
	}
	public void mouseDragged(MouseEvent me)
	{
		showStatus("Mouse Dragged");
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("Mouse moved");
	}
	public void mouseWheelMoved(MouseEvent me)
	{
		showStatus("Mouse wheel moved");
	}
}