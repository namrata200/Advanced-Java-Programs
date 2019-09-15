import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class GridLayoutDemo extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(4,4));
		
		for(int i=0;i<=15;i++)
		{
			add(new Button(""+i));
		}
	}
}