import java.awt.event.*;
import java.awt.*;
import java.applet.*;

//<applet code="CardLayout1" height="300" width="300"></applet>

public class CardLayout1 extends Applet implements ActionListener
{
	Panel all;
	CardLayout cardLO;
	Button b1,b2;
	Checkbox red,blue,mango,orange;
	public void init()
	{
		cardLO=new CardLayout();
		b1=new Button("Colours");
		b2=new Button("Fruits");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		all=new Panel();
		all.setLayout(cardLO);
		red=new Checkbox("Red");
		blue=new Checkbox("Blue");
		mango=new Checkbox("mango");
		orange=new Checkbox("Orange");
		Panel fruits=new Panel();
		fruits.add(mango);
		fruits.add(orange);
		Panel colours=new Panel();
		colours.add(red);
		colours.add(blue);
		all.add(fruits,"Fruits");
		all.add(colours,"Colours");
		add(all);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			cardLO.show(all, "Fruits");
		}
		else if(ae.getSource()==b2)
		{
			cardLO.show(all, "Colours");
		}
		repaint();
	}
}