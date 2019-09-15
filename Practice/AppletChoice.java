import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="AppletChoice" height="300" width="300"></applet>
public class AppletChoice extends Applet implements ItemListener
{
	Choice colour,fruits;
	String msg1,msg2;
	public void init()
	{
		colour=new Choice();
		fruits=new Choice();
		colour.add("Yellow");
		colour.add("Blue");
		colour.add("Red");
		fruits.add("Mango");
		fruits.add("banana");
		fruits.add("Chicoo");
		colour.select("Blue");
		add(colour);
		add(fruits);
		colour.addItemListener(this);
		fruits.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg1="Selction of colour is:";
		msg1+=colour.getSelectedItem();
		g.drawString(msg1,70,70);
		msg2="Selction of fruits is:";
		msg2+=fruits.getSelectedItem();
		g.drawString(msg2,70,90);
		}
}