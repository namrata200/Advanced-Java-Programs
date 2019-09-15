import java.awt.*;
import java.awt.event.*;
public class Freame2 extends Frame
{
	public Freame2()
	{
		Panel p1=new Panel();
		Button b1=new Button("OK");
		
		p1.add(b1);
		add(p1);
	}
	public static void main(String args[])
	{
		Freame2 f1=new Freame2();
		f1.setVisible(true);
		f1.setSize(300,300);
	}	
}