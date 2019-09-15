import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.applet.*;

public class FrameDemo extends Frame
{
	Button b1=new Button("OK");
	public FrameDemo()
	{
		add(b1);
	}
	public static void main(String args[])
	{
		FrameDemo f1=new FrameDemo();
		f1.setVisible(true);f1.setSize(300,300);
	}
}  
