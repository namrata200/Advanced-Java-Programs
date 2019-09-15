import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheckboxGroupDemo extends Applet implements ItemListener
{
	Checkbox cbmale,cbfemale;
	CheckboxGroup cbg;
	String msg;
	Label lgender;
	public void init()
	{
		lgender=new Label("Gender");
		cbg=new CheckboxGroup();
		cbmale=new Checkbox("Male");
		cbfemale=new Checkbox("Female");
		
		add(lgender);
		add(cbmale);
		add(cbfemale);
		cbmale.addItemListener(this);
		cbfemale.addItemListener(this);
	
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="current state of checkbox";
		g.drawString(msg,80,90);
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,100,120);	
	}
	
}