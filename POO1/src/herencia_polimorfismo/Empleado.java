package herencia_polimorfismo;

abstract class Empleado implements Pagable{
	/**
	 * @param horasTrabajadas: horas enteras;
	 * @param antigúedad: años enteros cumplidos;
	 * @param conyuge-->esposa(si/no)--->true/false;
	 */
	
	protected String apellidoYNombre;
	protected Boolean conyuge;
	protected Integer hijos;
	protected Integer horasTrabajadas;
	protected Double montoPorHora;	
		
	Empleado(String apNom, Boolean cony, Integer hij, Integer hsTrab){
		this.setApellidoYNombre(apNom);
		this.setConyuge(cony);
		this.setHijos(hij);
		this.setHorasTrabajadas(hsTrab);
	}
	
    //////////////////////////////////////////////////////////////////////////////////////
	
	public abstract void cobrarSalario();
	public abstract Double cobrarMontoAntigüedad();
	public abstract Double cobrarSalarioFamiliar();
	
    ////////////////////////////////////////////////////////////////////////////////////////
	//getter y setters
	public String getApellidoYNombre() {
		return apellidoYNombre;
	}

	public void setApellidoYNombre(String apellidoYNombre) {
		this.apellidoYNombre = apellidoYNombre;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public Boolean getConyuge() {
		return conyuge;
	}

	public void setConyuge(Boolean conyuge) {
		this.conyuge = conyuge;
	}

	public Integer getHijos() {
		return hijos;
	}

	public void setHijos(Integer hijos) {
		this.hijos = hijos;
	}

	public Double getMontoPorHora() {
		return montoPorHora;
	}

	public void setMontoPorHora(Double montoPorHora) {
		this.montoPorHora = montoPorHora;
	}
}
