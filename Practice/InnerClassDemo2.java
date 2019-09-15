import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="InnerClassDemo2" height="300" width="300"></applet>

public class InnerClassDemo2 extends Applet
{
	public void init()
	{
		addKeyListener(new MyKeyAdapter());
	}	
	class MyKeyAdapter extends KeyAdapter
	{
		public void keyReleased(KeyEvent ke)
		{
			showStatus("UP");
		}
	}
}