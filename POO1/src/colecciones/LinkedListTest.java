package colecciones;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * LinkedList<E>-->"AbstractSecuentialList<E>--->"AbstractList<E>--->"AbstractCollection<E>--->Object
 * @return LISTA ENLAZADA (sin restricciones)
 *
 */

public class LinkedListTest {
	public static void main(String[] args) {
		List<Integer> lista1 = new LinkedList<Integer>();
		List lista2= new LinkedList<>(Arrays.asList("Gastón", " tiene ", new Integer(30), " años."));
		System.out.println(lista2);
		
		//List lista3= new ArrayList<>(Arrays.asList(" y ", "mide", 1.65d), " metros."); ERROR
		List lista3 = new LinkedList<>(Arrays.asList(new Integer(1), new Float(2.0F), new Double(3.0))); // TWO
		lista2 = lista3; // THREE
		
		for(Object element : lista2) {
		System.out.print(element + " ");
		}
		
		
		System.out.println("\nEsta vacia?: " + lista1.isEmpty());
		lista1.add(2);
		lista1.add(1, 5);//indica en qué posicion guardar
		lista1.add(3);
		System.out.println("toString: " + lista1);
		lista1.remove(1);
		System.out.println("toString: " + lista1);
		System.out.println("Esta vacia?: " + lista1.isEmpty());
		System.out.println("Elemento en pos 1?: " + lista1.get(1));
		System.out.println("Tamaño de la lista: " + lista1.size());
		
	}

}
