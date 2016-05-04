package Polimorfismo;

import java.util.Scanner;

class MiWebCam extends Software {
   private String tipoCamSoportada;
   //Boolean es objeto, inicializa en null; OJO...
   private Boolean camaraActiva;
   private Boolean microActivo;
   
   MiWebCam(String nombre, Float version, String fabricante, Integer codigo, Boolean registrado){
	  super(nombre, version, fabricante, codigo, registrado);	  
   }
   
   MiWebCam(){}
   
   //Métodos específicos
   void encenderCam(){
	   camaraActiva=true;
	   this.mostrarEstadoCam();
   }
   
   void desconectarCam(){
	   camaraActiva=false;  
	   this.mostrarEstadoCam();
   }
   
   void encenderMicro(){
	   microActivo=true;
	   this.mostrarEstadoMicro();
   }
   
   void desconectarMicro(){
	   microActivo=false;
	   this.mostrarEstadoMicro();
   }
   
   void mostrarEstadoCam(){
	   System.out.println("Cámara " + (camaraActiva?"ENCENDIDA":"APAGADA"));	   
   }
   
   void mostrarEstadoMicro(){
	   System.out.println("Micrófonos " + (microActivo?"ENCENDIDOS":"APAGADOS"));
   }
   
   @Override
   void cargarRequerimientosDeSistema(){
		entrada= new Scanner(System.in);
		System.out.println("Ingrese Sistemas Operativos Compatible(versión): ");
		Boolean respuesta=true;
		while(respuesta==true){
			this.getSistemasOperativosSoportados().add(entrada.next());
			System.out.print("Ingresa otro? 1->si/0->no");
			Integer continua=entrada.nextInt();
			if(continua==0)
				respuesta=false;
		}
		System.out.println("Ingrese Capacidad Mínima Requerida de:");
		System.out.print("   *Velocidad de la Unidad Central de Procesamiento-CPU (en Ghz): ");
		this.setVelocidadCPURequerida(entrada.nextFloat());
		System.out.print("   *Memoria RAM (en Mhz): ");
		this.setRamRequerida(entrada.nextDouble());
		System.out.print("   *Espacio en disco (en Mhz): ");
	    this.setDiscoEspacioRequerida(entrada.nextDouble());
	    System.out.println("   *Tipo de Cámaras soportadas (integradas, webCam o ambas):");
	    tipoCamSoportada= entrada.next();
	}
   @Override
   void mostrarRequerimientos(){
		System.out.println("Sistemas Operativos Sopertados:");
		for(String so: this.getSistemasOperativosSoportados())
			System.out.println("--> " + so);
		System.out.println("    * Velocidad Requerida del Micro Procesador Central: " + this.getVelocidadCPURequerida() + " Ghz.");
		System.out.println("    * Capacidad Requerida del memoria RAM: " + this.getRamRequerida() + " Mhz.");
		System.out.println("    * Espacio Disponible Requerido en disco: " + this.getDiscoEspacioRequerida() + " Mhz.");
	    System.out.println("    * Tipo de Cámara: " + tipoCamSoportada);
   }
   @Override
   void cargarNumeroDeRegistroPatente(Integer r){
		Integer registro=r;
		System.out.println("Patentado con el número: " + registro);		
	}
   @Override
   void imprimir(){
	   String representacion="";
	   representacion="***** SOFTWARE *****\n";
	   representacion+= "\nNombre: " + this.getNombre();
	   representacion+= "\nVersión: " + this.getVersion();
	   representacion+= "\nFabricante: " + this.getFabricante();
	   representacion+= "\nCódigo: " + this.getCodigo();
	   representacion+= "\nRegistrado: " + (this.registrado?"SI":"NO");
	   System.out.println(representacion); 
   }
}
