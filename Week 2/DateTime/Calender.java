package DateTime;

import java.util.Calendar;



public class Calender {
	public static void main(String [] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println("Time is:" + c.getTime());
		System.out.println(c.get(c.YEAR));
		System.out.println(c.get(c.MONTH));
	}
}
