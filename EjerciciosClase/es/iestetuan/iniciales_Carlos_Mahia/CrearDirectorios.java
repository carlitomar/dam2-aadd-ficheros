package es.iestetuan.iniciales_Carlos_Mahia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import es.iestetuan.Carlos_Mahia_Estructura.ArboldeRutas_Creacion;
import es.iestetuan.iniciales_Carlos_Mahia.dao.IArboldeRutas;
import es.iestetuan.iniciales_Carlos_Mahia.dao.vo.ArboldeRutas;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

public class CrearDirectorios {

	public static void main(String[] args) throws IOException {
		
		Properties Rutas = new Properties();
		ArboldeRutas Arbol = new ArboldeRutas();
		IArboldeRutas Creacion = new ArboldeRutas_Creacion();
		InputStream RutasInput = null;
		Scanner sc = new Scanner(System.in);
		//ruta final de la carpeta (ruta que no cambia
		
		
		System.out.println("que archivo deseas usar? 1: properties , 2: json , 3 xml");
		int numero = sc.nextInt();
		
		
		switch (numero) {
		
		
		case 1:
			
		try {
			RutasInput= new FileInputStream("recursos/info-configuracion.properties");
			Rutas.load(RutasInput);
			//File[] files = new File(Rutas.getProperty("00-TMP")).listFiles();
			//Creacion.CrearDirectorios(files);
			
			@SuppressWarnings("unchecked")
			Enumeration<String> numeroproperties = (Enumeration<String>) Rutas.propertyNames();
		    while (numeroproperties.hasMoreElements()) {
		      String indice = numeroproperties.nextElement();
		      String Contenido = Rutas.getProperty(indice);
		      Arbol=Creacion.CrearArbol(Contenido);
		     //File[] files = new File("C:/TMP/DAM2/AccesoDatos/Ficheros/00-tmp").listFiles();
		     //Creacion.CrearDirectorios(files);
		     
		      
		      
		}} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		File[] files = new File(Rutas.getProperty("00-TMP")).listFiles();
		//Creacion.CrearDirectorios(files);
		Creacion.BorrarDirectorios(files);
			
		
		case 2:
			
			//JsonParser parser = new JsonParser("recursos/info-configuracion.json");
			Object objetojson = new JsonParser().parse(new FileReader("recursos/info-configuracion.json")); // parsing file "info-configuracion.json"
			
	        JsonObject RutaJson = (JsonObject) objetojson; // convertimos Rutajson en un  JSONObject
	        
	     
	        String Ruta = RutaJson.get("00-TMP").getAsString(); // Guardamos en un String el contenido que leemos del properties json
	        Arbol=Creacion.CrearArbol(Ruta); //creamos la carpetas en esta ruta indicada por el stream de arriba
	        
	        String Ruta2 = RutaJson.get("Texto-INM").getAsString();
	        Arbol=Creacion.CrearArbol(Ruta2);
	        
	        String Ruta3 = RutaJson.get("XML-INM").getAsString();
	        Arbol=Creacion.CrearArbol(Ruta3);
	        
	        String Ruta4 = RutaJson.get("Texto-backup").getAsString();
	        Arbol=Creacion.CrearArbol(Ruta4);
	        
	        String Ruta5 = RutaJson.get("Texto-Info-alumno").getAsString();
	        Arbol=Creacion.CrearArbol(Ruta5);
	        
	        String Ruta6 = RutaJson.get("Texto-procesados").getAsString();
	        Arbol=Creacion.CrearArbol(Ruta6);
	        
	        String Ruta7 = RutaJson.get("XML-backup").getAsString();
	        Arbol=Creacion.CrearArbol(Ruta7);
	        
	        String Ruta8 = RutaJson.get("XML-Info-alumno").getAsString();
	        Arbol=Creacion.CrearArbol(Ruta8);
	        
	        String Ruta9 = RutaJson.get("XML-procesados").getAsString();
	        Arbol=Creacion.CrearArbol(Ruta9);
	        
	     
	        
		case 3:
			try {
			File FicheroEntrada = new File("recursos/info-configuracion.xml"); //cargamos el archivo
	         DocumentBuilderFactory FIcheroBuilder = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder;
			dBuilder = FIcheroBuilder.newDocumentBuilder();
	        Document RutaXML;
			RutaXML = dBuilder.parse(FicheroEntrada);
			RutaXML.getDocumentElement().normalize();
	         
	         NodeList nList = RutaXML.getElementsByTagName("properties"); //cargamos todos los elementos de properties en una Lista
	                Node nNode = nList.item(0); // cargamos el contenido de la lista en un nodo 
	           
	                    Element eElement = (Element) nNode; // creamos en element del nodo
	                    String RutaXML1= eElement.getElementsByTagName("Texto-INM").item(0).getTextContent(); 
	                    Arbol=Creacion.CrearArbol(RutaXML1); 
	                    
	                    String RutaXML2= eElement.getElementsByTagName("XML-INM").item(0).getTextContent(); 
	                    Arbol=Creacion.CrearArbol(RutaXML2); 
	                    
	                    String RutaXML3= eElement.getElementsByTagName("Texto-backup").item(0).getTextContent(); 
	                    Arbol=Creacion.CrearArbol(RutaXML3); 
	                    
	                    String RutaXML4= eElement.getElementsByTagName("Texto-Info-alumno").item(0).getTextContent(); 
	                    Arbol=Creacion.CrearArbol(RutaXML4); 
	         
	                    String RutaXML5= eElement.getElementsByTagName("Texto-procesados").item(0).getTextContent(); 
	                    Arbol=Creacion.CrearArbol(RutaXML5); 
	         
	                    String RutaXML6= eElement.getElementsByTagName("XML-backup").item(0).getTextContent(); 
	                    Arbol=Creacion.CrearArbol(RutaXML6); 
	         
	                    String RutaXML7= eElement.getElementsByTagName("XML-Info-alumno").item(0).getTextContent(); 
	                    Arbol=Creacion.CrearArbol(RutaXML7); 
	         
	                    String RutaXML8= eElement.getElementsByTagName("XML-procesados").item(0).getTextContent(); 
	                    Arbol=Creacion.CrearArbol(RutaXML8); 
	         
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
		}
		
		
	}

}
