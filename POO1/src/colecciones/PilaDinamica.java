package colecciones;

@SuppressWarnings("hiding")
public class PilaDinamica<Integer> {
    /**
     *  Inner Class
     * @author Gastón
     * @param <Integer>
     */
	class Nodo<Integer> {
		/**
		 * @params parámetros de Nodo: Integer elemento, Nodo siguiente.
		 */
		private Integer elemento;
		private Nodo<Integer> siguiente;//Dato recursivo. Se llama a sí mismo.
		
		/**
		 * Constructor de Nodo
		 * @param elemento
		 * @param siguiente
		 */
		public Nodo(Integer elemento, Nodo<Integer> siguiente) {
			this.setElemento(elemento);
			this.setSiguiente(siguiente);
		}		
		
		//Sobrecarga de Constructores de Nodo
		public Nodo() {//Nodo nulo
			this(null, null);
		}
		
		public Nodo(Integer elemento) {//Nodo de un solo elemento
			this(elemento, null);
		}
		
		/**
		 * Getters y Setters
		 * @return
		 */
		public Integer getElemento() {
			return this.elemento;
		}
		public void setElemento(Integer elemento) {
			this.elemento = elemento;
		}
		public Nodo<Integer> getSiguiente() {
			return this.siguiente;
		}
		public void setSiguiente(Nodo<Integer> siguiente) {
			this.siguiente = siguiente;
		}
	  }// Fin de inner class
	
	/**
	 * Clase PilaDinámica
	 * @param Un Nodo tope. 
	 */
	private Nodo<Integer> tope;
	PilaDinamica<Integer> pilaAux;
	
	/**
	 * Constructor
	 */
	public PilaDinamica() {
		this.setTope(null);
	}
	
	/**
	 * Getters y Setters
	 * @return
	 */
	private Nodo<Integer> getTope() {
		return this.tope;
	}
	private void setTope(Nodo<Integer> tope) {
		this.tope = tope;
	}
		
	public PilaDinamica<Integer> getPilaAux() {
		return pilaAux;
	}

	public void setPilaAux(PilaDinamica<Integer> pilaAux) {
		this.pilaAux = pilaAux;
	}

	
	/**
	 * Métodos de PilaDinámica:
	 * @return true si la pila está vacía
	 */
	public boolean vacia() {
		return (this.getTope() == null);
	}
	
	//Agreg elementos a la Pila
	public void poner(Integer elemento) {
		this.setTope(new Nodo<Integer>(elemento, this.getTope()));
	}
	
	//Saca el último elemento (el que está en el tope), ya que tiene lógica LIFO (Last in, First out)
	public void sacarUnElemento() throws PilaVaciaException {
		if (this.vacia())
			throw new PilaVaciaException();
		this.setTope(this.getTope().getSiguiente());
	}
	
	/**
	 * Método para ver contenido del tope
	 * @return Muestra el Tope
	 * @throws PilaVaciaException
	 */
	public Integer ver() throws PilaVaciaException {
		if (this.vacia())
			throw new PilaVaciaException();
		return this.getTope().getElemento();
	}
	
	//Vacía la Pila
	public void vaciarPila(){
		pilaAux= new PilaDinamica<Integer>();
		while (!this.vacia()){
			 try {
				  Integer elemento= this.ver();
				  this.sacarUnElemento();//Saca elemento de tope
				  pilaAux.poner(elemento);//Resguarda elemento en pilaAux				  
			     } catch (PilaVaciaException pve) {
				         pve.printStackTrace();
			            }
		}
	}
	
	public void recargarPila(){
		pilaAux= new PilaDinamica<Integer>();
		while (!this.vacia()){
			 try {
				  Integer elemento= pilaAux.ver();
				  pilaAux.sacarUnElemento();//Saca elemento de pilaAux
				  this.poner(elemento);//Repone elemento en tope				  
			     } catch (PilaVaciaException pilaVaciaException) {
				         pilaVaciaException.printStackTrace();
			            }
		}		
	}

}