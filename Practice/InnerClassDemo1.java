import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="InnerClassDemo1" height="300" width="300"></applet>

public class InnerClassDemo1 extends Applet
{
	public void init()
	{
		addKeyListener(new MyKeyAdapter(this));
	}	
}
class MyKeyAdapter extends KeyAdapter
{
	InnerClassDemo1 innerclassdemo1;
	public MyKeyAdapter(InnerClassDemo1 innerclassdemo1)
	{
		this.innerclassdemo1=innerclassdemo1;
	}
	public void keyReleased(KeyEvent ke)
	{
		innerclassdemo1.showStatus("UP");
	}
}