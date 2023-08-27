import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConversion {
	
    public DateTimeConversion() {
        String inputDate = "Mon Aug 15 11:32:45 IDT 2022";
        
        SimpleDateFormat sourceFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        
        try {
            Date parsedDate = sourceFormat.parse(inputDate);
            
            SimpleDateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String formattedDateTime = targetFormat.format(parsedDate);
            
            System.out.println("Formatted Date and Time: " + formattedDateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
