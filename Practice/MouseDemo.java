import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="MouseDemo" height="300" width="300"></applet>

public class MouseDemo extends Applet implements MouseListener,MouseMotionListener,MouseWheelListener
{
	String msg;
	int x=0,y=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
	}
	public void mousePressed(MouseEvent me)
	{
		x=0;
		y=10;
		msg="mouse pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=0;
		y=20;
		msg="mouse released";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="mouse entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="mouse exited";
		repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		x=0;
		y=10;
		msg="mouse clicked";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		showStatus("Mouse dragging at"+me.getX()+","+me.getY());
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("Mouse moving at"+me.getX()+","+me.getY());
		repaint();
	}
	public void mouseWheelMoved(MouseWheelEvent me)
	{
		x=0;
		y=10;
		msg="mouse wheel moved";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}