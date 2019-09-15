import java.util.*;
import java.awt.*;
import java.applet.*;

public class AppletButton extends Applet
{
	Button b1;
	public void init()
	{
		setBackground(Color.cyan);
		b1=new Button("Button 1");
		add(b1);
	}
}