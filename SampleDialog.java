import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class SampleDialog extends Dialog implements ActionListener
{
		SampleDialog(Frame parent,String title)
		{
			Button b1,b2;
			b1=new Button("OK");
			b2=new Button("Cancle");
			add(b1);
			add(b2);
			b1.addActionListener(this);
			b2.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae)
		{
			dispose();
		}
		public void paint(String args[])
		{
			g.drawString("This is dialog box");
		}
}
public class DialogDemo extends Applet
{
	public void init()
	{
		setSize(300,300);
	}
}