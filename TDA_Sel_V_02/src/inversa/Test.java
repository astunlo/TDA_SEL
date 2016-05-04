package inversa;

public class Test {

	public static void main(String[] args){


		Matriz m1= new Matriz(4);
		VectorMath v1=new VectorMath(4);
		m1.cargarMatriz();
		v1.cargarVector();
		System.out.println("\nDeterminante: " + m1.determinante());
		System.out.print("\nInversa: ");
		Matriz inversa= m1.matrizInversaPorGaussJordan();
		inversa.imprimirMatriz();        
		m1.resolverSistemaEcuacionesLineales(inversa, v1).imprimirVector();
		m1.calculoDeError(m1);                
	}
}
