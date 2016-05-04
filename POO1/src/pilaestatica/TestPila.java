package pilaestatica;

public class TestPila {
	public static void main(String[] args) {
		PilaEstatica pilita= new PilaEstatica();
		pilita.apilar(10);
		pilita.apilar(20);
		pilita.mostrarPila();
		pilita.desapilar();
	}
}
