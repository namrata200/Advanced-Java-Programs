import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="MenuDemo" width=250 height=250></applet>

// Create a subclass of Frame
class MenuFrame extends Frame 
{
	String msg = "";
	CheckboxMenuItem debug, test;
	MenuFrame(String title) 
	{
		super(title);
		// create menu bar and add it to frame
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		// create the menu items
		Menu file = new Menu("File");
		MenuItem item1, item2, item3, item4, item5;
		file.add(item1 = new MenuItem("New..."));
		file.add(item2 = new MenuItem("Open..."));
		file.add(item3 = new MenuItem("Close"));
		file.add(item4 = new MenuItem("-"));
		file.add(item5 = new MenuItem("Quit..."));
		mbar.add(file);
		Menu edit = new Menu("Edit");
		MenuItem item6, item7, item8, item9;
		edit.add(item6 = new MenuItem("Cut"));
		edit.add(item7 = new MenuItem("Copy"));
		edit.add(item8 = new MenuItem("Paste"));
		edit.add(item9 = new MenuItem("-"));
		Menu sub = new Menu("Special");
		MenuItem item10, item11, item12;
		sub.add(item10 = new MenuItem("First"));
		sub.add(item11 = new MenuItem("Second"));
		sub.add(item12 = new MenuItem("Third"));
		edit.add(sub);
		// these are checkable menu items
		debug = new CheckboxMenuItem("Debug");
		edit.add(debug);
		test = new CheckboxMenuItem("Testing");
		edit.add(test);
		mbar.add(edit);
	}
}
// Create frame window.
public class MenuDemo extends Applet 
{
	Frame f;
	public void init() 
	{
		f = new MenuFrame("Menu Demo");
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