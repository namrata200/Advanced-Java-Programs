import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="AddDemo" height="300" width="300"></applet>
public class AddDemo extends Applet implements ActionListener
{
	TextField tno1,tno2;
	String msg;
	Button bAdd;
	public void init()
	{
		Label l1=new Label("Number 1:");
		Label l2=new Label("Number 2:");
		tno1=new TextField(10);
		tno2=new TextField(10);
		bAdd=new Button("Addition");
		add(l1);
		add(tno1);
		add(l2);
		add(tno2);
		add(bAdd);
		bAdd.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bAdd)
		{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int n3=n1+n2;
			
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(n3,10,70);
	}
}