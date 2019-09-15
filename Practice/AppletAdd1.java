import java.awt.*;
import java.awt.event.*;
import java.applet.*;



public class AppletAdd1 extends Applet implements ActionListener
{
	Button bAdd;
	String msg;
	TextField tno1,tno2;
	public void init()
	{
		tno1=new TextField(20);
		tno2=new TextField(20);
		bAdd=new Button("Add");
		add(tno1);
		add(tno2);
		add(bAdd);
		bAdd.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(tno1.getText());
		int n2=Integer.parseInt(tno2.getText());
		if(ae.getSource()==bAdd)
		{
			int n3=n1+n2;
		}
		
	}
	public void paint(Graphics g)
	{
		g.drawString("msg",10,80);
	}
}