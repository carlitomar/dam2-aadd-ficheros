package EjerciciosClase;

import java.io.*;

public class Ejercicio2
{
    public static void main(String[] args)
    {
    	BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String data = "\n Isidoro, Nevares, DAM2";
            File Fichero = new File("C:\\xampp\\htdocs\\aadd\\info-alumnos.txt");
           
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(Fichero.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("información agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                            //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

