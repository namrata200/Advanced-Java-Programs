import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class FillRectangle extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(10,20,200,80);
	}
}