import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelDemo extends JApplet
{
	public void init()
	{
		ImageIcon i1=new ImageIcon("a.jpg");
		JLabel l1=new JLabel(i1);
		getContentPane().add(l1);
	}
}