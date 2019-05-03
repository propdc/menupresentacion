package vista;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.GestorExaminar;

public class Top extends JPanel {
	
	private JTextField textField;
	private JButton jbExaminar;
	
	public Top () {
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(100,50));
		jbExaminar = new JButton("Examinar");
		jbExaminar.setPreferredSize(new Dimension(150,25));
		
		jbExaminar.addActionListener(new GestorExaminar(this));
	
		
		setLayout(new FlowLayout());
		
		this.add(textField);
		this.add(jbExaminar);
			
	}
}
