package es.iestetuan.iniciales_Carlos_Mahia.dao.txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import es.iestetuan.iniciales_Carlos_Mahia.dao.IAlumno;
import es.iestetuan.iniciales_Carlos_Mahia.dao.vo.Alumno;
import java.util.ArrayList;

public class AlumnoTxt implements IAlumno {

	@Override
	public Alumno getAlumno(long nia) {
		
          File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      Alumno Alumnobusqueda=null;
	      
	      try {
	        	archivo = new File ("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt");
		         fr = new FileReader (archivo);
		         br = new BufferedReader(fr);
		      // Lectura del fichero
		         String linea=null;
		         br.readLine(); 
		         
		         	while((linea = br.readLine ())!= null) {
		        	 
		        String[] contenido=linea.split(",");
		        
					        	if (nia==Long.parseLong(contenido[0])) {
					        		
					        	Alumnobusqueda = new Alumno(contenido[0], contenido[1], contenido[2], contenido[contenido.length-1]);
					        		
					        	}
		         	}
		         
		       } catch (IOException e) {
		    	   
		    	   e.printStackTrace();
	            
		         } 
		
		return Alumnobusqueda;
	}

	@Override
	public Alumno  getAlumnos() {
		
        File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    //List<Alumno> alumnos = new ArrayList<Alumno>();
	    try {
        	archivo = new File ("C:\\\\xampp\\\\htdocs\\\\aadd\\\\recursos\\\\alumnos-dam2-nuevos.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	      // Lectura del fichero
	         String linea=null;
	         br.readLine(); 
	         
	         	while((linea = br.readLine ())!= null) {
	        	 
	         		String[] contenido=linea.split(",");
	      
				    //alumnos.add(contenido[0]+contenido[1]+contenido[2]);  		
				    System.out.println("\n"+contenido[0]+", "+contenido[1]+", "+contenido[2]);
	         	}
	         
	       } catch (IOException e) {
	    	   
	    	   e.printStackTrace();
            
	         }
	    
		return null;
	}

}


