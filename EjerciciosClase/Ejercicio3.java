package EjerciciosClase;

import java.io.*;

public class Ejercicio3 {

	
	
	
	public static void main(String[] args) throws IOException {
    	  BufferedWriter bw = null;
          FileWriter fw = null;
        //Ejercicio3 reader = new Ejercicio3();
          File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      File Fichero = new File("C:\\xampp\\htdocs\\aadd\\info-alumnos.txt");
        try {
        	archivo = new File ("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	            fw = new FileWriter(Fichero.getAbsoluteFile(), true);
	            bw = new BufferedWriter(fw);
	      // Lectura del fichero
	         String linea=null;
	         //String[] contenido=linea.split(",");
	         br.readLine(); // ignora la primera linea
	         //linea = br.readLine();
	         while((linea = br.readLine ())!= null) {
	        //escritura de fichero
            //fw = new FileWriter(Fichero.getAbsoluteFile(), true);
            //bw = new BufferedWriter(fw);
	        String[] contenido=linea.split(",");
	        if (contenido[1]!=contenido[contenido.length-2]) {
	        	
	        	bw.write("\n"+contenido[1]+","+(contenido[contenido.length-2]+contenido[contenido.length-1])+","+" DAM2");
	        	
	        }else {
	        	
	        	bw.write("\n"+contenido[1]+","+contenido[contenido.length-1]+","+" DAM2");
	        }
            
            
        }
	         } catch (IOException e) {
            e.printStackTrace();
	         } finally {
        	
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
                if(br != null)
                    br.close();
            }
        }
	}
	


