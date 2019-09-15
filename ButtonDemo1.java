import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonDemo1 extends Applet implements ActionListener
{
	Button b[]=new Button[10];
	String msg="";
	public void init()
	{
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
			add(b[i]);
			b[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		msg="you clicked"+str;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,70);
	}
}