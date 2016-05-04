package Interface;

public class TestSoftware {
	public static void main(String[] args) {
		Software myCam= new MiWebCam("Te Veo",2.0f, "GML SoftWare", 1234, true);
		  //Llamada método de Súperclase
          myCam.copyRight();
          //Llamada a métodos sobreescritos de Súperclase
             myCam.cargarRequerimientosDeSistema();
		     myCam.imprimir();
		     myCam.mostrarRequerimientos();
		     myCam.cargarNumeroDeRegistroPatente(5236);
		  
		  //Llamada a métodos específicos
		   //Se castea a Subclase
		     ((MiWebCam) myCam).encenderCam();
		     ((MiWebCam) myCam).encenderMicro();
		     ((MiWebCam) myCam).desconectarCam();
		     ((MiWebCam) myCam).desconectarMicro();
	}
}
