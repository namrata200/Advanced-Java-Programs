import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ChoiceDemo extends Applet implements ItemListener
{
	String msg;
	int msg1,msg2;
	Choice csub;
	public void init()
	{
		csub=new Choice();
		csub.add("JP2");
		csub.add("JSP");
		csub.add("CS");
		csub.add("ST");
		csub.add("AND");
		add(csub);
		csub.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="selected item are:";
		msg+=csub.getSelectedItem();
		g.drawString(msg,10,40);
		msg1=csub.getSelectedIndex();
		String n1="Index of selected item is:"+Integer.toString(msg1);
		g.drawString(n1,10,50);
		msg2=csub.getItemCount();
		String n2="Total number of item in list is:"+Integer.toString(msg2);
		g.drawString(n2,10,60);		
	}
}