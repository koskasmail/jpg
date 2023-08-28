import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class DateTimeConversionArr {
    public DateTimeConversionArr () {
        String inputDateString = "Mon Aug 15 11:32:45 IDT 2022";
        
        Map<String, ZoneOffset> timeZoneAbbreviations = new HashMap<>();
        timeZoneAbbreviations.put("IDT", ZoneOffset.ofHours(3));  // Jerusalem offset
        
        String[] parts = inputDateString.split(" ");
        String dateTimeString = String.join(" ", parts[0], parts[1], parts[2], parts[3], parts[5]);
        String timeZoneAbbreviation = parts[4];
        
        ZoneOffset offset = timeZoneAbbreviations.get(timeZoneAbbreviation);
        if (offset == null) {
            System.out.println("Unknown time zone abbreviation: " + timeZoneAbbreviation);
            return;
        }
        
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("EEE MMM d HH:mm:ss yyyy", Locale.ENGLISH);
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, inputFormatter);
        
        ZonedDateTime zonedDateTime = localDateTime.atZone(offset);
        
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String outputDateString = zonedDateTime.format(outputFormatter);
        
        System.out.println("Converted date and time: " + outputDateString);
    }
}
