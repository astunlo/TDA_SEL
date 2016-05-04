package matrices;

import java.util.Scanner;

public class Matriz {
  private Integer[][] matriz;
  static Scanner teclado=new Scanner(System.in);
  
    //Constructor que solicita filas y columnas
    public Matriz(Integer filas, Integer columnas){
    	this.matriz = new Integer[filas][columnas];
    	System.out.println("  filas: " + filas + "  columnas: " + columnas);
    }
    
    //Constructor por default
    public Matriz(){};
    
    //Constructor para matrices cuadradas
//    public Matriz(Integer filas_columnas){
//    	this.matriz = new Integer[filas_columnas][filas_columnas];
//    	System.out.println("  filas: " + filas_columnas + "  columnas: " + filas_columnas);
//    }
    
    
    //Constructor para matrices irregulares. Solicita sólo filas.
    public Matriz(Integer filas){
    	this.matriz = new Integer[filas][];
    	System.out.println("  filas: " + filas);
    }
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    	//matriz por constructor con parametros
    	System.out.println("Matriz Regular creada desde constructor con parametros de filas y columnas:");
    	Matriz m1=new Matriz(2, 2);
    	  m1.cargarMatriz();
    	  m1.imprimirMatriz();
    	//matriz por default; sin parametros.
    	System.out.println("------------------------------------------------------------------");
      	System.out.println("Matriz Regular con constructor por default; sin parámetros:");
    	Matriz m2=new Matriz();
    	  m2.dimensionarTamañoMatriz();
    	  m2.cargarMatriz();
    	  m2.imprimirMatriz();
    	//matriz irregular
    	System.out.println("------------------------------------------------------------------");
      	System.out.println("Matriz Irregular:");
    	Matriz m3=new Matriz(2);//carga cantidad de filas
    	  m3.dimensionarTamañoMatriz();
    	  m3.cargarMatriz();
    	  m3.imprimirMatriz();
    	  
    	  teclado.close();
			
	}//fin main
    
    public void dimensionarTamañoMatriz(){
    	System.out.println("\nTipo de matriz a dimensionar: ");
    	System.out.println("\t1) regular");
    	System.out.println("\t2) irregula");
    	Integer opcion=teclado.nextInt();
    	
    	switch(opcion){
    	    case 1:	System.out.print("\nIngrese cantidad de filas de la matriz:");
    	            Integer filas= teclado.nextInt();
    	            System.out.print("Ingrese cantidad de columnas de la matriz:");
    	            Integer columnas= teclado.nextInt();
    	            matriz= new Integer[filas][columnas];
    	            break;
    	    case 2: System.out.println("** La matriz tiene cargada " + matriz.length + " filas **");
    	            System.out.println("\nIngrese cantidad de elementos de la fila: ");	    
    	            for(int i=0; i<matriz.length; i++){
                           System.out.print("\t" + i + ": ");
    	                   Integer elementos= teclado.nextInt();
    	                   matriz[i]=new Integer[elementos];
    	                }
    	            break;
    	    default: break;
    	}//fin switch
    }//fin dimensionar
    
    public void cargarMatriz(){
    	System.out.println("Ingrese elementos a cargar (número entero): ");
    	for(int i=0; i<matriz.length;i++){
    		for(int j=0; j<matriz[i].length; j++){
    			System.out.print("fila [" + i + "] columna [" + j + "] :");    			
    		    matriz[i][j]=teclado.nextInt();
    		}
    	}
    }//fin cargar
    
    public void imprimirMatriz(){
    	System.out.println("\nMatriz cargada:");
    	for(int i=0; i<matriz.length;i++){
    		for(int j=0; j<matriz[i].length; j++){
    		    System.out.print(matriz[i][j] + " ");
    		}
    	   System.out.println();
    	}
    }//fin imprimir
    
}//fin clase
