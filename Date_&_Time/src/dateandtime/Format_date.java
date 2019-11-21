package dateandtime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Format_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LocalDateTime dt=LocalDateTime.now();
    System.out.println("Before Formatting "+dt);//before formatting the date
    
    DateTimeFormatter format=DateTimeFormatter.ofPattern("E,yyyy-MM-dd hh:mm:ss");
    String formatdate=dt.format(format);//converting the current date into the given format
    System.out.println("After Formatting "+formatdate);//after formatting the date
    
	}

}
