import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ImageIconDemo extends JApplet
{
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		ImageIcon i1=new ImageIcon("a.jpg");
		JLabel l1=new JLabel("OK",i1,JLabel.CENTER);
		l1.setBounds(0,0,900,700);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(l1,v,h);
		contentPane.add(jsp,BorderLayout.CENTER);
	}
}