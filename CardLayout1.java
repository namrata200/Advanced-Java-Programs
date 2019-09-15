import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CardLayout1 extends Applet implements ActionListener
{
	Checkbox cbwin98,cbwinxp,cblinux,cbmac;
	Panel OScards;
	CardLayout cardLO;
	Button bwin,bothers;
	public void init()
	{
	 cardLO=new CardLayout();
	 bwin=new Button("Windows");
	 bothers=new Button("Others");
	 add(bwin);
	 add(bothers);
	 bwin.addActionListener(this);
	 bothers.addActionListener(this);
	 OScards=new Panel();
	 OScards.setLayout(cardLO);
	 
	 //create panel for windows
	 
	 Panel winpan=new Panel();
	 //add controls to windows panel
	 
	 cbwin98=new Checkbox("Windows 98");
	 cbwinxp=new Checkbox("Windows XP");
	 winpan.add(cbwin98);
	 winpan.add(cbwinxp);
	 
	 //create panel for others
	 
	 Panel otherpan=new Panel();
	 
	 //add controls to others
	 
	 cblinux=new Checkbox("Linux");
	 cbmac=new Checkbox("Mac");
	 otherpan.add(cblinux);
	 otherpan.add(cbmac);
	 
	 //add this card to  card deck
	 
	 OScards.add(winpan,"Windows");
	 OScards.add(otherpan,"Other");
	 
	 //add card deck to applet windows
	 
	 add(OScards); 
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()=="bwin")
		{
			cardLO.show(OScards,"Windows");

			repaint();
		}
		else
		{
			cardLO.show(OScards,"Other");
			repaint();
		}

	}
}