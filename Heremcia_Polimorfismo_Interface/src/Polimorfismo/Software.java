package Polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Software {
	protected String nombre;
	protected Float version=0.0f;
	protected String fabricante;
	protected Integer codigo;
	protected boolean registrado;
	protected ArrayList<String>sistemasOperativosSoportados;
	protected Float velocidadCPURequerida=0.0f;
	protected Double ramRequerida;
	protected Double discoEspacioRequerida;
	static Scanner entrada;
	
	//Constructor
	Software(String nombre, Float version, String fabricante, Integer codigo, Boolean registrado){
		 this.setNombre(nombre);
		 this.setVersion(version);
		 this.setFabricante(fabricante);
		 this.setCodigo(codigo);
		 this.setRegistrado(registrado);
		 this.setSistemasOperativosSoportados(new ArrayList<String>());
    }
	Software(){}
	
	//getter and setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getVersion() {
		return version;
	}

	public void setVersion(Float version) {
		this.version = version;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public boolean isRegistrado() {
		return registrado;
	}

	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}
	
	public ArrayList<String> getSistemasOperativosSoportados() {
		return this.sistemasOperativosSoportados;
	}

	public void setSistemasOperativosSoportados(ArrayList<String> sistemasOperativosSoportados) {
		this.sistemasOperativosSoportados = sistemasOperativosSoportados;
	}

	public Float getVelocidadCPURequerida() {
		return velocidadCPURequerida;
	}

	public void setVelocidadCPURequerida(Float velocidadCPURequerida) {
		this.velocidadCPURequerida = velocidadCPURequerida;
	}

	public Double getRamRequerida() {
		return ramRequerida;
	}

	public void setRamRequerida(Double ramRequerida) {
		this.ramRequerida = ramRequerida;
	}

	public Double getDiscoEspacioRequerida() {
		return discoEspacioRequerida;
	}

	public void setDiscoEspacioRequerida(Double discoEspacioRequerida) {
		this.discoEspacioRequerida = discoEspacioRequerida;
	}
	
	//Métodos generales
	void copyRight(){
		System.out.println("--------------CopyRight Software---------------");
	}
	
	abstract void cargarNumeroDeRegistroPatente(Integer r);
	
	abstract void cargarRequerimientosDeSistema();
	
	abstract void mostrarRequerimientos();

	abstract void imprimir();

}
