/**
 * Algoritmo de ordenamiento numérico;
 */
package vector;

import java.util.Scanner;

public class AlgoritmosDeOrdenamiento {
   
	static Integer[] enteros;//SOLO ES STATIC para poder ser usado por Merge(que es un método static), si no, no es necesario
	
	
	
	public static void main(String[] args) {
            AlgoritmosDeOrdenamiento on= new AlgoritmosDeOrdenamiento();
            on.cargarVector();
            on.ordenarBurbuja();
            on.ordenarBurbujaOptimizada();
            on.ordenarPorInsercion();
            on.ordenamientoShellSort();
            on.ordenarPorSeleccion();
            on.ordenamientoPorQuicksort(0, 0);//la carga de los pivotes debe adecuarse a la capacidad del vector
            AlgoritmosDeOrdenamiento.ordenamientoMergesort(0, 1);//** Como son static, debo llamarlos desde la Clase **
            AlgoritmosDeOrdenamiento.ordenamientoMerge(0, 1, 2);
            
	}

	void cargarVector(){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese cantidad de numeros a ordenar: ");
		Integer capacidad=teclado.nextInt();
		enteros=new Integer[capacidad];
		for(int i=0; i<enteros.length; i++){
			System.out.print("Número " + (i+1) + "de "+ capacidad + ": ");
			enteros[i]=teclado.nextInt();
		}
		System.out.println("\nVector de enteros: ");
		for(int i=0; i<enteros.length; i++){
		     System.out.print(enteros[i] + "  ");
		}
		teclado.close();
	}
    
	//***ORDENAMIENTOS ITERATIVOS***
	////////////////////////////////
	
	void ordenarBurbuja(){
		//Capacidad -1. Porque la cantidad de comparaciones es hasta ahí.
		for(int i=0; i<(enteros.length-1); i++){
			//paso fundamental**************************
			for(int j=0; j<((enteros.length-1)-i); j++){//resta "i" porque cada vez es menor la cant a comparar
				//**************************************
                 if(enteros[j]>enteros[j+1]){//de menor a mayor. Al revés debo invertir símbolo "<"
					Integer auxiliar=enteros[j];
					enteros[j]=enteros[j+1];
					enteros[j+1]=auxiliar;
				}
			}
		}
		System.out.println("\nVector ordenado por Burbuja Simple: ");
		for(int i=0; i<enteros.length; i++){
			System.out.print(enteros[i] + "  ");
		}
	}
	
	void ordenarBurbujaOptimizada(){
	      Integer buffer;
	      Integer i,j;
	      for(i=0; i<enteros.length; i++){
	           for(j=0; j<i; j++){
	                if(enteros[i]<enteros[j]){
	                     buffer=enteros[j];
	                     enteros[j]=enteros[i];
	                     enteros[i]=buffer;
	                   }
	               }
	          }
	      System.out.println("\nVector ordenado por Burbuja Optimizada: ");
			for(i=0; i<enteros.length; i++){
				System.out.print(enteros[i] + "  ");
			}
	}
	/*El bucle principal de la ordenacion por insercion va examinando sucesivamente todos
     los elementos de la matriz desde el segundo hasta el n-ésimo, e inserta cada uno en el
     lugar adecuado entre sus precedesores dentro de la matriz.*/
	void ordenarPorInsercion(){
	    Integer i, temp, j;
	    for(i=1; i<enteros.length; i++){
	          temp=enteros[i];
	          j=i-1;
	          while((enteros[j]>temp)&&(j>=0)){
	               enteros[j+1]=enteros[j];
	               j--;
	              }
	          enteros[j+1]=temp;
	         }
	    System.out.println("\nVector ordenado por Inserción: ");
		for(i=0; i<enteros.length; i++){
			System.out.print(enteros[i] + "  ");
		}
	}
	
	//Uma mejora de Inserción: ShellSort
	void ordenamientoShellSort(){
	     for(int incremento=enteros.length/2; incremento>0; incremento=(incremento==2? 1:(int) Math.round(incremento/2.2))){
	         for(int i=incremento; i<enteros.length; i++){
	             for(int j=i; j>=incremento && enteros[j-incremento]>enteros[j]; j-=incremento){
	                   int temp=enteros[j];
	                   enteros[j]=enteros[j-incremento];
	                   enteros[j-incremento]=temp;
	                 }
	             }
	        }
	     System.out.println("\nVector ordenado por ShellSort: ");
			for(int i=0; i<enteros.length; i++){
				System.out.print(enteros[i] + "  ");
			}
	}
	
	/*La ordenacion por selección funciona seleccionando el menor elemento de la matriz y
      llevandolo al principio; a continuacion selecciona el siguiente menor y lo pone en la
      segunda posicion de la matrizm y asi sucesivamente.*/
	
	void ordenarPorSeleccion(){
	      Integer i, k, p, buffer;
	      Integer limite=enteros.length-1;
	      for(k=0; k<limite; k++){
	           p=k;
	           for(i=k+1; i<=limite; i++)
	               if(enteros[i]<enteros[p]) 
	            	       p=i;
	               if(p!=k){
	                 buffer=enteros[p];
	                 enteros[p]=enteros[k];
	                 enteros[k]=buffer;
	                }
	          }
	      System.out.println("\nVector ordenado por Selección: ");
			for(i=0; i<enteros.length; i++){
				System.out.print(enteros[i] + "  ");
			}
	 }
	
	//***ORDENAMIENTOS RECURSIVOS***
    ////////////////////////////////
	
	//Rápido (QuickSort)
	/*Este metodo es el más rápido
    gracias a sus llamadas recursivas, basandose en la teoria de divide y vencerás.
    Divide recurvisamente el vector en partes iguales,indicando un elemento de inicio, 
    fin y un pivote (o comodin) que nos permitira segmentar nuestra lista. 
    Una vez dividida, lo que hace, es dejar todos los mayores que el pivote a su derecha 
    y todos los menores a su izq. Al finalizar el algoritmo, nuestros elementos estan ordenados.*/
	
	public void ordenamientoPorQuicksort(int a, int b){
	    Integer buffer;
	    Integer from=a;
	    Integer to=b;
	    Integer pivot=enteros[(from+to)/2];
	    do{
	        while(enteros[from]<pivot){
	               from++;
	             }
	        while(enteros[to]>pivot){
	               to--;
	             }
	        if(from<=to){
	             buffer=enteros[from];
	             enteros[from]=enteros[to];
	             enteros[to]=buffer;
	             from++; 
	             to--;
	           }
	       }while(from<=to);
	
	    if(a<to){
	        ordenamientoPorQuicksort(a, to);
	    }
	    
	    if(from<b){
	        ordenamientoPorQuicksort(from, b);
	    }
	    
	    System.out.println("\nVector ordenado por QuickSort: ");
		for(int i=0; i<enteros.length; i++){
			System.out.print(enteros[i] + "  ");
		}	    
	 }
	
	//Mezcla (MergeSort)
	    //1ra parte: división del vector en partes
	public static void ordenamientoMergesort(Integer init, Integer n){
	    Integer n1;
	    Integer n2;
	    if (n>1){
	       n1=n/2;
	       n2=n-n1;
	       ordenamientoMergesort(init, n1);
	       ordenamientoMergesort(init + n1, n2);
	       ordenamientoMerge(init, n1, n2);
	     }
	}
	    //2da parte: ordenamiento
	private static void ordenamientoMerge(Integer init, Integer n1, Integer n2){
	    Integer[] buffer = new Integer[n1+n2];
	    Integer temp=0;
	    Integer temp1=0;
	    Integer temp2=0;
	    
	    while((temp1<n1)&&(temp2<n2)){
	        if(enteros[init+temp1]<enteros[init+n1+temp2])
	           buffer[temp++]=enteros[init + (temp1++)];
	        else
	           buffer[temp++]=enteros[init+n1+(temp2++)];
	       }
	   
	    while(temp1<n1)
	        buffer[temp++]=enteros[init+(temp1++)];
	   
	   while(temp2<n2)
	        buffer[temp++]=enteros[init+n1+(temp2++)];
	   
	   for (int i=0; i<n1+n2; i++)
	       enteros[init+i]=buffer[i];
	   
	   System.out.println("\nVector ordenado por MergeSort: ");
		for(int i=0; i<enteros.length; i++){
			System.out.print(enteros[i] + "  ");
		}	   
	}
}
