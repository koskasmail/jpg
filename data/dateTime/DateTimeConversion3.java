import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeConversion3 {
    public static void main(String[] args) {
        String inputDate = "Mon Aug 15 11:32:45 IDT 2022";
        
        DateTimeFormatter sourceFormatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy");
        
        try {
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(inputDate, sourceFormatter);
            
            DateTimeFormatter targetFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            String formattedDateTime = targetFormatter.format(zonedDateTime);
            
            System.out.println("Formatted Date and Time: " + formattedDateTime);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
    }
}
