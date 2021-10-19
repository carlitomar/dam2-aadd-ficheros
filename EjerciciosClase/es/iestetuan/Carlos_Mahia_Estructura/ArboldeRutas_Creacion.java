package es.iestetuan.Carlos_Mahia_Estructura;

import java.io.File;
import java.io.IOException;

import es.iestetuan.iniciales_Carlos_Mahia.dao.IArboldeRutas;
import es.iestetuan.iniciales_Carlos_Mahia.dao.vo.ArboldeRutas;

public class ArboldeRutas_Creacion implements IArboldeRutas {

	@Override
	public ArboldeRutas CrearArbol(String Ruta) {
		
		File directorios = new File(Ruta);
		directorios.mkdirs();
		
		return null;
	}

	@Override
	public ArboldeRutas CrearDirectorios(File[] Archivo) {
		

		for (File file : Archivo) { 
			
			if (file.isDirectory()) { 
				try {
				//System.out.println("Directory: " + file.getPath()+"\\texto.txt"); 
				File fichero = new File (file.getPath()+"\\info-temporal.txt");
				
					fichero.createNewFile();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				CrearDirectorios(file.listFiles()); // Calls same method again. } else { System.out.println("File: " + file.getName()); } }
				
			}
		}

		
		
		return null;
	}

	@Override
	public ArboldeRutas BorrarDirectorios(File[] Archivo) {
		
		for (File file : Archivo) {
			
			if (file.isDirectory()) { 
				
				//System.out.println("Directory: " + file.getPath()+"\\texto.txt"); 
				File fichero = new File (file.getPath()+"\\info-temporal.txt");
				
					fichero.delete();
				CrearDirectorios(file.listFiles()); // Calls same method again. } else { System.out.println("File: " + file.getName()); } }
				
			}
	}

	
	
	return null;
		

}
}