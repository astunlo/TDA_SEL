/**
 * Confeccionar un programa que permita cargar los nombres de 5 operarios y sus sueldos respectivos. 
 * Mostrar el sueldo mayor y el nombre del operario.
 */
package vector;

import java.util.Scanner;

public class MayorSueldo{

	private Float[] sueldos;
	private String[] empleados;

	public static void main(String[] args) {
		MayorSueldo ms= new MayorSueldo();
		ms.cargarEmpleadoYSueldo();
		ms.calcularMayorSueldo();

	}

	public void cargarEmpleadoYSueldo(){
		Scanner teclado= new Scanner(System.in);
		Integer capacidad;
		   System.out.print("Ingrese la cantidad de empleados a ingresar: ");
		      capacidad=teclado.nextInt();
		sueldos=new Float[capacidad];
		empleados=new String[capacidad];
		teclado.nextLine();//limpieza de buffer

		for(int i=0; i<empleados.length; i++){
			System.out.print("\nIngrese Nombre del Empleado: ");
			empleados[i]=teclado.nextLine();
			System.out.print("\nIngrese sueldo del Empleado: $");
			sueldos[i]=teclado.nextFloat();
			teclado.nextLine();
		}
		System.out.println("Quedó grabado: ");
		for(int i=0; i<empleados.length;i++){
			System.out.println("\t"+ empleados[i] + "--> $" + sueldos[i] );
		}
		teclado.close();
	}
	
	public void calcularMayorSueldo(){
		Float mayorSueldo=sueldos[0];
		Integer indice=0;
		for(int i=0; i<empleados.length;i++){
			if(mayorSueldo<sueldos[i]){
				mayorSueldo=sueldos[i];
				indice=i;
			}
		}
		System.out.println("El mayor sueldo es de $" + mayorSueldo + " y pertenece a " + empleados[indice] );
	}
}
