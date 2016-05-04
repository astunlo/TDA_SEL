package division;

public class DivisionPorCeroExcepcion extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisionPorCeroExcepcion(){
		super("División por 0, imposible dividir\n");		
	}
	
	public DivisionPorCeroExcepcion(String mensaje){
		super(mensaje);
	}

}
