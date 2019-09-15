import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionTester1 extends JFrame implements ActionListener
{
	int clicked;
	final String str="button is clicked=";
	JButton b1,b2;
	JLabel l1;
	
	public ActionTester1()
	{
		
		getContentPane().setLayout(new FlowLayout());
		//getContentPane() set before using swing and awt its very important without it object cannot displayed & add panel to it
		JPanel p=new JPanel();
		b1=new JButton("Clicked Here");
		b2=new JButton("Quit");
		
		p.setLayout(new FlowLayout());
		
		p.add(b1);
		p.add(b2);
		getContentPane().add(p);
		
		l1=new JLabel(str+clicked,JLabel.CENTER);
		getContentPane().add(l1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s2=e.getActionCommand();
		System.out.println(s2);
		if(s2.equals("Clicked Here"))
		{
			clicked++;
			l1.setText(str+clicked);
		}
		else if(s2.equals("Quit"))
		{ 
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		ActionTester1 t=new ActionTester1();
	
	}
}