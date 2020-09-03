import java.text.SimpleDateFormat;
import java.util.Date;
public class CurrentDate {

	public static void main(String[] args) {
		// Date class
		Date currentDate = new Date();
		System.out.println(currentDate);
		// time
		SimpleDateFormat currentDateFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(currentDateFormat.format(currentDate));
		// day of week
		SimpleDateFormat dayOfWeek = new SimpleDateFormat("EEEE");
		System.out.println(dayOfWeek.format(currentDate));
		// clock time
		SimpleDateFormat clock = new SimpleDateFormat("h:mm a");
		System.out.println(clock.format(currentDate));
		// Calendar
		SimpleDateFormat calender = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(calender.format(currentDate));
	}

}
