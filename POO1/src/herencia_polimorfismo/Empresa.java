package herencia_polimorfismo;

import java.util.ArrayList;
import java.util.Iterator;

class Empresa {
	//CUIT y Razón Social
	static final String RAZONSOCIAL="GVM Tec";
	static final String CUIT="28-25638349-8";
	private ArrayList<EmpleadoPlantaPermanente> empPlPerm;
	private ArrayList<EmpleadoPlantaTemporal> empPlTemp;
	private ArrayList<Gerente> gerente;
	private Double montoTotalAPagar;
	
	Empresa(){
		this.setEmpPlPerm(new ArrayList<EmpleadoPlantaPermanente>());
		this.setEmpPlTemp(new ArrayList<EmpleadoPlantaTemporal>());
        this.setGerente(new ArrayList<Gerente>());
        this.setMontoTotalAPagar(0.0);
	}
	
    
	void cargarEmpleado(Object empl){
		if(empl instanceof Gerente){
			this.gerente.add((Gerente) empl);
		}else if(empl instanceof EmpleadoPlantaPermanente){
			        this.empPlPerm.add(((EmpleadoPlantaPermanente)empl));
		        }else if(empl instanceof EmpleadoPlantaTemporal)
		                 {this.empPlTemp.add((EmpleadoPlantaTemporal)empl);}
	}

	void montoTotalAPagar(){
		Gerente temp = null;
		  //for tradicional
		  for(int i=0; i<gerente.size(); i++){
		        temp= gerente.get(i);
			    this.setMontoTotalAPagar(this.getMontoTotalAPagar()+temp.getMontoTotalACobrar());
		      }
		
		EmpleadoPlantaPermanente temp1=null;
		  //for mejorado o for each
		  for(EmpleadoPlantaPermanente e:empPlPerm){
			     temp1=e;
			     this.setMontoTotalAPagar(this.getMontoTotalAPagar()+ temp1.getMontoTotalACobrar());
			  }
		
		EmpleadoPlantaTemporal temp2=null;
		  //Iterator: no necesita indicarse el "tipo de objeto" que contiene el array
		  Iterator<EmpleadoPlantaTemporal> it= empPlTemp.iterator();
		  while(it.hasNext()){//mientras haya elementos...
			      //Si Iterator va sin parametrizar (Iterator it), entonces habría que caster: temp2=(EmpleadoPlantaTemporal)it.next();
			     temp2=it.next();			    
			     this.setMontoTotalAPagar(this.getMontoTotalAPagar()+temp2.getMontoTotalACobrar());
			     }//fin while
	} 
	
	//getter y setter
		
	public Double getMontoTotalAPagar() {
		return montoTotalAPagar;
	}

	public void setMontoTotalAPagar(Double montoTotalAPagar) {
		this.montoTotalAPagar = montoTotalAPagar;
	}


	public ArrayList<EmpleadoPlantaPermanente> getEmpPlPerm() {
		return empPlPerm;
	}

	public void setEmpPlPerm(ArrayList<EmpleadoPlantaPermanente> empPlPerm) {
		this.empPlPerm = empPlPerm;
	}

	public ArrayList<EmpleadoPlantaTemporal> getEmpPlTemp() {
		return empPlTemp;
	}

	public void setEmpPlTemp(ArrayList<EmpleadoPlantaTemporal> empPlTemp) {
		this.empPlTemp = empPlTemp;
	}

	public ArrayList<Gerente> getGerente() {
		return gerente;
	}

	public void setGerente(ArrayList<Gerente> gerente) {
		this.gerente = gerente;
	}
}
