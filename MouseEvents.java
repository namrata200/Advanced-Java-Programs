import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
	int mousex=0,mousey=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		mousex=0;
		mousey=10;
		msg="Mouse cliked";
		repaint();
	}
	public void mouseEntered(MouseEvent e)
	{
		mousex=0;
		mousey=10;
		msg="Mouse entered";
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		mousex=0;
		mousey=10;
		msg="Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		mousex=e.getX();
		mousey=e.getY();
		msg="Down";
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		mousex=e.getX();
		mousey=e.getY();
		msg="UP";
		repaint();
	}	
	//mouse dragged
	public void mouseDragged(MouseEvent e)
	{
		mousex=e.getX();
		mousey=e.getY();
		msg="*";
		showStatus("Dragging mouse at"+mousex+","+mousey);
		repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		showStatus("Moving mouse at"+e.getX()+","+e.getY());
	
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mousex,mousey);
	}
}