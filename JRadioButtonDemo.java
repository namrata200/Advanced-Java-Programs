import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JRadioButtonDemo extends JApplet implements ActionListener
{
	JTextField j1;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		JRadioButton r1=new JRadioButton("OK",false);
		r1.addActionListener(this);
		contentPane.add(r1);

		JRadioButton r2=new JRadioButton("cancel");
		r2.addActionListener(this);
		contentPane.add(r2);
		
		ButtonGroup bgp=new ButtonGroup();
		bgp.add(r1);
		bgp.add(r2);
		
		j1=new JTextField(20);
		contentPane.add(j1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		j1.setText(ae.getActionCommand());
		repaint();
	}
}