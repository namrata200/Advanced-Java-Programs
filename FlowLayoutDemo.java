import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class FlowLayoutDemo extends Applet 
{
	Button b1,b2;
	label l1,l2;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER));
		b1=new Button("First");
		b2=new Button("Second");
		l1=new Label("First");
		l2=new Label("Second");
		add(l1);
		add(b1);
		add(l2);
		add(b2);
	}
}