import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JButtonDemo extends JApplet implements ActionListener
{
	JTextField j1;
	JButton b1,b2;
	JPanel p;
	public void init()
	{
		p=new JPanel();
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		ImageIcon i1=new ImageIcon("a.jpg");
		ImageIcon i2=new ImageIcon("logo.bmp");
		b1=new JButton(i1);
		b1.setActionCommand("A");
		b1.addActionListener(this);
		p.add(b1);
		
		b2=new JButton(i2);
		b2.setActionCommand("B");
		b2.addActionListener(this);
		p.add(b2);
		
		j1=new JTextField(20);
		p.add(j1);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(p,v,h);
		contentPane.add(jsp,BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent ae)
	{
		j1.setText(ae.getActionCommand());
		repaint();
	}
}