/**
 * Algoritmo de Decimal A Grados, Minutos Y Segundos.
 */
package algoritmoGradoMinutoSegundo;

import java.util.Scanner;

public class Grados{
	static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		Grados a= new Grados();
		Integer continua=1;
		do{
		   a.GMS();
		   System.out.println("¿Otra vez? 1->SI, cualquier otro número entero->NO\n");
		   continua= scanner.nextInt();
		}while(continua.equals(1));
		scanner.close();
		System.out.println("¡¡Gracias por usar el programa!!");
	}
	
	void GMS(){
		//deben ser tipo primitivos
		double Decimal;
		int Grados;
		int Minutos;
		int Segundos;

		System.out.println("Convierte Decimales a Grados Minutos Y segundos");
		System.out.println("Ingrese el Decimal: ");

		Decimal=scanner.nextDouble();   
		//sólo castea de double a int si son primitivos
		Grados=(int)(Decimal); //Parte Entera del Decimal
		System.out.print("Son  " + Grados + "° ");  

		Minutos=Math.abs((int)((Decimal-Grados)*60)); //Se Multiplica por 60, se toma la parte entera y se obtienen los Minutos
		System.out.print(Minutos + "' ");
		
		Segundos=Math.abs((int)((((Decimal-Grados)*60)-Minutos)*60));
		System.out.println(Segundos + "''");
		//Nota:Los Valores que Tienen Valor Absoluto, se hizo para que el Menos 
		//De la Operacion no afectara el Resultado.
	}
}
