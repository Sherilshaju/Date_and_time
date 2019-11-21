package dateandtime;
import java.time.*;
public class Current_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Today Date");
		LocalDate date=LocalDate.now();//creating a date object
		System.out.println(date);//display date
		
		System.out.println("Current Time");
		LocalTime time=LocalTime.now();//creating a time object
		System.out.println(time);//display Current time
		
		System.out.println("Current Date and Time");
		LocalDateTime dt=LocalDateTime.now();//creating a datetime object
		System.out.println(dt);//display current date and time
		
	}

}
