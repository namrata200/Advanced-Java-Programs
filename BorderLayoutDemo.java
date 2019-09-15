import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class BorderLayoutDemo extends Applet
{
	Button bEAST,bWEST,bNORTH,bSOUTH;
	TextArea t1;
	public void init()
	{
		setLayout(new BorderLayout());
		bEAST=new Button("Right");
		bWEST=new Button("Left");
		bNORTH=new Button("Top");
		bSOUTH=new Button("Bottom");
		add(bEAST,BorderLayout.EAST);
		add(bWEST,BorderLayout.WEST);
		add(bNORTH,BorderLayout.NORTH);
		add(bSOUTH,BorderLayout.SOUTH);
		t1=new TextArea("dakdkdadaugdyaygdyadvahgdfathvgjvhjvgysbvkjhuihvdkj");
		add(t1,BorderLayout.CENTER);
	}
}