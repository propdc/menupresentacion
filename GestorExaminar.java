package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import vista.Top;

public class GestorExaminar implements ActionListener {

	private JButton jbExaminar;
	private Top vTop;
	
	public GestorExaminar(JButton jbExaminar) {
		
		this.jbExaminar = jbExaminar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		vTop = new Top();
		
		//Creamos el objeto JFileChooser
		JFileChooser fc = new JFileChooser();
		 
		//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
		int seleccion = fc.showOpenDialog(vTop);
		 
		//Si el usuario, pincha en aceptar
		if(seleccion==JFileChooser.APPROVE_OPTION){
		 
		    //Seleccionamos el fichero
		    File fichero = fc.getSelectedFile();
		 
		    //Ecribe la ruta del fichero seleccionado en el campo de texto
		    vTop.getTextField().setText(fichero.getAbsolutePath());
		 
		    try(FileReader fr=new FileReader(fichero)){
		        String cadena="";
		        int valor=fr.read();
		        while(valor!=-1){
		            cadena=cadena+(char)valor;
		            valor=fr.read();
		        }
		        textArea.setText(cadena);
		   
		    } catch (IOException e1) {
		    
		    	e1.printStackTrace();
		    }
		}
	}

}
