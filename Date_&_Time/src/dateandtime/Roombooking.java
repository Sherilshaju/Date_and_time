package dateandtime;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Calendar;
import java.time.temporal.ChronoUnit;
public class Roombooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    Guest obj=new Guest();
    int a,b=1,c;
    int amount,sum=0;
    String acc;
    System.out.println("Enter the name");
    String name=s.next();
    System.out.println("Enter the Address");
    String address=s.next();
    System.out.println("number of Room");
   int room=s.nextInt();
   System.out.println("number of Persons");
   int persons=s.nextInt();
   System.out.println("AC/nAC");
   String ac=s.next();
   System.out.println("Booking Date");
   String start =s.next();
   System.out.println("Checkout Date");
   String end=s.next();
   LocalDate ds = LocalDate.parse(start);
   LocalDate de = LocalDate.parse(end);
   long diff = ChronoUnit.DAYS.between(ds,de);
   // System.out.println(diff);
   int x=persons/2;
   if(x<=room)
   {
	if(ac.equals("AC")) 
	{
	acc="yes";	
	a=1150;//a is the room charge	
	}
	else
	{
		acc="No";
		a=1000;
	}
	if(persons%2==0)
	{
		b=persons*500;
	}
	else
	{
		c=persons-1;
		b=c*500+250;	
	}
	sum=a+b;
	obj.display(sum,diff,name,address,room,persons,ac);
   }
	
   else
   {
	System.out.println("Book another room");
   }
	
  
  }

}
class Guest{

	public void display(int sum, long diff, String name, String address, int room, int persons, String ac) {
		// TODO Auto-generated method stub
		int amount=(int)(diff*sum);
		  System.out.println("Reg-Details:");
		  System.out.println("Name : "+name);
		  System.out.println("Address : "+address);
		  System.out.println("No.of rooms:"+room);
		  System.out.println("No.of Guest:"+persons);
		  System.out.println("AC/nAC : "+ac);
		  System.out.println("No.of Days : "+diff);
		  System.out.println("Amount : "+amount);
		  
	}
	
}
