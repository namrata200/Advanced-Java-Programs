import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AdapterDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
	}
}
class MyMouseAdapter extends MouseAdapter
{
	AdapterDemo adapterdemo;
	public MyMouseAdapter(AdapterDemo adapterdemo)
	{
		this.adapterdemo=adapterdemo;
	}
	public void mouseClicked(MouseEvent me)
	{
		adapterdemo.showStatus("Mouse Clicked");
	}
}