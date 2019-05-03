package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ProcessGestor implements ActionListener{

	private JOptionPane opProcess;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String[]op= {"Aceptar","Guardar txt"};
		
		opProcess.showOptionDialog(null, null, "Resultado", 0, -1, null, op, null);
		
	}

	
	
}
