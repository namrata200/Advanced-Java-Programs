import java.awt.event.*;
import java.awt.*;
import java.applet.*;

//<applet code="DialogDemo" height="300" width="300"></applet>

class FrameDemo extends Frame
{
	FrameDemo(String title)
	{
		super(title);
		addWindowListener(new My(this));
	}	
}
class My extends WindowAdapter
{
	FrameDemo framedemo;
	My(FrameDemo framedemo)
	{
		this.framedemo=framedemo;
	}
	public void windowClosing(WindowEvent we)
	{
		framedemo.setVisible(false);
	}
}
class DialogDemo
{
	public static void main(String args[])
	{
		Frame f=new FrameDemo("Frame Demo");
		f.setSize(300,300);
		f.setVisible(true);
		FileDialog fd=new FileDialog(f,"FileDialog",FileDialog.SAVE);
		fd.setVisible(true);
	}
	
}