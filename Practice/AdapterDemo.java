import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="AdapterDemo" height="300" width="300"></applet>

public class AdapterDemo extends Applet
{
	public void init()
	{
		addKeyListener(new MyKeyAdapter(this));
	}
}
class MyKeyAdapter extends KeyAdapter
{
	AdapterDemo adapterdemo;
	public MyKeyAdapter(AdapterDemo adapterdemo)
	{
		this.adapterdemo=adapterdemo;
	}
	public void keyReleased(KeyEvent ke)
	{
		adapterdemo.showStatus("key up");
	}
}