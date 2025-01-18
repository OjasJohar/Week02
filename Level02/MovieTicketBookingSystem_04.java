import java.util.Scanner;

//creating MovieTicket class
public class MovieTicketBookingSystem_04{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the movie Name :");
		String movieName=input.nextLine();
		
		//taking input from the user
		System.out.println("Enter the Seat number you want to book :");
		String seatNumber=input.nextLine();
		
		//taking input from the user
		System.out.println("Enter the price of ticket:");
		double price=input.nextDouble();
		
		//creating object movieticket class
		MovieTicket ticket=new MovieTicket(movieName);
		
		//booking a seat 
		ticket.bookSeat(seatNumber,price);
		
		//displaying the result
		ticket.displayResult();
		
		//Closing Scanner class
		input.close();
	}
}

//creating MovieTicket class
class MovieTicket{
	//creating movieName, seatnumber, price attributes
	private String movieName;
	private String seatNumber;
	private double price;
	
	//constructor
    MovieTicket(String movieName){
		this.movieName=movieName;
		this.price=0;
	}
	
	//method to book a seatNumber;
	public void bookSeat(String seatNumber, double price){
		this.seatNumber=seatNumber;
		this.price=price;
	}
	
	//method to display result
	public void displayResult(){
		System.out.println("-----Movie Ticket Details-----");
		System.out.println("Movie name   :" + movieName);
		System.out.println("Seat number  :" + seatNumber);
		System.out.println("Price        :" + price + "$");
		System.out.println("------------------------------");
	}	
}
