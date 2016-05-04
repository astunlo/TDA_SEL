package tiposdemapas;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *  HashMap: Los elementos que se insertan en el mapa ---> "NO tendrán un orden específico". 
 *           No aceptan claves duplicadas ni valores nulos.
 *  TreeMap: El mapa ---->  LO ORDENA de "forma natural". Por ejemplo, si la clave son valores enteros,
 *           los ordena de menor a mayor.
 *  LinkedHashMap: Inserta en el mapa los elementos ---> en el orden que se van insertando; es decir, 
 *                 que no tiene una ordenación de los elementos como tal, por lo que esta clase
 *                 realiza las búsquedas de los elementos de forma más lenta que las demás clases. 
*/

class MiHashMap {
 private Map<Integer, String> mapaHash=new HashMap<Integer, String>();
 
	void mostrarHashMap(){
		mapaHash.put(1,"Maitena");
		mapaHash.put(3,"Vanesa");
		mapaHash.put(5, "Monita");
		mapaHash.put(0, "Katy");
		mapaHash.put(2, "Gastón");
		mapaHash.put(4, "Betania");
		mapaHash.put(6, "Alejandra");
		
		//imprimir el mapa con Iterator:
		   		
		//Se debe importar java.util.Iterator;
		   //Se debe definir el tipo de argumentos: <Integer> u otro necesario.
		                               //Setea las "Claves" cargadas recorriendolas con el iterador, en el orden ingresado.
		
		System.out.println("HashMap: muestra su contenido \"Sin un orden lógico\"");
		System.out.println("-------------------------------------------------------");
		Iterator<Integer> it= mapaHash.keySet().iterator();//it es de tipo Integer
		while(it.hasNext()){//Mientras hayaa una clave...
			Integer key=it.next();//key será igual al valor dato de la clave.
			                              //n° clave                       //Contenido
			System.out.println("Clave: " + key + " --> Valor: " + mapaHash.get(key));
		}		
	}
}

class MiTreeMap{
	private Map<Integer, String> mapaTree= new TreeMap<Integer, String>();
	
	void mostrarTreeMap(){
		mapaTree.put(1,"Maitena");
		mapaTree.put(3,"Vanesa");
		mapaTree.put(5, "Monita");
		mapaTree.put(0, "Katy");
		mapaTree.put(2, "Gastón");
		mapaTree.put(4, "Betania");
		mapaTree.put(6, "Alejandra");
		
		//imprimir el mapa con Iterator:
		
		//Se debe importar java.util.Iterator;
		   //Se debe definir el tipo de argumentos: <Integer> u otro necesario.
		                               //Setea las "Claves" cargadas recorriendolas con el iterador, en el orden ingresado.
		
		System.out.println("\nTreeMap: muestra su contenido ordenado de menor a mayor ");
		System.out.println("-----------------------------------------------------------");
		Iterator<Integer> it= mapaTree.keySet().iterator();//it es de tipo Integer
		while(it.hasNext()){//Mientras hayaa una clave...
			Integer key=it.next();//key será igual al valor dato de la clave.
			                              //n° clave                       //Contenido
			System.out.println("Clave: " + key + " --> Valor: " + mapaTree.get(key));
		}
	}
}

class MiLinkedHashMap{
	private Map<Integer, String> mapaLinked= new LinkedHashMap<Integer, String>();
	
	void mostrarLinkedHashMap(){
		mapaLinked.put(1,"Maitena");
		mapaLinked.put(3,"Vanesa");
		mapaLinked.put(5, "Monita");
		mapaLinked.put(0, "Katy");
		mapaLinked.put(2, "Gastón");
		mapaLinked.put(4, "Betania");
		mapaLinked.put(6, "Alejandra");
		
		//imprimir el mapa con Iterator:
		
		//Se debe importar java.util.Iterator;
		   //Se debe definir el tipo de argumentos: <Integer> u otro necesario.
		                               //Setea las "Claves" cargadas recorriendolas con el iterador, en el orden ingresado.
		
		System.out.println("\nLinkedHashMap: muestra su contenido en el orden cargado");
		System.out.println("-----------------------------------------------------------");
		Iterator<Integer> it= mapaLinked.keySet().iterator();//it es de tipo Integer
		while(it.hasNext()){//Mientras hayaa una clave...
			Integer key=it.next();//key será igual al valor dato de la clave.
			                              //n° clave                       //Contenido
			System.out.println("Clave: " + key + " --> Valor: " + mapaLinked.get(key));
		}
	}
	
}
