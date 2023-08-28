
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConversion_3 {
	
    public DateTimeConversion_3 () {
    	
        String inputDateString = "Mon Aug 15 11:32:45 IDT 2022";
        System.out.println("before:" + inputDateString);
        
        SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            Date date = inputFormat.parse(inputDateString);
            String outputDateString = outputFormat.format(date);
            System.out.println("Converted date and time: " + outputDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
