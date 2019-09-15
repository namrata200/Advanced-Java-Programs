import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swingFive extends JFrame implements ActionListener
{
	JLabel luname,lpass;
	JTextField tuname,v;
	JPasswordField tpass;
	JButton blogin,breset;
	GridLayout gl;
	
	public swingFive()
	{
		Container c=getContentPane();
		gl=new GridLayout(4,2,5,5);
		c.setLayout(gl);
		luname=new JLabel("User Name");
		lpass=new JLabel("Password");
		v=new JTextField("");
		
		tuname=new JTextField(10);
		tpass=new JPasswordField(10);
		blogin=new JButton("Login");
		breset=new JButton("Reset");
		c.add(luname);
		c.add(tuname);
		c.add(lpass);
		c.add(tpass);
		c.add(blogin);
		c.add(breset);
		c.add(v);
		
		//register event
		
		blogin.addActionListener(this);
		breset.addActionListener(this);
		v.setEditable(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==blogin)
		{
			String s1=tuname.getText();
			String s2=tpass.getText();
			if(s1.equals("admin"))
			{
				if(s2.equals("admin"))
				{
					v.setForeground(Color.GREEN);
					v.setText("Valid Login");
				}
				else
				{
					v.setForeground(Color.RED);
					v.setText("InValid Password");
				}
			}
			else
				{
					v.setForeground(Color.RED);
					v.setText("InValid Username");
				}
		}
		if(e.getSource()==breset)
		{
			tuname.setText("Enter Username");
			tpass.setText("Enter Password");
		}
	}
	public static void main(String[] args)
	{
		swingFive pf=new swingFive();
		pf.setSize(300,300);
		pf.setVisible(true);
	}
}