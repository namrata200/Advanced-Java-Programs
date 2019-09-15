import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="MenubarDemo" height="300" width="300"></applet>

class FrameDemo extends Frame
{
	Menu file,edit;
	FrameDemo(String title)
	{
		super(title);
		MenuBar mbar=new MenuBar();
		setMenuBar(mbar);
		file=new Menu("File");
		MenuItem item1=new MenuItem("Open");
		MenuItem item2=new MenuItem("save");
		MenuItem item3=new MenuItem("save as");
		MenuItem item4=new MenuItem("New");
		file.add(item4);
		file.add(item1);
		file.add(item2);
		file.add(item3);
		mbar.add(file);
		
		edit=new Menu("Edit");
		MenuItem eitem1=new MenuItem("Cut");
		MenuItem eitem2=new MenuItem("copy");
		MenuItem eitem3=new MenuItem("paste");
		MenuItem eitem4=new MenuItem("FOnts");
		edit.add(eitem4);
		edit.add(eitem1);
		edit.add(eitem2);
		edit.add(eitem3);
		mbar.add(edit);
		
		
	}
}
public class MenubarDemo extends Applet 
{
	Frame f;
	public void init() 
	{
		f = new FrameDemo("Menu Demo");
		f.setSize(300,300);
		f.setVisible(true);
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