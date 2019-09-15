import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CardLayoutDemo extends Applet implements ActionListener
{
	CardLayout cardlo;
	Panel OScard;
	Button bwin,bother;
	Checkbox win98,winXP,linux,mac;
	public void init()
	{
		cardlo=new CardLayout();
		OScard=new Panel();
		OScard.setLayout(cardlo);
		bwin=new Button("Windows");
		bother=new Button("Other");
		add(bwin);
		add(bother);
		win98=new Checkbox("Windows 98",true);
		winXP=new Checkbox("Windows XP");
		Panel winpan=new Panel();
		winpan.add(win98);
		winpan.add(winXP);
		linux=new Checkbox("Linux");
		mac=new Checkbox("Mac");
		Panel otherpan=new Panel();
		otherpan.add(linux);
		otherpan.add(mac);
		OScard.add(winpan,"Windows");
		OScard.add(otherpan,"Other");
		add(OScard);
		bwin.addActionListener(this);
		bother.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bwin)
		{
			cardlo.show(OScard,"Windows");
			showStatus("Welcome to windows Operating System");
		}
		else if(e.getSource()==bother)
		{
			cardlo.show(OScard,"Other");
			showStatus("Welcome to Other Operating System");
		}
	}
} 