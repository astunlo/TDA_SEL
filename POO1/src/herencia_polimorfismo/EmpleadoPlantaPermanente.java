package herencia_polimorfismo;

public class EmpleadoPlantaPermanente extends Empleado {
	protected Integer antigüedad;
	protected Double $porAñoAntigüedad; 
	protected Double montoPorAntigüedadPlantPerm;
	protected Double montoTotalACobrar=0.0;
	
	EmpleadoPlantaPermanente(String apNom, Boolean cony, Integer hij, Integer hsTrab, Integer antig) {
		super(apNom, cony, hij, hsTrab);
		this.setAntigüedad(antig);
          //cobre $10 por año de antigüedad
		this.set$porAñoAntigüedad(10.0);
		  //cobra $30 por hora
		this.setMontoPorHora(30.0);
		  //se calcula el monto de su antigüedad
		this.setMontoPorAntigüedadPlantPerm(this.cobrarMontoAntigüedad());
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
	
	//Cobra Hs trabajadas $30 + antigüedad $10 + salario
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
	
	public Double getMontoPorAntigüedadPlantPerm() {
		return montoPorAntigüedadPlantPerm;
	}

	public void setMontoPorAntigüedadPlantPerm(Double montoPorAntigüedadPlantPerm) {
		this.montoPorAntigüedadPlantPerm = montoPorAntigüedadPlantPerm;
	}

	public Double getMontoTotalACobrar() {
		return montoTotalACobrar;
	}

	public void setMontoTotalACobrar(Double montoTotalACobrar) {
		this.montoTotalACobrar = montoTotalACobrar;
	}	
	
}
