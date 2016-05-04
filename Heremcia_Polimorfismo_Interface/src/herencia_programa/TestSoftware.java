package herencia_programa;

public class TestSoftware {

	public static void main(String[] args) {
		MiWebCam myCam= new MiWebCam("Te Veo",2.0f, "GML SoftWare", 1234, true);
		Software sftw= myCam;
          //Llamada método de Súperclase
          sftw.copyRight();
          //Llamada a métodos sobreescritos Class MiWebCam
		  myCam.cargarRequerimientosDeSistema();
		  myCam.imprimir();
		  myCam.mostrarRequerimientos();
		  myCam.cargarNumeroDeRegistroPatente(5236);
		  //Llamada a métodos específicos
		  myCam.encenderCam();
		  myCam.encenderMicro();
		  myCam.desconectarCam();
		  myCam.desconectarMicro();
	}
}
