package colecciones;

import java.util.PriorityQueue;
import java.util.Queue;
/**
 * 
 * @return COLA DE PRIORIDADES. Solo permite elementos del mismo tipo comparables entre sí.
 *         El jfe de la cola es el menor elemento con respecto al prden específico.
 *         Lógica FIFO
 */
public class Queu {//PriorityQueue<E> es Subclase de ---> "AbstractQueue<E> --->"AbstractCollection<E>" ---> "Object" 

	public static void main(String[] args) {
		Queue<Integer> cola = new PriorityQueue<Integer>();
		cola.add(2);
		cola.add(5);
		cola.add(3);
		System.out.println("toString: " + cola);
		cola.poll();//ordena la cola
		System.out.println("toString: " + cola);
		System.out.println("Elemento en a salir: " + cola.peek());

	}

}
