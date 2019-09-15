import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="KeyDemo" height="300" width="300"></applet>

public class KeyDemo extends Applet implements KeyListener
{
	String msg="";
	int x,y;
	public void init()
	{
		addKeyListener(this);
	}
	public void keyTyped(KeyEvent ke)
	{
		x=0;
		y=10;
		msg+=ke.getKeyChar();
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("key up");
	}
	public void keyPressed(KeyEvent ke)
	{
		x=0;
		y=10;
		showStatus("Key Down");
		int ch=ke.getKeyCode();
		switch(ch)
		{
			case KeyEvent.VK_F1:
								msg+="f1";
								break;
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}