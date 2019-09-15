import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator1 implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel Lno1,Lno2,Lans;
	JTextField tno1,tno2,tans;
	JButton badd,bsub,bmul,bdiv,breset,bexit;
	public Calculator1()
	{
		f1=new JFrame("Calculator");
		f1.setSize(400,400);
		f1.setVisible(true);
		p1=new JPanel();
		f1.add(p1);
		p1.setBackground(Color.blue);
		GridLayout g1=new GridLayout(6,2);
		p1.setLayout(g1);
		Lno1=new JLabel("Number 1");
		Lno2=new JLabel("Number 2");
		Lans=new JLabel("Answer");
		tno1=new JTextField(10);
		tno2=new JTextField(10);
		tans=new JTextField(20);
		badd=new JButton("+");
		bsub=new JButton("-");
		bmul=new JButton("*");
		bdiv=new JButton("/");
		breset=new JButton("Reset");
		bexit=new JButton("Exit");
		
		p1.add(Lno1);
		p1.add(tno1);
		p1.add(Lno2);
		p1.add(tno2);
		p1.add(Lans);
		p1.add(tans);
		p1.add(badd);
		p1.add(bsub);
		p1.add(bmul);
		p1.add(bdiv);
		p1.add(breset);
		p1.add(bexit);
		
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		breset.addActionListener(this);
		bexit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==badd)
		{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int ans=n1+n2;
			tans.setText(Integer.toString(ans));
		}
		else if(e.getSource()==bsub)
		{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int ans=n1-n2;
			tans.setText(Integer.toString(ans));
		}
		else if(e.getSource()==bmul)
		{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int ans=n1*n2;
			tans.setText(Integer.toString(ans));
		}
		else if(e.getSource()==bdiv)
		{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int ans=n1/n2;
			tans.setText(Integer.toString(ans));
		}
		else if(e.getSource()==breset)
		{
			tno1.setText("");
			tno2.setText("");
			tans.setText("");
		}
		else if(e.getSource()==bexit)
		{

			System.exit(0);
		}
		
	}
	public static void main(String args[])
	{
		Calculator1 c1=new Calculator1();
	}		
}		