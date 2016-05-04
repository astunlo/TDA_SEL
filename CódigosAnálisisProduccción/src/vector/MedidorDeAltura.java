/**
 * Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.

Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.
 */

package vector;
import java.util.Scanner;

public class MedidorDeAltura {
    private Float[] altura;
    	
	public static void main(String[] args) {
		MedidorDeAltura ma= new MedidorDeAltura();
		
		ma.cargadorDeAlturas();
		System.out.println("----------------------------------------------");
		System.out.println("Promedio entre las alturas: " + ma.calcularPromedioDeAlturas() + "m\n");
		ma.clasificadorAlturasEnBaseAlPromedio();
		
	}
   
	public void cargadorDeAlturas(){
		altura= new Float[5];
		Scanner teclado= new Scanner(System.in);
		System.out.println("*** Carga de 5 alturas ***");
		for(int i=0; i<altura.length; i++){
		System.out.println("Ingrese la altura de la persona " + (i+1));
		altura[i]=teclado.nextFloat();		
		}
		System.out.println("Las alturas cargadas son: ");
		for(int i=0; i<altura.length;i++)
			System.out.println("\t"+ altura[i]+"m");
			
		teclado.close();
	}
	
	public Float calcularPromedioDeAlturas(){
		Float suma= (float)0;
		Float promedio=(float)0;
		for(int i=0; i<altura.length;i++){
			suma+= altura[i];
		    }
		promedio=suma/5;
		return promedio;
	}
	
	public void clasificadorAlturasEnBaseAlPromedio(){
		Integer masAltas=0;
		Integer masBajas=0;
		Integer iguales=0;
		for(int i=0; i<altura.length;i++){
			if(altura[i]<this.calcularPromedioDeAlturas()){
				masBajas++;
			}else{
				  if(altura[i]>this.calcularPromedioDeAlturas()){
					  masAltas++;
				  }else{iguales++;}
			     }
		}
		System.out.println("Personas más altas que el promedio de altura: " + masAltas);
		System.out.println("Personas más bajas que el promedio de altura: " + masBajas);
		System.out.println("Personas iguales al promedio de altura: " + iguales);
	}
}
