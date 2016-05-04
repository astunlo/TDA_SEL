package arreglo;

/*Imprimir los 20 primeros números enteros positivos.*/

public class Positivos {
    int positivos[]= new int[20];
    
    void inicializarArreglo(){
    	for(int i=0; i<positivos.length;i++)
    		positivos[i]=i;
    }
    
    void sumar20prmeroPositivos(){
    	int suma=0;
    	for(int i=1; i<positivos.length; i++)
    		    suma+= positivos[i];
        System.out.print("La suma de los positivos del 1 al 20 es: " + suma);
    }
	public static void main(String[] args) {
		Positivos p=new Positivos();
		p.inicializarArreglo();
		p.sumar20prmeroPositivos();
	}

}
