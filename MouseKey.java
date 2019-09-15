import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class MouseKey extends Applet implements MouseListener,MouseMotionListener,KeyListener,MouseWheelListener
{
	String msg,msg1;
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
	public void mouseExited(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Exited";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		x=0;
		y=10;
		msg="Mouse Entered";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="UP";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Down";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="*";
		showStatus("Mouse dragged at"+x+","+y);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("mouse moved at"+me.getX()+","+me.getY());
	}
	public void mouseWheelMoved(MouseWheelEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse wheel is moved";
		repaint();		
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Down");
		int key=ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_F1:
									msg1="F1";
									break;
			case KeyEvent.VK_F2:
									msg1="F2";
									break;
			case KeyEvent.VK_F3:
									msg1="F3";
									break;	
			case KeyEvent.VK_PAGE_DOWN:
										msg1="page down";
										break;			
			case KeyEvent.VK_PAGE_UP:
									msg1="page up";
									break;		
			case KeyEvent.VK_LEFT:
									msg1="LEFT ARROW";
									break;			
			case KeyEvent.VK_RIGHT:
									msg1="RIGHT ARROW";
									break;				
		}
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Down");
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		msg1=String.valueOf(ke.getKeyChar());
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
		g.drawString(msg1,10,20);		
	}
}