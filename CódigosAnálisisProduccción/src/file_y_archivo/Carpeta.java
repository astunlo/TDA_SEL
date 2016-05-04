package file_y_archivo;

import java.io.File;
import java.util.Scanner;
  

public class Carpeta {
       
	public static void main(String[] args) {
		Carpeta c= new Carpeta();
		c.crearCarpeta();
			
	}

	public void crearCarpeta(){
		File carpeta= null;
		Scanner entrada= new Scanner(System.in);
		String nombreCarpeta;
		String respuesta;
		
		System.out.println("Ingrese el nombre de su Carpeta a crear: ");
		nombreCarpeta= entrada.nextLine();
			System.out.println("Usted denominó a su carpeta: " + nombreCarpeta);
		System.out.println("¿Es correcto? si/no");
		    respuesta= entrada.next();
		if(respuesta.equals("si"))
			carpeta= new File("D://UNIVERSIDAD//Objetos I//TextosFileReader//", nombreCarpeta);
		System.out.print("¿Se creó la carpeta? ");
		   //es necesario el mkdir para crearlo 
		if(carpeta.mkdir()){
		     System.out.println(carpeta.exists());
		     System.out.print("Se ubica en: ");
			 System.out.println(carpeta.getAbsoluteFile());
		   }else{System.out.println(carpeta.mkdir() + ", la carpeta ya existe o hubo un error");}
		entrada.close();		
	}
}
