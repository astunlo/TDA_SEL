package reflexion2;

import java.lang.reflect.*;

public class TestReflection2{

	public static void main(String[] args){
		String tarea1 = "Tarea1";
		String tarea2 = "Tarea2";
		String tarea3 = "Tarea3";
		String tarea4 = "Tarea4";
		String tarea5 = "Tarea5";

		//En este caso el supuesto parámetro de entrada seria–> “Tarea4″
		String param = tarea4;
		Class clase;
		Object objeto;
		Method ejecutarTarea;

		try{//Tray1
			// Cargamos la clase a partir del nombre
			//la ruta tiene que ser completa
			clase = Class.forName("reflexion2."+tarea4);
			try{//try2
				// creamos la instancia de la clase
				objeto = clase.newInstance();

				  try{//tray3
					 //obtenemos el método
					  ejecutarTarea = clase.getMethod("ejecutarTarea", null);
					 //ejecutamos el método
					  ejecutarTarea.invoke(objeto, null);
				     } catch (NoSuchMethodException e){
					          System.out.println("Error al acceder al método: " + e);
				     } catch (InvocationTargetException e) {
					          System.out.println("Error al ejecutar el método:" + e);
				     }//Fin tray 3 (Para método)
			    } catch (IllegalAccessException e) {
				         System.out.println("Error al instanciar el objeto: " + e);   
			    } catch (InstantiationException e) {
				         System.out.println("No se ha encontrado la clase: " + e);
			    }//Fin Tray 2 (Para instanciar objeto y encontrar clase)
		} catch (ClassNotFoundException e){
			      System.out.println("Error al instanciar el objeto: " + e); }//Fin Tray 1
	}
}

