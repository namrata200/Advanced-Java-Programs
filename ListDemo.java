import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ListDemo extends Applet implements ActionListener
{
	String msg;
	List csub;
	public void init()
	{
		csub=new List(5,true);
		csub.add("JP2");
		csub.add("JSP");
		csub.add("CS");
		csub.add("ST");
		csub.add("AND");
		add(csub);
		csub.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="selected item are:";
		msg+=csub.getSelectedItem();
		g.drawString(msg,10,40);
	}
}