import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
import javax.swing.*;
import javax.swing.event.*;

//<applet code="TreeDemo.class" height="300" width="300"></applet>

public class TreeDemo extends JApplet implements MouseListener
{
	JTree tree;
	JTextField jtf;
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		
		//create root node
		DefaultMutableTreeNode top=new DefaultMutableTreeNode("Department");
		
		//create child of tree node
		DefaultMutableTreeNode Comp=new DefaultMutableTreeNode("Computer");
		DefaultMutableTreeNode It=new DefaultMutableTreeNode("information Technology");
		
		//add child to root
		top.add(Comp);
		top.add(It);
		
		DefaultMutableTreeNode A1=new DefaultMutableTreeNode("A1");
		DefaultMutableTreeNode A2=new DefaultMutableTreeNode("A2");
		
		Comp.add(A1);
		Comp.add(A2);
		
		//create child for it
		DefaultMutableTreeNode ItA1=new DefaultMutableTreeNode("A1");
		DefaultMutableTreeNode ItA2=new DefaultMutableTreeNode("A2");
		
		//add child to it
		It.add(ItA1);
		It.add(ItA2);
		tree=new JTree(top);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane j=new JScrollPane(tree,v,h);
		cp.add(jtf,BorderLayout.SOUTH);
		cp.add(tree,BorderLayout.CENTER);
		tree.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
    {
		TreePath tp=tree.getPathForLocation(me.getX(),me.getY());
		if(tp!=null)
		{
			
			jtf.setText(tp.toString());	
		}
		else
		{
			jtf.setText("");		
		}	
   }
}	