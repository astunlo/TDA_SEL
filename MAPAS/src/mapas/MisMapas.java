package mapas;
/**
 * SubClass of Collection that implements Interface Map. Otras clases importantes: "TreeMap" y "LinkedHashMap"
 * Interfaz que extiende a otra interfaz (Hashtable)
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gastón
 * Mapas: estructuras de datos para almacenar pares "clave-->valor".
 * Por debajo implementan toda la teoría de las estructuras de datos de los Árboles:
 *     AVL, B, B+, B*
 * que permiten añadir, eliminar y modificar elementos de forma transparente para el programador.
 * Las claves pueden ser de cualquier tipo de objetos, aunque las más utilizadas son los tipo objetos 
 * predefinidos por Java como String, Integer, Double...
 * ---->!!! Cuicado, los mapas NO permiten datos atómicos.
 * 
 *                                 Map extiende a Hastable(Interfaz) 
 *                            HashMap<K,V>---> extiende a AbstractMap<K,V>
 */

public class MisMapas {
	private Map<Integer, String> mapa1= new HashMap<Integer, String>();
	
	//Métodos de los Map:
	void mostrarMétodos(){
		 System.out.println("Mapa vacío?:");
	     System.out.println(mapa1.isEmpty());//true si está vacío, false si tiene al menos un elemento
	     System.out.println("Se agrega Gaston en clave 0");
	     mapa1.put(0, "Gastón");//(Key clave, Values valor)
	     System.out.println("Se muestra el valor");
	     System.out.println(mapa1.get(0));//Devuelve el valor de la clave que se indica. Null si no tiene valor asignado
	     System.out.println("Se pideque muestre el valor de clave 1, que NO está cargado");
	     System.out.println(mapa1.get(1));
	     System.out.println("Se borra todo el contenido del mapa, y se carga con otros valores");
	     mapa1.clear();//Borra todo el contenido del Map
	     mapa1.put(0,"Vanesa");
	     mapa1.put(1,"Maitena");
	     mapa1.put(2,"Gastón");
	     mapa1.put(3,"Eva");
	     System.out.println("Tamaño:");
	     System.out.println(mapa1.size());//Devuelve el número de elementos en el Map
	     System.out.println("Se muestra el contenido en forma de colección:");
	     System.out.println(mapa1.values());//devuelve una "colección" con los valores del Map
	     System.out.println("Se remueve el contenido de clave 3");
	     mapa1.remove(3);
	     System.out.println("Se muestra nuevo tamaño, y contenido");
	     System.out.println(mapa1.size());//Devuelve el número de elementos en el Map
	     System.out.println(mapa1.values());//devuelve una "colección" con los valores del Map
	     System.out.println("Existe clave 1?");
	     System.out.println(mapa1.containsKey(1));//true si existe esa clave
	     System.out.println("Existe valor Maitena?");
	     System.out.println(mapa1.containsValue("Maitena"));//true si existe ese valor	          
	}
	
	public static void main(String[] args) {
		new MisMapas().mostrarMétodos();
	}
}


