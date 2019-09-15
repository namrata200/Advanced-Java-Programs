import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ShowStatus extends Applet implements ActionListener
{
	Button b1,b2;
	public void init()
	{
		b1=new Button("b1");
		b2=new Button("b2");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			showStatus("Button one");
		}
		else if(e.getSource()==b2)
		{
			showStatus("Button two");
		}
	}
	
}