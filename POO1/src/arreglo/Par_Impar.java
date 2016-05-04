package arreglo;

import java.util.ArrayList;

/*Recorrer el siguiente arreglo de números sumando en una
variable los números pares y en otra los impares.
Recorrerlo utilizando un for y luego utilizando un while.
int[] arreglo = new int[150];
int pares;
int impares;*/

public class Par_Impar {

	private int[] arreglo = new int[150];
	private int pares=0;
	private int impares=0;
	
	void inicializarArreglo(){
		for(int i=0; i<arreglo.length; i++)
			    arreglo[i]=i;
	}
	void mostrarArreglo(){
	System.out.println("arreglo está cargado con:");	
		for(int ar:arreglo)
			System.out.print(arreglo[ar] + " ");
	}
	
	void separarParesDeImparesConFor(){
		ArrayList<Integer> arregloPares= new ArrayList<Integer>();
		ArrayList<Integer> arregloImpares= new ArrayList<Integer>();
		
		for(int i=0; i<arreglo.length; i++){
			if((arreglo[i]%2)==0){
		         pares+= i;
		         arregloPares.add(i);
			}else{
				impares+= i;
				arregloImpares.add(i);}
		}
		System.out.println("\nNúmero pares: ");
		    for(Integer par:arregloPares)
		    	System.out.print(par + " ");
		System.out.println("\nLa suma de números pares es: " + pares + "\n");
		
		System.out.println("Número impares: ");
	    for(Integer impar:arregloImpares)
	    	System.out.print(impar + " ");
		System.out.println("\nLa suma de números impares es: " + impares);
	}
	
	public static void main(String[] args) {
		Par_Impar p= new Par_Impar();
		p.inicializarArreglo();
		p.mostrarArreglo();
		p.separarParesDeImparesConFor();
	}
}
