import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SBDemo extends Applet implements AdjustmentListener
{
	int width,height;
	Scrollbar vertSB,horzSB;
	public void init()
	{
		width=Integer.parseInt(getParameter("width"));
		height=Integer.parseInt(getParameter("height"));
		vertSB=new Scrollbar(Scrollbar.VERTICAL);
		horzSB=new Scrollbar(Scrollbar.HORIZONTAL);
		vertSB.setBounds(250,20,300,30);
		add(vertSB);
		add(horzSB);
		vertSB.addAdjustmentListener(this);
		horzSB.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
}