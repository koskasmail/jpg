import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeConversion4 {
    public static void main(String[] args) {
        String inputDateString = "Mon Aug 15 11:32:45 IDT 2022";
        inputDateString = inputDateString.replace("IDT", "Asia/Jerusalem");

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
