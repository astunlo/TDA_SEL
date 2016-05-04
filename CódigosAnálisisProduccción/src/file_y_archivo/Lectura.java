package file_y_archivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
	
 public static void main(String[] args) {
	//Lector de archivo
	FileReader archivo= null;
	//Lector de contenedor
	BufferedReader buffer= null;
	//Cadena de caracteres
	String linea;
	
	try{
		archivo= new FileReader("D:\\UNIVERSIDAD\\Objetos I\\TextosFileReader\\DatosPersonales\\nombres.txt");
		buffer= new BufferedReader(archivo);
		while((linea=buffer.readLine())!=null){
		      System.out.println(linea);
		     }
		buffer.close();
	    }catch(IOException ioException){
		       ioException.printStackTrace();
	           }
		
	}
	
}

