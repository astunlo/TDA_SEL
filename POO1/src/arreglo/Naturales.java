package arreglo;
/*Sumar los 1000 primeros números naturales
(1+2+3+4+...+1000), imprimiendo por cada suma el
resultado parcial obtenido.
Comprobar si un entero es par o impar.*/

public class Naturales {
    int naturales[]= new int[4];
    
    void cargarVector(){
    	
    	for(int i=0; i<naturales.length;i++){
    		naturales[i]=i+1;
    	}
    	for(int i:naturales)
    		System.out.print(i + " ");
    	System.out.println();
    }
    
    void sumaNaturales(){
    	int sumaParcial=0;
    	int sumaTotal=0;
    	System.out.println("La suma de...");
    	for(int i=0; i<naturales.length;i++){
    		      sumaTotal=sumaParcial + naturales[i];
    		       loop: for(int j=0; j<naturales.length;j++){
                          int patron=i;      		    	  
    		    	         switch(patron){
    		    	            case 0: System.out.println("0 + " + naturales[i] + " = " + sumaTotal);
    		    	                    sumaParcial++; 
    		    	                    break loop;
    		    	            case 1: System.out.println("1 + " + naturales[i] + " = " + sumaTotal);
    		    	                    sumaParcial++; 
    		    	                     break loop;  
    		                    default: break;
    		    	          }
    		    	       System.out.print(naturales[j]);
    		    	       if(j<naturales.length-1)
    		    	    	   System.out.print(" + ");
    		    	       if(j==naturales.length-1)
    		    	       System.out.print(" = " + sumaTotal);
    		         }
    		     
                 System.out.println("\n" + ((sumaTotal%2==0)?"número par.\n":"número impar.\n"));
    	       }
    	}
    
	public static void main(String[] args) {
		Naturales n=new Naturales();
		n.cargarVector();
		n.sumaNaturales();
	}
}
