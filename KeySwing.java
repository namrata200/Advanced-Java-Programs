import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeySwing extends JFrame implements KeyListener
{
	int X=20,Y=30;
	String msg="KeyEvents--->";
	public KeySwing()
	{
		JPanel p=new JPanel();
		addKeyListener(this);
		p.requestFocus();
		getContentPane().setBackground(Color.green);
		getContentPane().setForeground(Color.blue);
	}
	public void keyPressed(KeyEvent k)
	{
		showStatus("KeyDown");
		int key=k.getKeyCode();
		switch(key) 
		{
			case KeyEvent.VK_UP:
				showStatus("Move to Up");
				break;
			case KeyEvent.VK_DOWN:
				showStatus("Move to Down");
				break;
			case KeyEvent.VK_LEFT:
				showStatus("Move to Left");
				break;
			case KeyEvent.VK_RIGHT:
				showStatus("Move to Right");
				break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent k)
	{
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent k)
	{
		msg+=k.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}
}