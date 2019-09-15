import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="AdapterDemo" height="300" width="300"></applet>

public class AdapterDemo extends Applet
{
	
	public void init()
	{
		addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent me)
	{
		showStatus("mouse clicked");
		}});
		
	}

	

}