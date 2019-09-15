import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionTester2 extends JFrame
{
	JLabel l1;
	public ActionTester2()
	{
		getContentPane().setLayout(new FlowLayout());
		JPanel p=new JPanel();
		l1=new JLabel("OKKKKK");
		getContentPane().add(l1);
	}
	public static void main(String args[])
	{
		ActionTester2 t=new ActionTester2();
		t.setSize(300,300);
		t.setVisible(true);
	}
}