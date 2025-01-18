import java.util.Scanner;

public class main{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Take user input.
		System.out.println("Enter the title of book: ");
		String title=input.nextLine();
		
		//Take user input.
		System.out.println("Enter the author of book: ");
		String author=input.nextLine();
		
		//Take user input.
		System.out.println("Enter the price of book: ");
		int price=input.nextInt();
		
		//Create book object
		Book book=new Book(title, author, price);
		book.displayDetails();
		
		//Closing Scanner class
		input.close();
	}
}
//Creating class Book
class Book{
	//Creating Fields(Attributes)
	String title, author;
	int price;
	
	//Parameterized Constructor
	Book(String title, String author, int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	//Method to display book details
	void displayDetails(){
		System.out.println("=== Book Details ===");
		System.out.println("Title  : "+ title);
		System.out.println("Author : "+ author);
		System.out.println("Price  : "+ price);
	}
}