package clasesPredefinidas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendarios {

	public static void main(String[] args) {
		Date fecha= new Date();
		System.out.println(fecha);
		GregorianCalendar hoy = new GregorianCalendar();
		System.out.println("Mes n° " + (hoy.get(Calendar.MONTH)+1));
	}
}
