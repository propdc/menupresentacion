package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Vista extends JFrame{
	private Center c;
	
	public Vista() {
		
		c = new Center();
		
		setLayout(new BorderLayout());
		add(c,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
