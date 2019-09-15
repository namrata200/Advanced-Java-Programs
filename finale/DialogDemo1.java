import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="DialogDemo1" width=250 height=250></applet>

// Create a subclass of Dialog.
class SampleDialog extends Dialog implements ActionListener {
SampleDialog(Frame parent, String title) {
super(parent, title, false);
setLayout(new FlowLayout());
setSize(300, 200);
add(new Label("Press this button:"));
Button b;
add(b = new Button("Cancel"));
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
dispose();
}
public void paint(Graphics g) {
g.drawString("This is in the dialog box", 10, 70);
}
}
// Create a subclass of Frame.
class MenuFrame extends Frame{
  MenuFrame(String title)
  {
	  super(title);
	  Button b1=new Button("ok");
	  My hand=new My(this);
	  b1.addActionListener(hand);
  }
}
class My implements ActionListener
{
	MenuFrame menuframe;
	My(MenuFrame menuframe)
	{
		this.menuframe=menuframe;
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(b1.getSource()==b1)
		{
			SampleDialog sd=new SampleDialog(menuframe,"New ");
			sd.setVisible(true);
		}
	}
}
// Create frame window.
public class DialogDemo1 extends Applet {
Frame f;
public void init() {
f = new MenuFrame("Menu Demo");
f.setSize(300,300);
f.setVisible(true);
}
public void start() {
f.setVisible(true);
}
public void stop() {
f.setVisible(false);
}
}