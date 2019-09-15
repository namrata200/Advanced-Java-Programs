import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="AnonymousInnerClassDemo" height="300" width="300"></applet>

public class AnonymousInnerClassDemo extends Applet
{
	public void init()
	{
		addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent ke)
			{
				showStatus("key up");
			}
		});
	}
}