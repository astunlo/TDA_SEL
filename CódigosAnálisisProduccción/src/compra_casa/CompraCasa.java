/**
 * Compra Casa por Ingresos [JAVA] [POO]
=> Un cliente desea comprar una casa, la entidad exige el valor de los ingresos del cliente. 
Si los ingresos son menos a $12.000 el cliente pagara como cuota inicial el 15% sobre el valor de la casa
y  el resto se pagara en 10 cuotas. Si los ingresos son mas de $12.000 la cuota inicial sera del 30% sobre 
el valor de la casa y el resto se pagara en 7 cuotas. El programa debe mostrar el valor de la cuota inicial 
y el total a pagar de las cuotas restantes
 */

package compra_casa;

import java.util.*;

public class CompraCasa {
	static final Double TOPEINGRESOSCLIENTE = 12.000;
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		CompraCasa comprador = new CompraCasa();
		String respuesta;
		
		do{
			comprador.pantallaInicial();
			comprador.calcularAnticipoYCuotas();
			System.out.println("¿Desea calcular otra vez?");
		    respuesta = entrada.next();
		}while(respuesta.equals("si"));
		System.out.println("¡¡Gracias!!");
		
	}//fin de main
	

	public void calcularAnticipoYCuotas(){
		Double ingresosComprador;
		Double valorInmueble;
		Double cuotaInicial;
		Double cuotas;
		
	    System.out.println("Cargue los ingresos del Cliente: $ ");
	    ingresosComprador = entrada.nextDouble();
	    System.out.println("INgrese el valor del Inmueble: $ ");
	    valorInmueble = entrada.nextDouble();
	    if(ingresosComprador <= TOPEINGRESOSCLIENTE){
	    	cuotaInicial = valorInmueble*0.15;
	    	cuotas = (valorInmueble - cuotaInicial)/10;	
	    	System.out.println("Ingresos Declarados: $" + ingresosComprador + "\n");
			System.out.println("Valor del Inmueble: $" + valorInmueble + "\n");
			System.out.println("Cuota inicial al 15%: $" + cuotaInicial + "\n" );
			System.out.println("Restan 10 cuotas de $" + cuotas);
	    }else{
	    	cuotaInicial = valorInmueble*0.30;
	    	cuotas = (valorInmueble - cuotaInicial)/7;
	    	System.out.println("Ingresos Declarados: $" + ingresosComprador + "\n");
			System.out.println("Valor del Inmueble: $" + valorInmueble + "\n");
			System.out.println("Cuota inicial al 30%: $" + cuotaInicial + "\n" );
			System.out.println("Restan 7 cuotas de $" + cuotas);
	    }
	}
	
	public void pantallaInicial(){
		String representacion;
		representacion = "                Venta de Inmuebles\n";
		representacion+= "*** Calcular cuota inicial y cuotas restantes ***\n";
		representacion+="----------------------------------------------------\n";
		System.out.println(representacion);
	}
}
