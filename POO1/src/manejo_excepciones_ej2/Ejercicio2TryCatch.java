package manejo_excepciones_ej2;

public class Ejercicio2TryCatch {

	public static void main(String[] args) {
		String strg=null;
		try{
			System.out.println(strg.toString());
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Pasó por el catch y se resolvio excepcion con advertencia");			
		}
	}
}
