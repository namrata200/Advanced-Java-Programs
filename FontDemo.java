import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FontDemo extends Applet 
{
	Font f1,f2,f3;
	public void init()
	{
		f1=new Font("Arial",Font.BOLD,28);
		f2=new Font("Courier",Font.ITALIC,18);
		f3=new Font("Forte",Font.PLAIN,20);
	}
	public void paint(Graphics g)
	{
		g.drawString("Simple",10,10);
		g.setFont(f1);
		g.drawString("BOLD",40,40);
		g.setFont(f2);
		g.drawString("Courier",120,120);
		g.setFont(f3);
		g.drawString("Forte",140,140);
		String se=String.valueOf(f1.getSize());
		g.drawString(se,190,190);
		se=String.valueOf(f1.getFamily());
		g.drawString(se,200,200);
		se=String.valueOf(f1.getName());
		g.drawString(se,210,210);
		se=String.valueOf(f1.getStyle());
		g.drawString(se,230,230);
				se=String.valueOf(f1.isItalic());
		g.drawString(se,250,250);
				se=String.valueOf(g.getFontList());
		g.drawString(se,300,300);
		}
}