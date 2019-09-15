import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="AppletTextArea" height="300" width="300"></applet>
public class AppletTextArea extends Applet
{
	public void init()
	{
		String var="dhadjjhjfjksbjskbjbvsbvjkdsvbjhvbjvbjvbjv\n"+"ddajkdnajkdnjkn";
		TextArea text=new TextArea(var,10,80);
		add(text);
	}
}