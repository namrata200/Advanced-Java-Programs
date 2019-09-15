import java.util.*;
import java.awt.*;
import java.applet.*;

public class AppletLabel extends Applet
{
	Label l1,l2;
	public void init()
	{
		l1=new Label("Label 1");
		l2=new Label("Label 2",Label.LEFT);
		add(l1);
		add(l2);
	}
}