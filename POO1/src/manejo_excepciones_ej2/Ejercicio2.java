package manejo_excepciones_ej2;
/*
 * Ejercicio 2: Defina una referencia a un objeto e inicializela a null. Trate de
   invocar un método a través de esta referencia. Ahora rodee el código con
   una clausula try-catch para probar la nueva excepción.
 */
public class Ejercicio2 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Ejercicio2 ej2= new Ejercicio2();
		ej2=null;
		
		ej2.mostrarObjeto(ej2);
	}

	void mostrarObjeto(Object o){
		System.out.println(o);		
	}
}
