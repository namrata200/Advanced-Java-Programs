import java.util.*;
import java.awt.*;
import java.applet.*;

public class AppletRectangle extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(10,20,100,200);
	}
}