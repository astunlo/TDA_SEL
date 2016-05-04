package reflexion2;

public class Tarea4 {
           String mensaje = "";
 
       public Tarea4() {
             this.setMensaje("Se ha ejecutado la tarea 4");
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

