 import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class BorderLayout1 extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		
		Button beast=new Button("Right");
		Button bwest=new Button("Left");
		Button bnorth=new Button("Top");
		Button bsouth=new Button("Bottom");
		
		TextArea Tcenter=new TextArea("This is center");
		
		//add controls to the Applet Window
		
		add(beast,BorderLayout.EAST);
		add(bwest,BorderLayout.WEST);
		add(bnorth,BorderLayout.NORTH);
		add(bsouth,	BorderLayout.SOUTH);
		add(Tcenter,BorderLayout.CENTER);
	}
}