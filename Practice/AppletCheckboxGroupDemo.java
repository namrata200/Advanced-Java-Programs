import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="AppletCheckboxGroupDemo" height="300" width="300"></applet>
public class AppletCheckboxGroupDemo extends Applet implements ItemListener
{
	CheckboxGroup cbg;
	Checkbox cb1,cb2;
	String msg;
	public void init()
	{
		cbg=new CheckboxGroup();
		cb1=new Checkbox("cb1",cbg,true);
		cb2=new Checkbox("cb2",cbg,false);
		add(cb1);
		add(cb2);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current state is";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,40,40);
	}
}