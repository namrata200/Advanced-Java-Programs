import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletDemo2 extends Applet
{
	Label l1,l2;
	Button b1;
	public void init()
	{
		l1=new Label("Hello");
		l2=new Label("Goa");
		b1=new Button("Click");
		add(l1);
		add(l2);
		add(b1);
	}
}
