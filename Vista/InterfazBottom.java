package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.ProcessGestor;

public class InterfazBottom extends JPanel {

	private JTextField gruposDividir;
	private JButton botonProcesar;
	
	public InterfazBottom() {
		
		gruposDividir = new JTextField(5);
		botonProcesar = new JButton("Procesar");
		
		this.add(new JLabel("Grupos en los que dividir: "));
		this.add(gruposDividir);
		this.add(botonProcesar);
		
		botonProcesar.addActionListener(new ProcessGestor());
	}
	public static void main(String[] args) {
		
		InterfazBottom interfazBottom = new InterfazBottom();

	}

	public JTextField getTextField() {return gruposDividir;}
	public JButton getBotonProcesar() {return botonProcesar;}
}
