/**
 * Problema 1:

Confeccionar una clase que solicite el ingreso de dos String y luego emplee los métodos más comunes de la clase String.
 */
package string_practica;

public class Palabras {
  private String palabra1;
  private String palabra2;
  
  public Palabras(String p1, String p2){
	  this.palabra1=p1;
	  this.palabra2=p2;
  }
	
	public static void main(String[] args) {
		Palabras palabras= new Palabras("Gastón", "Vanesa");
		
		System.out.println("La 1er palabra es: " + palabras.palabra1 + " y mide " + palabras.palabra1.length() + "caracteres");
		System.out.println("La 2da palabra es: " + palabras.palabra2 + " y mide " + palabras.palabra2.length() + "caracteres");		
	    System.out.println("¿Son iguales alfabéticamente ambas palabras? " + palabras.palabra1.equals(palabras.palabra2));
	    System.out.println("La primera empieza con " + palabras.palabra1.charAt(0) + " y la segunda con " + palabras.palabra2.charAt(0)); 
	    System.out.println("La letra s de la 1er palabra está en la posición " + (palabras.palabra1.indexOf("s")+1));
	    System.out.println("La letra " + palabras.palabra1.charAt(0) + " está a " + palabras.palabra2.compareTo(palabras.palabra1) + " lugares respecto de la letra " + palabras.palabra2.charAt(0) + " en el abecedario");
	    System.out.println("Palabra 1 en mayúsculas: " + palabras.palabra1.toUpperCase() + " y en minúsculas: " + palabras.palabra1.toLowerCase() ); 
	}
	
}
