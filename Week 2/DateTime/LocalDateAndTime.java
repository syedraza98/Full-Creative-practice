package DateTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate d1= LocalDate.of(1998,Month.JULY, 13);
		System.out.println(d1);

	}

}
