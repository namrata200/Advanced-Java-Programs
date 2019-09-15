import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="AppletFlowLayout" height="300" width="300"></applet>

public class AppletFlowLayout extends Applet
{
	Label l1,l2,l3;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		l1=new Label("ok");
		l2=new Label("canlcle");
		l3=new Label("fuck");
		add(l1);
		add(l2);
		add(l3);
	}
}