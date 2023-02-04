import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public void getDateTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
		Date date = new Date();
		String currentDateTime = dateFormat.format(date);
		System.out.println("Current date and time: " + currentDateTime);
	}

	public DateTime() {
		getDateTime();
	}
}
