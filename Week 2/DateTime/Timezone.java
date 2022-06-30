package DateTime;
import java.util.TimeZone;
public class Timezone {
	public static void main(String [] args) {
		
		String[] tz = TimeZone.getAvailableIDs();
	
		for(String timeZoneIds : tz) {
			System.out.println(timeZoneIds);
		}
		
		System.out.println(TimeZone.getDefault());
	}
}
