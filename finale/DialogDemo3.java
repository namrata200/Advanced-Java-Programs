import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogDemo3
{
	private static Dialog d;
	DialogDemo3()
	{
		Frame f=new Frame();
		d=new Dialog(f,"Dialog",true);
		d.setLayout(new FlowLayout());
		Button b1=new Button("ok");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				DialogDemo3.d.setVisible(false);
			}
		});
		d.add(new Label("clic nidna"));
		d.add(b1);
		d.setSize(300,300);
		d.setVisible(true);
		
	}
	public static void main(String args[])
	{
		new DialogDemo3();
	}
}  