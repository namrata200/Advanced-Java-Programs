import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="AppletPaint" height="300" width="300"></applet>

public class AppletPaint extends Applet 
{
	
	public void paint(Graphics g)
	{
		g.drawString("msg",10,80);
	}
}