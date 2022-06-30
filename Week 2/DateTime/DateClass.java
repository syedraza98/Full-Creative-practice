package DateTime;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate =new Date();
		SimpleDateFormat SD = new SimpleDateFormat("MMMM/dd/YY");
		SimpleDateFormat SD1 = new SimpleDateFormat("MMMM/dd/YY HH:mm:s a");
		System.out.println(SD.format(currentDate));
		System.out.println(SD1.format(currentDate));

	}

}
