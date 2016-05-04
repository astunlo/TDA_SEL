package liquidadorDeSueldos;

public abstract class Empleados implements Liquidable{
	protected String nombre;
	protected String apellido;
	protected Integer dni;
	protected Double horasTrabajadas;
	static final Double TOPEHS=40.0;
	static final Double VALORHSNORMALES=200.0;
	static final Double VALORHSEXTRAS1=400.0;
	static final Double VALORHSEXTRAS2=600.0;
	Empleados(String n, String a, Integer dni){
		this.setNombre(n);
		this.setApellido(a);
		this.setDni(dni);
	}

	//Métodos
	public abstract void liquidarSueldo();
    public abstract void liquidarAguinaldo();
    public abstract void liquidarVacaciones();
    public abstract void liquidacionFinal();    
	
	//Getters
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public Double getHorasTrabajadas(){
		return horasTrabajadas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public void setHorasTrabajadas(Double horasTrabajadas){
		this.horasTrabajadas = horasTrabajadas;
	}

}
