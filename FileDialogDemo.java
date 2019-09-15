import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class sampleframe extends Frame
{
	sampleframe(String title)
	{
		super(title);
		MyWindowAdapter m1=new MyWindowAdapter(this);
		addWindowListener(m1);
	}
}
class MyWindowAdapter extends WindowAdapter
{
	sampleframe s;
	MyWindowAdapter(sampleframe s)
	{
		this.s=s;
	}
	public void windowClosing(WindowEvent we)
	{
		s.setVisible(false);
	}
	
}
public class FileDialogDemo extends Applet
{
	public static void main(String args[])
	{
		Frame f;
		Button b1;
		b1=new Button("Open");
		add(b1);
		f=new sampleframe("hello");
		f.setSize(300,300);
		f.setVisible(true);
		FileDialog fd=new FileDialog(f,"File s Diaolo");
		fd.setVisible(true);
	}
}