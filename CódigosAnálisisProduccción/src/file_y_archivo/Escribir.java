package file_y_archivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escribir {

	public static void main(String[] args) {
		FileWriter archivo= null;
		FileWriter archivo2= null;
		BufferedWriter buffer= null;
		BufferedWriter buffer2= null;
		String linea;
		Integer respuesta;
						
		try{
			                        //Constructor con APENDEO. Permite agregar varias líneas sin sobreescribir. True aprendea.               
			archivo= new FileWriter("D:\\UNIVERSIDAD\\Objetos I\\TextosFileReader\\DatosPersonales\\nombres.txt", true);
			archivo2=new FileWriter("D:\\UNIVERSIDAD\\Objetos I\\TextosFileReader\\Carpeta 1\\frases sueltas.txt", true);
			buffer= new BufferedWriter(archivo);
			buffer2= new BufferedWriter(archivo2);
			
			System.out.println("¿Qué desea ingresar?");
			System.out.println("   1- Datos Personales");
			System.out.println("   2- Frases sueltas");
			Scanner entrada= new Scanner(System.in);
			respuesta= entrada.nextInt();
			
			switch(respuesta){
			   case 1:
				    //Se reingresa nextLine() para LIMPIAR EL ENTER que quedó cargado en el buffer por el nextInt() anterior
				    entrada.nextLine();
				    System.out.println("Ingrese Nombres y Apellido Completos: ");
			        linea= entrada.nextLine();
			        buffer.write(linea);
			        buffer.newLine();			
			        buffer.close();
			        entrada.close();
			        System.out.println("Se escribió en el archivo");
			        break;
			   case 2:
				    entrada.nextLine(); 
				    System.out.println("Ingrese Frases Sueltas: ");
				    linea= entrada.nextLine();
			        buffer2.write(linea);
			        buffer2.newLine();			
			        buffer2.close();
			        entrada.close();
			        System.out.println("Se escribió en el archivo");
			        break;
			  default: break;
			 }
		   }catch(IOException io){
			        io.printStackTrace();
		          }
	}
}
