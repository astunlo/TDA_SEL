package pilaestatica;

public class PilaEstatica implements Apilable{

	private Object [] pilaEstatica;
	private Integer tope;


	public PilaEstatica(){
		this.setPilaEstatica(new Object [1]);
		this.setTope(-1);
	}
    
	/**
	 * getters y setters
	 * @return
	 */
	public Object[] getPilaEstatica() {
		return this.pilaEstatica;
	}

	public void setPilaEstatica(Object[] pilaEstatica) {
		this.pilaEstatica = pilaEstatica;
	}

	public Integer getTope() {
		return this.tope;
	}

	public void setTope(Integer tope) {
		this.tope = tope;
	}
    //-----------------------------------------------------------------//
 
	/**
	 * Métodos implementados de Apilable
	 */
	@Override
	public void resize(){		 
		 Object [] pilaEstaticaAux= new Object [pilaEstatica.length * 2 ];
		 for (int i=0; i < pilaEstatica.length; i++){
			 pilaEstaticaAux[i]=this.getPilaEstatica()[i];
			 }
		 this.pilaEstatica= pilaEstaticaAux; 
	}
	@Override
	public void apilar(Object o){		
		if(this.getTope()< this.getPilaEstatica().length -1){
			this.setTope(tope+1);
			this.getPilaEstatica()[tope]=o;
			System.out.println("SE APILO CORRECTAMENTE ");
		}
		else{
		      this.resize();
		      this.setTope(tope+1);
		      this.getPilaEstatica()[tope]=o;
		   System.out.println("SE INCREMENTO EL TAMAÑO DE LA PILA ");
		}
	}

	@Override
	public void desapilar() {
		  for(int i=this.getPilaEstatica().length-1; i>-1; i--)
			  this.getPilaEstatica()[i]=null;
		  this.mostrarPila();
	}
	
	public void mostrarPila(){
		System.out.println("Elementos de la Pila:");
		for(int i=0; i<this.getPilaEstatica().length;i++)
			System.out.println(this.getPilaEstatica()[i]);
	}
}
