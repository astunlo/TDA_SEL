package reflexion;

import java.lang.reflect.Method; 

public class ReflectApp{ 
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) { 
		//Sin parámetros 
		  Class sinParametros[] = {}; 
		//Parámetros String 
		  Class[] paramString = new Class[1]; 
		       paramString[0] = String.class; 
		//Parámetros Integer 
		  Class[] paramInt = new Class[1]; 
		       paramInt[0] = Integer.class; //si el parametro es "int"(primitiva)-->Integer.TYPE
		
		    try{ 
		          //lectura de la Clase AppTest en tiempo de Ejecución: 
		             Class cls = Class.forName("reflexion.AppTest"); 
		             Object obj = cls.newInstance(); 
		             System.out.println(obj.getClass().getName());
		             System.out.println(obj.getClass().getConstructors());
		             System.out.println(obj.getClass().getFields());
		             System.out.println(obj.getClass().getModifiers());
		          
		          //Llamada al método imprimirEsto: Method method = cls.getDeclaredMethod("imprimirEsto", sin parámetros). 
		             Method method = cls.getMethod("imprimirEsto", sinParametros);
		             method.invoke(obj, null); 
		          
		          //Llamada al método imprimirString, se le pasa un String:
		             method = cls.getDeclaredMethod("imprimirUnString", paramString); 
		             method.invoke(obj, new String("Edad de Gastón: ")); 
		          
		          //Llamada al método imprimirEntero, se le pasa Integer: 
		             method = cls.getDeclaredMethod("imprimirEntero", paramInt); 
		             method.invoke(obj, 39); 
		          
		          //Llamada al método setContador, se le pasa Integer: 
		             method = cls.getDeclaredMethod("setContador", paramInt); 
		             method.invoke(obj, 10); 
		
		          //Lllamada al método imprimirContador: 
		              method = cls.getDeclaredMethod("imprimirContador", sinParametros); 
		              method.invoke(obj, null); 
		              
		         }catch(Exception ex){ 
		                              ex.printStackTrace(); 
		                      } 
		                }
}

