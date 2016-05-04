package vector;
import java.util.Scanner;

public class OrdenamientoAlfabetico {
        String[] palabras;	
	
	public static void main(String[] args) {
          OrdenamientoAlfabetico oa= new OrdenamientoAlfabetico();
          oa.cargarVector();
          oa.ordenarVector();
	}
	
	void cargarVector(){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese cantidad de palabras a ordenar: ");
		Integer capacidad=teclado.nextInt();
		palabras=new String[capacidad];
		teclado.nextLine();
		for(int i=0; i<palabras.length; i++){
			System.out.print("Palabra " + (i+1) + " de "+ capacidad + ": ");
			palabras[i]=teclado.nextLine();
		}
		System.out.println("\nLista de palabras: ");
		for(int i=0; i<palabras.length; i++){
		     System.out.print(palabras[i] + "  ");
		}
		teclado.close();
	}
    
	void ordenarVector(){
		//Capacidad -1. Porque la cantidad de comparaciones es hasta ahí.
		for(int i=0; i<(palabras.length-1); i++){
			//paso fundamental**************************
			for(int j=0; j<((palabras.length-1)-i); j++){//resta "i" porque cada vez es menor la cant a comparar
				//**************************************
                 if(palabras[j].compareTo(palabras[j+1])>0){
					String auxiliar=palabras[j];
					palabras[j]=palabras[j+1];
					palabras[j+1]=auxiliar;
				}
			}
		}
		System.out.println("\nVector ordenado: ");
		for(int i=0; i<palabras.length; i++){
			System.out.print(palabras[i] + "  ");
		}
	}

	
}
