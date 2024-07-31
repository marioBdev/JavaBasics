import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.util.Date;

public class DateHour {

public static void main(String[] args) {
      
      Date date = new Date();
      System.out.println(new Timestamp(date.getTime()));
      //DateHour hour = new DateHour();
      System.out.println("---------------------------------------------");
      
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      Timestamp timestamp2 = new Timestamp(System.nanoTime());
      System.out.println();
      System.out.println(timestamp+ " ->Time Stamp");
      System.out.println(timestamp2+" -> Nano Time");
      System.out.println("---------------------------------------------");
      
      LocalDateTime myDateObj = LocalDateTime.now();
      System.out.println("Before formatting: " + myDateObj);
      DateTimeFormatter DateCurrent = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      DateTimeFormatter HourCurrent = DateTimeFormatter.ofPattern("HH:mm:ss");
      DateTimeFormatter DateAndHourCurrent = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
      
      String formattedDate = myDateObj.format(DateCurrent);  
      String formattedHour = myDateObj.format(HourCurrent);  
      String formattedDayW_MMddYYYY = myDateObj.format(DateAndHourCurrent);  
      System.out.println("After formatting - Currently Date: " + formattedDate);  
      System.out.println("After formatting - Currently Hour: " + formattedHour);  
      System.out.println("After formatting - Currently Week Day, Month, Date, Year: " + formattedDayW_MMddYYYY);  
}
}
// Note: This example displays the server's local time, which may differ from your local time.

