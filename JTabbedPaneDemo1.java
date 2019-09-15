import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="JTabbedPaneDemo1.class" width=400 height=100>
</applet>
*/
public class JTabbedPaneDemo1 extends JApplet 
{
	public void init() 
	{
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Cities", new CitiesPanel());
		jtp.addTab("Colors", new ColorsPanel());
		jtp.addTab("Flavors", new FlavorsPanel());
		getContentPane().add(jtp);
	}
}
class CitiesPanel extends JPanel 
{
	public CitiesPanel() 
	{
		JButton b1 = new JButton("Mumbai");
		add(b1);
		JButton b2 = new JButton("Delhi");
		add(b2);
		JButton b3 = new JButton("Pune");
		add(b3);
		JButton b4 = new JButton("Chennai");
		add(b4);
	}
}
class ColorsPanel extends JPanel 
{
	public ColorsPanel() 
	{
		JCheckBox cb1 = new JCheckBox("Red");
		add(cb1);
		JCheckBox cb2 = new JCheckBox("Green");
		add(cb2);
		JCheckBox cb3 = new JCheckBox("Blue");
		add(cb3);
	}
}
class FlavorsPanel extends JPanel 
{
	public FlavorsPanel() 
	{
		JComboBox jcb = new JComboBox();
		jcb.addItem("Vanilla");
		jcb.addItem("Chocolate");
		jcb.addItem("Strawberry");
		add(jcb);
	}
}