package reflexion2;

public class Tarea2 {
	String mensaje = "";

	public Tarea2() {
		this.setMensaje("Se ha ejecutado la tarea 2");
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
