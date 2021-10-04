package es.iestetuan.iniciales_Carlos_Mahia;

import es.iestetuan.iniciales_Carlos_Mahia.dao.IAlumno;
import es.iestetuan.iniciales_Carlos_Mahia.dao.txt.AlumnoTxt;
import es.iestetuan.iniciales_Carlos_Mahia.dao.vo.Alumno;

public class ClasePrueba {

	public static void main(String[] args) {
		
		//prueba de la primera consulta
		Alumno prueba1 = new Alumno();
		IAlumno prueba = new AlumnoTxt();
		prueba1=prueba.getAlumno(171);
		System.out.println(prueba1.getNombre()+" "+prueba1.getApellido1()+" "+prueba1.getApellido2());
		
		
		//prueba de la segunda consulta
		System.out.println(prueba.getAlumnos());
	}

}


