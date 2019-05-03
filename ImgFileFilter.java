package controlador;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class ImgFileFilter extends FileFilter {

	@Override
	public boolean accept(File f) {
		// TODO Auto-generated method stub
		
		if (f.getPath().endsWith(".jpg") || f.getPath().endsWith(".gif") || f.getPath().endsWith(".jpeg") || f.isDirectory())
			return true;
		else return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Archivos de imagen";
	}
	
}
