import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="AppletBorderLayout" height="300" width="300"></applet>

public class AppletBorderLayout extends Applet
{
	Label l1,l2,l3,l4;
	TextArea text;
	public void init()
	{
		setLayout(new BorderLayout());
		l1=new Label("ok");
		l2=new Label("canlcle");
		l3=new Label("fuck");
		l3=new Label("fuck");
		l4=new Label("ghjkl");
		String var="sdvvvjkvnvnn";
		text=new TextArea(var);
		add(l1,BorderLayout.NORTH);
		add(l2,BorderLayout.SOUTH);
		add(l3,BorderLayout.EAST);
		add(l4,BorderLayout.WEST);
		add(text,BorderLayout.CENTER);
	}
	public void Insets getInsets()
	{
		return new Insets(10,10,10,10);
	}
}