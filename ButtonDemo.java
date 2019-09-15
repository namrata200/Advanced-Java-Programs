import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonDemo extends Applet implements ActionListener
{
	Button BYellow,BOrange; 
	public void init()
	{
		BYellow=new Button("yellow");
		BOrange=new Button("Orange");
		add(BYellow);
		add(BOrange);
		BYellow.addActionListener(this);
		BOrange.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("yellow"))
		{
			setBackground(Color.yellow);
		}
		else if(str.equals("Orange"))
		{
			setBackground(Color.ORANGE);
		}
	}
}