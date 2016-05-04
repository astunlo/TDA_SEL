package herencia_polimorfismo;

public class Gerente extends EmpleadoPlantaPermanente {
	protected Integer antigüedad;
	protected Double $porAñoAntigüedad;
	protected Double montoPorAntigüedadPlantPermGerente;
	protected Double montoTotalACobrar=0.0;
	
	Gerente(String apNom, Boolean cony, Integer hij, Integer hsTrab, Integer antig) {
		super(apNom, cony, hij, hsTrab, antig);
		//cobre $15 por año de antigüedad
		this.set$porAñoAntigüedad(15.0);
		//se calcula el monto de su antigüedad
		this.setMontoPorAntigüedadPlantPermGerente(this.cobrarMontoAntigüedad());
		//Cobra Hs trabajadas $40
		this.setMontoPorHora(40.0);
	}
	
	@Override
	public Double cobrarMontoAntigüedad(){
		Double monto=this.getAntigüedad()*this.get$porAñoAntigüedad();
		return monto;	
	}
	
	@Override
	public Double cobrarSalarioFamiliar() {
		Double montoSalarioFamiliar=0.0;
		if(this.getConyuge()==false & this.getHijos()==0){			
		  }else if(this.getConyuge()==true & this.getHijos()==0){
			                montoSalarioFamiliar=Empleado.SALARIOESPOSA;
		           }else if(this.getConyuge()==true & this.getHijos()!=0){
		        	            montoSalarioFamiliar=Empleado.SALARIOESPOSA+(Empleado.SALARIOHIJO*hijos);
		                 }else if(this.getConyuge()==false & this.getHijos()!=0){ 
		                          montoSalarioFamiliar=Empleado.SALARIOHIJO*hijos;}
		return montoSalarioFamiliar;
	}
	
	@Override
	public void cobrarSalario() {		
		Double montoSueldo=0.0;
		montoSueldo=this.cobrarSalarioFamiliar()+(this.getHorasTrabajadas()*this.getMontoPorHora())+ this.getMontoPorAntigüedadPlantPerm();		
		this.setMontoTotalACobrar(this.getMontoTotalACobrar()+montoSueldo);
	}
	
	//getter y setter
	public Integer getAntigüedad() {
		return antigüedad;
	}

	public void setAntigüedad(Integer antigüedad) {
		this.antigüedad = antigüedad;
	}

	public Double get$porAñoAntigüedad() {
		return $porAñoAntigüedad;
	}

	public void set$porAñoAntigüedad(Double $porAñoAntigüedad) {
		this.$porAñoAntigüedad = $porAñoAntigüedad;
	}
	
	public Double getMontoPorAntigüedadPlantPermGerente() {
		return montoPorAntigüedadPlantPermGerente;
	}

	public void setMontoPorAntigüedadPlantPermGerente(Double montoPorAntigüedadPlantPermGerente) {
		this.montoPorAntigüedadPlantPermGerente = montoPorAntigüedadPlantPermGerente;
	}
	
	public Double getMontoTotalACobrar() {
		return montoTotalACobrar;
	}

	public void setMontoTotalACobrar(Double montoTotalACobrar) {
		this.montoTotalACobrar = montoTotalACobrar;
	}	
	
}
