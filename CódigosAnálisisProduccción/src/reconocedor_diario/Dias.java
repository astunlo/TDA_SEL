package reconocedor_diario;

import java.util.Scanner;

public class Dias {
  static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		Dias d= new Dias();
		String respuesta;
		do{
		   d.reconocerDia();
           System.out.println("¿Ingresa nuevamente? SI/NO"); 		  
		   respuesta= entrada.next();
		  }while(respuesta.equals("SI")||respuesta.equals("si")|respuesta.equals("Si")||respuesta.equals("sí")||respuesta.equals("Sí"));
	entrada.close();
	System.out.println("¡¡Gracias por utilizar el programa!!");
	
	}

	public void reconocerDia(){
		String dia;
		System.out.println("Ingrese un día de forma númerica o en letras: ");
		dia= entrada.next();
		System.out.println("Usted ingresó: " + dia);
		if(dia.equals("lunes")||dia.equals("martes")||dia.equals("miércoles")||dia.equals("jueves")||dia.equals("viernes")||dia.equals("sábado")||dia.equals("domingo")){
			System.out.println("Es un día de la semana\n");
		}else{			  
			    if(dia.equals("1")||dia.equals("2")||dia.equals("3")||dia.equals("4")||dia.equals("5")||dia.equals("6")||dia.equals("7")||dia.equals("8")||dia.equals("9")||
			       dia.equals("10")||dia.equals("11")||dia.equals("12")||dia.equals("13")||dia.equals("14")||dia.equals("15")||dia.equals("16")||dia.equals("17")||dia.equals("18")||
			       dia.equals("19")||dia.equals("20")||dia.equals("21")||dia.equals("22")||dia.equals("23")||dia.equals("24")||dia.equals("25")||dia.equals("26")||dia.equals("27")||
			       dia.equals("28")||dia.equals("29")||dia.equals("30")||dia.equals("31")){
			    	System.out.println("Es un día númerico de algún mes\n");
			    }else{System.out.println("***La entrada es inválida o está mal escrita****\n");}
		     }
	}
}
