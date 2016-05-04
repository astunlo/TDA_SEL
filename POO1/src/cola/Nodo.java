package cola;

public class Nodo {

	private Object dato;
	private Nodo siguiente;
	
	public Nodo(Object d){
		this.setDato(d);
		this.setSiguiente(null);
	}

	/**
	 * 
	 * @return
	 */
	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
