package caracter_vocal_cons_num;

import java.util.Scanner;

public class Caracteres {
    static Scanner entrada= new Scanner(System.in);
	
    public static void main(String[] args){
		Caracteres c= new Caracteres();
		c.cartelConsigna();
		Integer continua=1;
		
		  while(continua==1){
		     c.reconocerCaracter();
		     System.out.println("¿Desea ingresar nuevamente un caracter? Continua-----> 1 /n");
	         System.out.println("                                        NO Continúa--> 2 /n");
	         continua= entrada.nextInt();
	         switch(continua){
	         case 1: break;
	         case 2: break;
	         default: System.out.println("Valor erróneo. ¡¡ATENCIÓN!! Si vuelve a equivocarse SALDRA del PROGRAMA.\n");
	                  System.out.println("¿Desea ingresar nuevamente un caracter? Continua-----> 1 /n");
	                  System.out.println("                                        NO Continúa--> 2 /n");
	                  continua= entrada.nextInt();
	                  break;
	         }
	        }	
		entrada.close();
		System.out.println("¡¡Gracias por usar el programa!!");
	}//fin del main

	public void reconocerCaracter(){
		System.out.println("Ingrese un caracter a reconocer: ");
		//Aquí debe ir NEXT(), NOOO nextLine() para que no tome el caracter del while del main y lanza excepcion
		Character in= entrada.next().charAt(0);
		
		//Pregunta si es una Vocal
		if(in=='a'||in=='e'||in=='i'||in=='o'||in=='u'||in=='A'||in=='E'||in=='I'||in=='O'||in=='U'){
			System.out.println("Usted ingreso \"" + in + "\"");
			System.out.println("El caracter ingresado es una vocal");
		}else{
			  //¿no?, pregunta si es una consonante
			  if(in=='b'||in=='B'||in=='c'||in=='C'||in=='d'||in=='D'||in=='f'||in=='F'||in=='g'||in=='G'||in=='h'||in=='H'||
				 in=='j'||in=='J'||in=='k'||in=='K'||in=='l'||in=='L'||in=='m'||in=='M'||in=='n'||in=='N'||in=='ñ'||in=='Ñ'||
				 in=='p'||in=='P'||in=='q'||in=='Q'||in=='r'||in=='R'||in=='s'||in=='S'||in=='t'||in=='T'||in=='v'||in=='V'||
				 in=='w'||in=='W'||in=='x'||in=='X'||in=='y'||in=='Y'||in=='z'||in=='Z'){
				      System.out.println("Usted ingreso \"" + in + "\"");
				      System.out.println("El caracter ingresado es una consonante");
			   }else{	
				     //¿no?, pregunta si es un número
				   //NOOO OLVIDAR poner '(comilla simple) a los números para que sean considerados CARACTERES
				     if(in.equals('0')||in.equals('1')||in.equals('2')||in.equals('3')||in.equals('4')||in.equals('5')||in.equals('6')||in.equals('7')
				       ||in.equals('8')||in.equals('9')){
				    	   System.out.println("Usted ingreso \"" + in + "\"");
						   System.out.println("El caracter ingresado es un numero");
					    	
					 }else{
						   //entonces es un símbolo
						     System.out.println("Usted ingreso \"" + in + "\"");
					         System.out.println("El caracter ingresado es un símbolo");
					       }
                     }
			  }//fin de método
	  }
      
	  public void cartelConsigna(){
		  String representacion;
		  representacion="***         RECONOCEDOR DE CARACTERES O NUMEROS          ***\n";
		  representacion+="                    EXCEPTO SÍMBOLOS                       \n";
		  representacion+="_____________________________________________________________\n";
		  representacion+="            SOLO DEBE INGRESAR UN CARACTER.\n";
		  representacion+="o si ingresa una palabra o n°  Solo Tomará el Primer Caracter\n";
		  representacion+="_____________________________________________________________\n";
		  System.out.println(representacion);		  
	  }//fin de método	
}//fin de clase
