import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="FileDialogDemo" height="300" width="300"></applet>

class SampleFrame extends Frame
{
	public SampleFrame(String title)
	{
		super(title);
		addWindowListener(new MyWindowListener(this));
	}
}
class MyWindowListener extends WindowAdapter
{
	SampleFrame sampleframe;
	public MyWindowListener(SampleFrame sampleframe)
	{
		this.sampleframe=sampleframe;
	}
	public void windowClosing(WindowEvent we)
	{
		sampleframe.setVisible(false);
	}
}
public class  FileDialogDemo
{
	public static void main(String args[])
	{
		Frame f=new Frame("Feame");
		f.setVisible(true);
		f.setSize(300,300);
		FileDialog fd=new FileDialog(f,"FileDialog",FileDialog.LOAD);
		fd.setVisible(true);
	}
	
}	