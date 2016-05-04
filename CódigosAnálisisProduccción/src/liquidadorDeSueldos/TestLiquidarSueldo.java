package liquidadorDeSueldos;

public class TestLiquidarSueldo {

	public static void main(String[] args) {
		EmpleadoConHsExtras Gastón= new EmpleadoConHsExtras("Gastón","López" , 25638349);
        System.out.println(Gastón);
		Gastón.cargarHorasTrabajadas();
        Gastón.liquidarSueldo();
        }
}
