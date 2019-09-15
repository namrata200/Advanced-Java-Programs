import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JTextFieldDemo extends JApplet
{
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		JTextField j1=new JTextField(20);
		contentPane.add(j1);
		j1.setText(String.valueOf(j1.getSize()));
	}
}