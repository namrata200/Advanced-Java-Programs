import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FrameDemo1 extends Frame implements KeyListener
{
	String s;
	Label l1;
	public FrameDemo1()
	{
		addKeyListener(this);
		l1=new Label();
		add(l1);
	}
	public void keyPressed(KeyEvent ke)
	{
		s="key pressed";
		l1.setText(s);
	}
	public static void main(String args[]){
		FrameDemo framedemo=new FrameDemo();
		framedemo.setSize(300,300);
		framedemo.setVisible(true);
		framedemo.setTitle("Awt frame window");
	}
}
