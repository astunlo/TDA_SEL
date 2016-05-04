package colecciones;

import java.util.Stack;
/**
 * Stack<E> es Subclase de "Vector<E>" ---> ArrayList<E> ---> AbstarctCollection<E> --->Object
 * @return PILA ESTÁTICA. Lógica LIFO. *
 */

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<Integer>();
		System.out.println("Esta vacia?: " + pila.empty());
		pila.push(2);//agrega
		pila.push(5);
		pila.push(3);
		System.out.println("toString: " + pila);
		System.out.println("Elimina el último, Lógica LIFO, y lo muestra: " + pila.pop());//Elimina el último. Lógica LIFO
		System.out.println("toString: " + pila);
		System.out.println("Esta vacio?: " + pila.empty());
		System.out.println("Elemento en el tope: " + pila.peek());//muestra el tope pero no lo borra
		System.out.println(pila);
				
	}

}
