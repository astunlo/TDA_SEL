package cola;

public class TestCola {

	public static void main(String[] args) {
	
		ColaDinamica cd1= new ColaDinamica();
		System.out.println(cd1.isEmpty());
		cd1.encolar(25);
		cd1.encolar(35);
		cd1.encolar(45);
		System.out.println(cd1.isEmpty());
		cd1.desencolar();
		cd1.desencolar();
		cd1.desencolar();
		System.out.println(cd1.isEmpty());
		
	}

}
