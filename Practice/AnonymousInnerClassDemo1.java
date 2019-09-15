import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="AnonymousInnerClassDemo1" height="300" width="300"></applet>

public class AnonymousInnerClassDemo1 extends Applet
{
	public void init()
	{
		addKeyListener(new KeyAdapter()
		{		
			public void keyReleased(KeyEvent ke)
			{
				showStatus("UP");
			}
		});
	}
}