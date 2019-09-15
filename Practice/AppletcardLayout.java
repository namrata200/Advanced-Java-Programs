import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="AppletcardLayout" height="300" width="300"></applet>
public class AppletcardLayout extends Applet implements ActionListener
{
	CardLayout cardLO;
	Panel all;
	Button fruits,colours;
	Checkbox yellow,blue,orange,mango;
	public void init()
	{
		
		fruits=new Button("Fruits");
		colours=new Button("Colours");
		add(fruits);
		add(colours);
		cardLO=new CardLayout();
		all=new Panel();
		all.setLayout(cardLO);
		yellow=new Checkbox("Yellow");
		blue=new Checkbox("Blue");
		orange=new Checkbox("Orange");
		mango=new Checkbox("Mango");
		Panel Fruit=new Panel();
		Panel Colour=new Panel();
		Fruit.add(orange);
		Fruit.add(mango);
		Colour.add(yellow);
		Colour.add(blue);
		all.add(Fruit,"Fruits");
		all.add(Colour,"Colours");
		add(all);
		fruits.addActionListener(this);
		colours.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==fruits)
		{
			cardLO.show(all,"Fruits");	
		}
		else if(ae.getSource()==colours)
		{
			cardLO.show(all,"Colours");
		}
	}
}