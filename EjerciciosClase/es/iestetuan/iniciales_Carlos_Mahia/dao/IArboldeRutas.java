package es.iestetuan.iniciales_Carlos_Mahia.dao;

import java.io.File;

import es.iestetuan.iniciales_Carlos_Mahia.dao.vo.ArboldeRutas;

public interface IArboldeRutas {

	
	public ArboldeRutas CrearArbol(String Ruta);
	public ArboldeRutas CrearDirectorios(File[] Archivo);
	//public ArboldeRutas BorrarDirectorios(String Ruta);
	//public ArboldeRutas CrearDirectorios(String Archivo);
	public ArboldeRutas BorrarDirectorios(File[] Archivo);
}
