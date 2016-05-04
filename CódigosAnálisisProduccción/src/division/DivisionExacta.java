package division;

import java.util.Scanner;

public class DivisionExacta{

	public static void main(String[] args) throws DivisionPorCeroExcepcion {
		DivisionExacta d= new DivisionExacta();
		
		d.dividirExacto();

	}

	public void dividirExacto ()throws DivisionPorCeroExcepcion{
		Scanner entrada = new Scanner(System.in);
		Double numerador=0.0;
		Double denominador=0.0;
		Double cociente=0.0;
		Integer volver=1;
		System.out.println("Ingrese un valor para el numerador: ");
		numerador = entrada.nextDouble();
		while(volver==1){
		   System.out.println("Ingrese un valor para el denominador: ");
		   denominador = entrada.nextDouble();
		try{
			if(denominador==0){
				throw new DivisionPorCeroExcepcion();
			    }else{volver=0;}
		    }catch(DivisionPorCeroExcepcion e){
				e.printStackTrace();
			    volver=1;
		        }
		}
		
		if(numerador%denominador==0){
			cociente= numerador/denominador;
			System.out.println("El cociente es: " + cociente);
		}else{
			System.out.println("La división entre los números ingresados NO es exacta\n");
		}
	 
		entrada.close();
	}
}
