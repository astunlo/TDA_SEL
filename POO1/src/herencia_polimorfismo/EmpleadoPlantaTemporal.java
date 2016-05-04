package herencia_polimorfismo;


public class EmpleadoPlantaTemporal extends Empleado {
	protected Double montoTotalACobrar=0.0;
    
	EmpleadoPlantaTemporal(String apNom, Boolean cony, Integer hij, Integer hsTrab){
		super(apNom, cony, hij, hsTrab);	
		//Cobra Hs trabjadas $20 
		this.setMontoPorHora(20.0);
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
		montoSueldo=this.cobrarSalarioFamiliar()+(this.getHorasTrabajadas()*this.getMontoPorHora());		
		this.setMontoTotalACobrar(this.getMontoTotalACobrar()+montoSueldo);
	}

	@Override
	public Double cobrarMontoAntigüedad(){return null;}
	
	//getter y setter
	public Double getMontoTotalACobrar() {
		return montoTotalACobrar;
	}

	public void setMontoTotalACobrar(Double montoTotalACobrar) {
		this.montoTotalACobrar = montoTotalACobrar;
	}	
}
