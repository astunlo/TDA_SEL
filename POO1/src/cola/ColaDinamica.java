package cola;
/**
 * Cola Dinámica: responde a la LÓGICA FIFO (First in, First out)
 * @author Gastón
 *
 */

public class ColaDinamica {
	private Nodo primero;
	private Nodo ultimo;

	public ColaDinamica(){
		this.setPrimero(null);
		this.setUltimo(null);
	}

	public Boolean isEmpty(){
		if(this.getPrimero()==null && this.getUltimo()==null)
			return Boolean.TRUE;
		else return Boolean.FALSE;
	}

	public void encolar(Object o){
		Nodo nuevo=  new Nodo(o);
		if(isEmpty()){
			this.setPrimero(nuevo);
			this.setUltimo(nuevo);
		}else{
			this.getUltimo().setSiguiente(nuevo);
			this.setUltimo(nuevo);
		}
	}

	public Object desencolar()   {
		Object o =  this.getPrimero().getDato();
		if (!isEmpty()){          
			if (primero == ultimo){
				this.setPrimero(null);
				this.setUltimo(null);
			} else {
				this.setPrimero(this.getPrimero().getSiguiente());
			}
		}
		return o;
	}

	/**
	 * getters y setters
	 */
	 public Nodo getPrimero() {
		return primero;
	}

	 public void setPrimero(Nodo primero) {
		 this.primero = primero;
	 }

	 public Nodo getUltimo() {
		 return ultimo;
	 }

	 public void setUltimo(Nodo ultimo) {
		 this.ultimo = ultimo;
	 }
}
