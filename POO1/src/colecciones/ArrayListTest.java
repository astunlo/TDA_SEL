package colecciones;

import java.util.ArrayList;
/**
 * ArrayList<E> es Subclase de ---> AbstractList<E> ---> AbstarctCollection<E> --->Object
 * @author Gastón
 *
 */

public class ArrayListTest{	
	public static void main(String[] args) {
	ArrayList<Integer> arregloLista = new ArrayList<Integer>();
	System.out.println("Esta vacio?: " + arregloLista.isEmpty());
	arregloLista.add(2);
	arregloLista.add(5);
	arregloLista.add(3);
	System.out.println("toString: " + arregloLista);
	System.out.println("Item removido: " + arregloLista.remove(2));
	System.out.println("toString: " + arregloLista);
	System.out.println("Esta vacio?: " + arregloLista.isEmpty());
	System.out.println("Posición del elemento 5: " + arregloLista.indexOf(5));
	System.out.println("Tamaño del vector: " + arregloLista.size());
	}
}
