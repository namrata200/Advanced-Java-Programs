import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AnonymousInnerClassDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MouseAdapter()
		{
		public void mouseClicked(MouseEvent me)
		{
			showStatus("Mouse Clicked");
		}
		});
	}
}