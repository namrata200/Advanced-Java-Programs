import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BasicEventInSwing extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4;
	JPanel p;
	public BasicEventInSwing()
	{
		getContentPane().setLayout(new FlowLayout());
		p=new JPanel();
		getContentPane().add(p);
		p.setBackground(Color.BLUE);
		b1=new JButton("YELLOW");
		b2=new JButton("PINK");
		b3=new JButton("ORANGE");
		b4=new JButton("Quit");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		getContentPane().setBackground(Color.GREEN);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("YELLOW"))
		{
			getContentPane().setBackground(Color.YELLOW);
		}
		else if(str.equals("PINK"))
		{
			getContentPane().setBackground(Color.PINK);
		}
		else if(str.equals("ORANGE"))
		{
			getContentPane().setBackground(Color.ORANGE);
		}
		else if(str.equals("Quit"))
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		BasicEventInSwing b=new BasicEventInSwing();
		b.setSize(500,500);
		b.setVisible(true);

	}
}