package colecciones;

public class PilaTest {

	public static void main(String[] args) throws PilaVaciaException {
		PilaDinamica<Integer> pila1= new PilaDinamica<>();
		pila1.poner(1);
		pila1.poner(2);
		pila1.poner(3);
		Integer elemento= pila1.ver();
		System.out.println("Último elemento cargado " + elemento);
		Boolean estado= pila1.vacia();
		System.out.println("¿Está vacía? " + (estado?"Si":"No"));
		pila1.sacarUnElemento();
		elemento=pila1.ver();
		System.out.println("Se sacó el último y ahora queda en tope: " + elemento);
			
	}

}
