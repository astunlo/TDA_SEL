package trigonometria;

public class TestTrigonometria {

	public static void main(String[] args) {
		Angulos t= new Angulos();
		Angulo a= new Angulo(52.0);
		Angulo b= new Angulo(38.0);
		Angulo c= new Angulo(180.0);
		Angulo d= new Angulo(0.0);
		t.tipoDeAngulo(c);
		t.parejaDeAngulos(a, b);
		t.senCosTan(d);
		t.arcoSenCosTan(0.0);
	}

}
