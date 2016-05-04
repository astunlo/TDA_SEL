/**
 * Valor Compra - NUm Azar [JAVA] [POO]
=> en un supermercado realizan una promocion: se le da al cliente un numero al azar, 
y dependiendo del numero que caiga el cliente tendra un descuento en el valor de su compra;
Si el numero es menor a 52 el cliente tiene un 15% de descuento 
Si el numero es mayor a 52 el cliente tiene un 20% de descuento.
 */
package Promo_Tombola;

import java.util.Random;
import java.util.Scanner;

public class PromoAzar {
    Random numero = new Random();
    static Scanner entrada = new Scanner(System.in);
    
    //main
	public static void main(String[] args) {
		PromoAzar promo = new PromoAzar();
		promo.tombola();
	}

	//método de clase
	public void tombola(){
		Integer suerte = numero.nextInt(100);
		System.out.println("Ingrese valor de la venta: $ ");
		float venta = entrada.nextFloat();
		System.out.println("Valor de la venta antes del sorteo: $" + String.format("%.2f", venta));
		
		if(suerte<=52){
			float descuento = (float) (venta*0.15);
			float ventaNeta = (float) (venta - descuento);
			System.out.println("Número al azar que le ha tocado: ****" + suerte + "****\n");
			System.out.println("Su suerte hizo que su venta tenga un 15% de descuento: $" + String.format("%.2f", descuento));
			System.out.println("Usted abonará $" + String.format("%.2f", ventaNeta));
		}else{
			float descuento = (float) (venta*0.20);
			float ventaNeta = (float) (venta - descuento);
			System.out.println("Número al azar que le ha tocado: ****" + suerte + "****\n");
			System.out.println("Su suerte hizo que su venta tenga un 20% de descuento: $" + String.format("%.2f", descuento));
			System.out.println("Usted abonará $" + String.format("%.2f", ventaNeta));
		}
	}
}
