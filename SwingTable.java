import java.awt.*;
import javax.swing.*;
/*
<applet code="JTableDemo" width=400 height=200>
</applet>
*/
public class SwingTable extends JApplet 
{
	public void init() 
	{
		// Get content pane
		Container contentPane = getContentPane();
		// Set layout manager
		contentPane.setLayout(new BorderLayout());
		// Initialize column headings
		final String[] colHeads = { "Name", "Phone", "Fax" };
		// Initialize data
		final Object[][] data = {
		{ "Rakesh", "4567", "8675" },
		{ "Dhiraj", "7566", "5555" },
		{ "Niraj", "5634", "5887" }
		};
		// Create the table
		JTable table = new JTable(data, colHeads);
		// Add table to a scroll pane
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(table, v, h);
		// Add scroll pane to the content pane
		contentPane.add(jsp, BorderLayout.CENTER);
	}
}