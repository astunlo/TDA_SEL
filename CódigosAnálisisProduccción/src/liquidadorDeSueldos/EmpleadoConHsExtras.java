package liquidadorDeSueldos;

import java.util.Scanner;

public class EmpleadoConHsExtras extends Empleados {
	public Double horasExtras=0.0;
	static final Double TOPEEXTRAS=8.0;
		
	public EmpleadoConHsExtras(String n, String a, Integer dni){
		super(n, a, dni);
	}

	public void cargarHorasTrabajadas(){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de horas trabajadas por el empleado: ");
		Double horas = in.nextDouble();
		this.setHorasTrabajadas(horas);
		if(horas>40)
			horasExtras = horas - Empleados.TOPEHS;
		in.close();
	}	
	
	 public void liquidarSueldo(){
		 Double sueldoExtra;
		 Double sueldoNormal;
		 Double sueldo;
		 
		 if(horasExtras<=TOPEEXTRAS){
			 sueldoExtra= horasExtras*Empleados.VALORHSEXTRAS1;
		 }else{sueldoExtra= (TOPEEXTRAS*Empleados.VALORHSEXTRAS1)+((horasExtras-TOPEEXTRAS)*Empleados.VALORHSEXTRAS2);}
		 
		 if(this.getHorasTrabajadas()<=40){
		    sueldoNormal= this.getHorasTrabajadas()* Empleados.VALORHSNORMALES;
		 }else{sueldoNormal= Empleados.TOPEHS * Empleados.VALORHSNORMALES;}
		 sueldo= sueldoNormal + sueldoExtra;
		 
		 if(this.getHorasTrabajadas()<=40){
		   System.out.println("Sueldo por " + this.getHorasTrabajadas()+ "hs: $" + sueldoNormal);
		 }else{System.out.println("Sueldo por " + Empleados.TOPEHS + "hs: $" + sueldoNormal);}
		 System.out.println("Por " + horasExtras +" horas extras: $" + sueldoExtra);
		 System.out.println("Sueldo Total a Cobrar: $" + sueldo);
	 }
	 
	 public void liquidarAguinaldo(){};
	 public void liquidarVacaciones(){};
	 public void liquidacionFinal(){};    
	
	
	@Override
	public String toString() {
		String representacion;
		representacion = "Empleado:\n";
		representacion+= ("  Nombre: " + this.getNombre());
		representacion+= ("  Apellido: " + this.getApellido());
		representacion+= ("  DNI: " + this.getDni() + "\n");
		
		return (representacion);
	}

	
}
