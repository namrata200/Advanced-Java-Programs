import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="MenubarDemo" height="300" width="300"></applet>

class FrameDemo extends Frame
{
	public FrameDemo(String title)
	{
		super(title);
		MenuBar mbar=new MenuBar();
		setMenuBar(mbar);
		Menu file=new Menu("File");
		MenuItem item1=new MenuItem("Open");
		MenuItem item2=new MenuItem("save");
		MenuItem item3=new MenuItem("save as");
		MenuItem item4=new MenuItem("New");
		file.add(item4);
		file.add(item1);
		file.add(item2);
		file.add(item3);
		mbar.add(file);
		
		Menu edit=new Menu("Edit");
		MenuItem item1=new MenuItem("Cut");
		MenuItem item2=new MenuItem("copy");
		MenuItem item3=new MenuItem("paste");
		MenuItem item4=new MenuItem("FOnts");
		edit.add(item4);
		edit.add(item1);
		edit.add(item2);
		edit.add(item3);
		mbar.add(edit);
		
		
	}
}
public class MenubarDemo extends Applet
{
	Frame f;
	public void init()
	{
		f=new Frame("Frame Example");
		f.setSize(300,300);
	}
	public void start()
	{
		f.setVisible(true);
	}
	public void stop()
	{
		f.setVisible(false);
	}
}