import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="SBDemo" height="300" width="300"></applet>
public class SBDemo extends Applet implements AdjustmentListener
{
	Scrollbar vertSB,horSB;
	int height,width;
	public void init()
	{
		height=Integer.parseInt(getParameter("height"));
		width=Integer.parseInt(getParameter("width"));
		vertSB=new Scrollbar(Scrollbar.VERTICAL,0,1,0,height);
		horSB=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,width);
		add(vertSB);
		add(horSB);
		vertSB.addAdjustmentListener(this);
		horSB.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
}
