package dateandtime;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String start =sc.nextLine();// format 2017-11-20
	    String end = sc.nextLine();
	    LocalDate ds = LocalDate.parse(start);
	    LocalDate de = LocalDate.parse(end);
	    long total = ChronoUnit.DAYS.between(ds,de);
	    System.out.println(total);

	}

}
