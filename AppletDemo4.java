import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletDemo4 extends Applet implements ActionListener
{
	Button badd;
	TextField t1,t2,tans;
	public void init()
	{
		t1=new TextField(10);
		t2=new TextField(10);
		tans=new TextField(10);
		badd=new Button("Add");
		add(t1);
		add(t2);
		add(tans);
		add(badd);
		badd.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int n3=n1+n2;
		tans.setText(String.valueOf(n3));
		repaint();
	}
}