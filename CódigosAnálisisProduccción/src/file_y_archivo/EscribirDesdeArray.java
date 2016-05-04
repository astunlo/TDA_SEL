package file_y_archivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirDesdeArray {

	public static void main(String[] args) {
		FileWriter archivo= null;
		BufferedWriter buffer= null;
		String[] linea= new String[5];
		Integer tope=0;
		String sigue="";

		try{
			                                           //Si no quiero que sobreescriba debo agregar al constructor ", true"
			archivo= new FileWriter("D:\\UNIVERSIDAD\\Objetos I\\TextosFileReader\\DatosPersonales\\nombres_desde_Array.txt");
			buffer= new BufferedWriter(archivo);

			Scanner entrada= new Scanner(System.in);
			System.out.println("Ingreso  de 5 nombres completos con apellido: \n");
			System.out.print("**********************************************\n");
			
			while(tope<5){
				System.out.println("Datos a Ingresar N°" + (tope+1));
				linea[tope]= entrada.nextLine();

				System.out.println("Usted ingresó: " + linea[tope]);
				System.out.println("¿Es correcto? SI/NO");
				sigue= entrada.nextLine();
				if(sigue.equals("si")){
					System.out.println("Se grabó\n");
					tope++;
				}			
			}
			
			System.out.println("Se han grabado los datos en el Array, ¿los carga al Archivo? si/no");
			sigue= entrada.nextLine();
			if(sigue.equals("si")){
			   for(int i=0; i<linea.length; i++){
				    buffer.write(linea[i]);
				    buffer.newLine();
				   }
			      System.out.println("\n**Ya se cargaron todos los Datos en el Archivo Creado. Gracias.");
			   }
			buffer.close();
			entrada.close();
			
		}catch(IOException io){io.printStackTrace();}
	}

}
