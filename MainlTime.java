package localTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainlTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalTime ahora=LocalTime.now();
		
		System.out.println(ahora);
		System.out.println("Descanso-> "+ ahora.getMinute());
		//a la hora actual le sumamos 10 segundos
		for( int i=1;i<=10;i++) {
			ahora=ahora.plus(1,ChronoUnit.SECONDS);
			System.out.println(ahora);
		
	}
		int hora=ahora.getHour();//me lo paso a enteros
		int minutos=ahora.getMinute();
		int segundos=ahora.getSecond();
		//restamos 10 horas a la hora actual
		for( int i=1;i<=10;i++) {
			ahora=ahora.minus(1,ChronoUnit.HOURS);
			System.out.println(ahora);
	}
		//Si quiero mostrar los milisegundos hh:mm:ss:SSS
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println("La hora actual foramateada es " +LocalTime.now(). format(formato));
		//Localdatetime nos da la hora y la fecha.

	
		// TODO Auto-generated method stub
	
	}

}
