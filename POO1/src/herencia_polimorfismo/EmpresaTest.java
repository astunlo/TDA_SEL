package herencia_polimorfismo;

//Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa y sin hijos.
//Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 años de antigüedad
//Un empleado de Planta Permanente (que no sea gerente) con 80 horas trabajadas, con esposa, 2 hijos y 6 años de antigüedad.
//Un empleado de Planta Permanente (que no sea gerente) con 160 horas trabajadas, sin esposa, sin hijos y con 4 años de antigüedad.

public class EmpresaTest {

	public static void main(String[] args) {
		EmpleadoPlantaTemporal jorge= new EmpleadoPlantaTemporal("Jorge Arias", true, 0, 80);
		Gerente gastón=new Gerente("Gastón López", true, 1, 160, 10);
        EmpleadoPlantaPermanente vanesa=new EmpleadoPlantaPermanente("Vanesa Ruiz", false, 0, 160, 4);
        EmpleadoPlantaPermanente mario=new EmpleadoPlantaPermanente("Mario Martinez", true, 2, 80, 6);
        Empresa empresa=new Empresa();
        EmpresaTest test= new EmpresaTest();
        
        jorge.cobrarSalario();
        gastón.cobrarSalario();
        vanesa.cobrarSalario();
        mario.cobrarSalario();
        
        empresa.cargarEmpleado(jorge);
        empresa.cargarEmpleado(gastón);
        empresa.cargarEmpleado(vanesa);
        empresa.cargarEmpleado(mario);
        
        test.imprimirDatosEmpresa();
        System.out.println("EMPLEADOS:");
        System.out.println("---------------------------------------");
        test.imprimirDatosEmpleados(jorge);
        test.imprimirDatosEmpleados(gastón);
        test.imprimirDatosEmpleados(vanesa);
        test.imprimirDatosEmpleados(mario);
        System.out.println("************************************************************");
        empresa.montoTotalAPagar();
        System.out.println("Total a Pagar: $" + empresa.getMontoTotalAPagar());
    }
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	//Métodos de EmpresaTest
	void imprimirDatosEmpresa(){
		System.out.println("        Empresa");
		System.out.println("\t" + Empresa.RAZONSOCIAL );
		System.out.println("CUIT " + Empresa.CUIT);
		System.out.println("*******************************************");
		System.out.println(" Valor Esposa: $" + Empleado.SALARIOESPOSA + ", Valor Hijo: $" + Empleado.SALARIOHIJO + "\n");
	}
	
	void imprimirDatosEmpleados(EmpleadoPlantaPermanente e){
		    System.out.println("PLANTA PERMANENTE:");
		    System.out.println("  Valor Hora: $" + e.getMontoPorHora() + ", Antigüedad:$ "+ e.get$porAñoAntigüedad() +"\n");
	        System.out.println("Nombre y Apellido: " + e.getApellidoYNombre());
	        System.out.println("---------------------------------------");
	        System.out.println("Salario:");
	        System.out.println("    Esposa: " + (e.getConyuge()?"Sí":"No tiene"));
	        System.out.println("    Hijo/s: " + e.getHijos());
	        System.out.println("----------------------------------------");
	        System.out.println("Importe a pagar por salario: $" + e.cobrarSalarioFamiliar());
	        System.out.println("Sueldo por " + e.getHorasTrabajadas()+ "hs trabajadas, con " + e.getAntigüedad() + " años de antigüedad: $" + e.getMontoTotalACobrar());
	        System.out.println("----------------------------------------");
	        System.out.println(" ");
	}
	
	void imprimirDatosEmpleados(EmpleadoPlantaTemporal e){
		    System.out.println("PLANTA TEMPORAL:");
		    System.out.println("  Valor Hora: $" + e.getMontoPorHora()+ "\n");
	        System.out.println("Nombre y Apellido: " + e.getApellidoYNombre());
	        System.out.println("---------------------------------------");
	        System.out.println("Salario:");
	        System.out.println("    Esposa: " + (e.getConyuge()?"Sí":"No tiene"));
	        System.out.println("    Hijo/s: " + e.getHijos());
	        System.out.println("----------------------------------------");
	        System.out.println("Importe a pagar por salario: $" + e.cobrarSalarioFamiliar());
	        System.out.println("Sueldo por " + e.getHorasTrabajadas()+ "hs trabajadas: $" + e.getMontoTotalACobrar());
	        System.out.println("----------------------------------------");
	        System.out.println(" ");
	}
	
	void imprimirDatosEmpleados(Gerente g){
		    System.out.println("GERENTE:");
		    System.out.println("  Valor Hora: $" + g.getMontoPorHora() + ", Antigüedad:$ "+ g.get$porAñoAntigüedad()+"\n");
	        System.out.println("Nombre y Apellido: " + g.getApellidoYNombre());
	        System.out.println("---------------------------------------");
	        System.out.println("Salario:");
	        System.out.println("    Esposa: " + (g.getConyuge()?"Sí":"No tiene"));
	        System.out.println("    Hijo/s: " + g.getHijos());
	        System.out.println("----------------------------------------");
	        System.out.println("Importe a pagar por salario: $" + g.cobrarSalarioFamiliar());
	        System.out.println("Sueldo por " + g.getHorasTrabajadas()+ "hs trabajadas, con " + g.getAntigüedad() + " años de antigüedad: $" + g.getMontoTotalACobrar());
	        System.out.println("----------------------------------------");
	        System.out.println(" ");
	}
}
