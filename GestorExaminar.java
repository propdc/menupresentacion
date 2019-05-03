package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GestorExaminar implements ActionListener {

	JPanel jp;
	
	public GestorExaminar(JPanel jp) {
		
		this.jp = jp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JFileChooser selector = new JFileChooser();
		ImgFileFilter filtro = new ImgFileFilter();
		selector.setFileFilter(filtro);
		int returnVal = selector.showOpenDialog (null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("Se eligió el archivo " + selector.getSelectedFile().getName());
		}
			
	}
	

}
