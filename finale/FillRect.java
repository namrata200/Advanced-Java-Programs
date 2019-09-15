import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="FillRect" height="300" width="300"></applet>



public class FillRect extends Applet
{
	String FontList[],msg;
	public void paint(Graphics g)
	{
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList=ge.getAvailableFontFamilyNames();
		for(int i=0;i<FontList.length;i++)
		{
			msg+=FontList[i];
		}
		g.drawString(msg,10,40);
	}
	
	
}