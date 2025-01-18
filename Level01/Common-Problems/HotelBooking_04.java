import java.util.Scanner;

public class HotelBooking_04{
	
		public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		//creating class object with default constructor
		System.out.println("booking Details using default constructor:");
		HotelBooking hotel1=new HotelBooking();
		hotel1.displayDetails();
		
		//taking input
		System.out.println("Enter the name of guest:");
		String guestName=scanner.nextLine(); 

		//taking input
		System.out.println("Enter the type of room:");
		String roomType=scanner.nextLine(); 

		//taking input
		System.out.println("Enter the number of nights you want to stay:");
		int nights=scanner.nextInt();	

        //creating class object with parameterized constructor
		System.out.println("booking Details using parameterized constructor:");
        HotelBooking hotel2=new HotelBooking(guestName,roomType,nights);
        hotel2.displayDetails();

        //copy constructor demonstration
		System.out.println("booking Details using copy constructor:");
        HotelBooking hotel3=new HotelBooking(hotel2);
        hotel3.displayDetails();
 		
		scanner.close();
	}
}

class HotelBooking{
	String guestName;
	String roomType;	
	int nights;
	
	//default constructor
	HotelBooking(){
		this.guestName="Guest";
		this.roomType="simple";
		this.nights=0;
	}
	
	//parameterized constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	
	//copy constructor
	HotelBooking(HotelBooking h){
		this.guestName=h.guestName;
		this.roomType=h.roomType;
		this.nights=h.nights;
		
	}
	
	public void displayDetails(){
		System.out.println("-----Hotel Booking-----");
		System.out.println("Guest Name  : " + guestName);
		System.out.println("Room Type   : " + roomType);
		System.out.println("Nights      : " + nights);
		System.out.println("----------------------");
	}
	
}