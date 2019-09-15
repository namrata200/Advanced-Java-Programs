import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class GridLayout1 extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(5,3));
		for(int i=1;i<16;i++)
		{
			add(new Button(""+i));
		}		
	}
}