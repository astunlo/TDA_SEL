package reflexion2;

public class Tarea1 {
	String mensaje = "";

	public Tarea1() {
		this.setMensaje("Se ha ejecutado la tarea 1");
	}

	public void ejecutarTarea(){
		System.out.println(mensaje);
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
