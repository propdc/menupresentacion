package Vista;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Center extends JPanel{
	
	private JEditorPane cPanel;
	private JScrollPane cScroll;
	
	public Center() {
		setLayout(null);
		cPanel = new JEditorPane();
		cPanel.setContentType("text/plain"); 
		cPanel.setEditable(true);
		cPanel.setPreferredSize(new Dimension(400,200));

		cScroll = new JScrollPane(cPanel);
		
	
		
		add(cPanel);
		add(cScroll);
		
	}

}
