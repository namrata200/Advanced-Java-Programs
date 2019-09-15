import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageIconDemo extends JFrame implements ActionListener
{
	JButton b1;
	ImageIcon i1;
	JPanel p;
	ImageIconDemo()
	{
		super("Iamge icon demo");
		i1=new ImageIcon("a.jpg");
		p=new JPanel();
		Container c=getContentPane();
		
		b1=new JButton(i1);
		p.add(b1);
		b1.addActionListener(this);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(p,v,h);
		c.add(jsp);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		ImageIconDemo id=new ImageIconDemo();
		id.setSize(300,300);
		id.setVisible(true);
	}
}  