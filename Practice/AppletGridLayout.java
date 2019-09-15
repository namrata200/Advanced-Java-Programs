import java.awt.*;
import java.applet.*;

//<applet code="AppletGridLayout" height="300" width="300"></applet>
public class AppletGridLayout extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++)
		{
			add(new Button(i+""));
		}
	}
}