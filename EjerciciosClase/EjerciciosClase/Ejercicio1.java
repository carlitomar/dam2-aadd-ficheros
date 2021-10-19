package EjerciciosClase;

import java.io.*;

public class Ejercicio1 {

		   public static void main(String [] arg) {
		     
			   Ejercicio1 reader = new Ejercicio1();
			   
			   try {
				   String contenido = reader.LeerContenido();
				   reader.Imprimir();			   
			   } 
			   
			   finally {
				   
			   }
		   }
		   
		   public  String LeerContenido() {
			   File archivo = null;
			      FileReader fr = null;
			      BufferedReader br = null;
			      String contenido = "";

			      try {
			    	  
			         // Apertura del fichero y creacion de BufferedReader para poder
			         // hacer una lectura comoda (disponer del metodo readLine()).
			         archivo = new File ("C:\\xampp\\htdocs\\aadd\\recursos\\infoinstitutodam2.json");
			         fr = new FileReader (archivo);
			         br = new BufferedReader(fr);

			         // Lectura del fichero
			         String linea;
			         while((linea=br.readLine())!=null)
			            contenido = contenido + linea;
			      }
			      catch(Exception e){
			         e.printStackTrace();
			      }finally{
			         // En el finally cerramos el fichero, para asegurarnos
			         // que se cierra tanto si todo va bien como si salta 
			         // una excepcion.
			         try{                    
			            if( null != fr ){   
			               fr.close();     
			            }                  
			         }catch (Exception e2){ 
			            e2.printStackTrace();
			         }
			      }
			      return contenido;
			   
		   }
		   
		   public void Imprimir() {
			   
			   String contenido= LeerContenido();
			   System.out.println(contenido);
			   
		   }
		   
		   
		}

