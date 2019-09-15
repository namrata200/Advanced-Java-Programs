import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="MouseDemo" height="300" width="300"></applet>

public class MouseDemo extends Applet implements MouseListener,MouseMotionListener,MouseWheelListener,KeyListener
{
	String msg="";
	int x,y;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
		addKeyListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Clicked";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse released";
	repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Entered";
	repaint();}
	public void mouseExited(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Exited";
	repaint();}
	public void mouseDragged(MouseEvent me)
	{
		showStatus("Mouse Dragged");
	repaint();}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("Mouse moved");
	repaint();}
	public void mouseWheelMoved(MouseWheelEvent me)
	{
		showStatus("Mouse wheel moved");
	repaint();}
	public void keyReleased(KeyEvent ke)
	{
		x=0;
		y=30;
		msg="key released";
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		x=30;
		y=70;
		msg+=ke.getKeyChar();
		repaint();
		
	}
	public void keyPressed(KeyEvent ke)
	{
		int key=ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_F1:
								msg="F1";
								break;
			
		}
		x=80;
		y=90;
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}