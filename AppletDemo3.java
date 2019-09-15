import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletDemo3 extends Applet implements ActionListener 
{
	Button bOK,bCANCLE;
	String str;
	public void init()
	{
		
		bOK=new Button("OK");
		bCANCLE=new Button("CANCLE");
		add(bOK);
		add(bCANCLE);
		bOK.addActionListener(this);
		bCANCLE.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bOK)
		{
			str="you clicked ok";
			
		}
		else if(ae.getActionCommand()=="CANCLE");
		{
			str="You clicked cancle";
			
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,200);
	}
}
