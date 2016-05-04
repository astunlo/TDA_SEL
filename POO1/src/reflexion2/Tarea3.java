package reflexion2;

public class Tarea3 {
	String mensaje = "";

	public Tarea3() {
		this.setMensaje("Se ha ejecutado la tarea 3");
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
