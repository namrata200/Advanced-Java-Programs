import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class BorderLayoutDemo2 extends Applet
{
	TextField t1,t2,t3,t4;
	TextArea ta;
	public void init()
	{
		setLayout(new BorderLayout());
		t1=new TextField("North");
		t2=new TextField("South");
		t3=new TextField("East");
		t4=new TextField("West");
		ta=new TextArea("Hello it is text area");
		
		add(t1,BorderLayout.NORTH);
		add(t2,BorderLayout.SOUTH);
		add(t3,BorderLayout.EAST);
		add(t4,BorderLayout.WEST);
		add(ta,BorderLayout.CENTER);
	}
}