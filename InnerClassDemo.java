import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class InnerClassDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter());
	}
	class MyMouseAdapter extends MouseAdapter
	{
		public void mouseClicked(MouseEvent me)
		{
			showStatus("Mouse Clicked");
		}
	}
}