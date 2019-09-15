import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="AppletList" height="300" width="300"></applet>
public class AppletList extends Applet implements ActionListener
{
	List colours,fruits;
	String msg1,msg2,msg;
	public void init()
	{
		colours=new List(10,true);
		fruits=new List(10,false);
		colours.add("Yellow",2);
		colours.add("red",1);
		colours.add("pink",3);
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("orange");
		
		add(colours);
		add(fruits);
		colours.addActionListener(this);
		fruits.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		int idx[];
		msg="Current selelction is:";
		msg+=colours.getSelectedItem();
		g.drawString(msg,10,80);
		msg1="item count of fruits is:";
		msg1+=fruits.getItemCount();
		g.drawString(msg1,10,110);
		msg2="Current selelction of fruits is:";
		idx=fruits.getSelectedIndexes();
		for(int i=0;i<idx.length;i++)
		{
			msg2+=fruits.getItem(idx[i])+" ";
		}
		g.drawString(msg2,10,140);
	
	}
}    