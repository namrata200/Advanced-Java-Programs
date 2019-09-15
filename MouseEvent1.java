import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvent1 extends Applet implements MouseListener,MouseMotionListener,MouseWheelListener,KeyListener
{
	String msg="";
	String msg1="";
	int mX,mY;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
		addKeyListener(this);
	}
	public void mouseEntered(MouseEvent e)
	{
		mX=0;
		mY=10;
		msg="Entered";
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		mX=0;
		mY=10;
		msg="Exited";
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		mX=e.getX();
		mY=e.getY();
		msg="Down";
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		mX=e.getX();
		mY=e.getY();
		msg="UP";
		repaint();
	}
	public void mouseClicked(MouseEvent e)
	{
		mX=0;
		mY=10;
		msg="Clicked";
		repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		mX=e.getX();
		mY=e.getY();
		msg="*";
		showStatus("Mouse Dragged at"+mX+","+mY);
		repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		
		showStatus("Mouse Moved at"+mX+","+mY);
		repaint();
	}
	public void mouseWheelMoved(MouseWheelEvent e)
	{
		
		mX=0;
		mY=10;
		msg="Mouse Wheel Moved at";
		repaint();
	}
	public void keyPressed(KeyEvent e)
	{
		showStatus("Key is pressed");
		repaint();
	}
	public void keyReleased(KeyEvent e)
	{
		showStatus("Key is released");
		repaint();
	}	
	public void keyTyped(KeyEvent e)
	{
		msg1+=e.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mX,mY);
		g.drawString(msg1,100,100);
	}
}