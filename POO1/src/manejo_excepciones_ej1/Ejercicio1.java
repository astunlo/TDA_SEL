package manejo_excepciones_ej1;

import java.util.Scanner;

/*
 * Ejercicio 1: Cree una clase con un método main() que genere un objeto de
   la clase Exception dentro de un bloque try. Proporcione al constructor de
   Exception un argumento String. Capture la excepción dentro de una
   cláusula catch e imprima el argumento String. Añada una clausula finally
   e imprima un mensaje para demostrar que pasó por allí.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		try{
			Exception e= new Exception("Lanzó una Excepción");
			throw e;
		}catch( Exception e){
			System.out.println(e.getMessage());
		}finally{System.out.println("** Fin **");}
	}
}
