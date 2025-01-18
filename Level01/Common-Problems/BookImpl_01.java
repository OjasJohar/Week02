import java.util.Scanner;

public class BookImpl_01{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		//creating class object with default constructor
		System.out.println("default book details using default constructor:");
		Book book1=new Book();
		book1.displayDetails();
		
		//taking input
		System.out.println("Enter the title of book:");
		String title=scanner.nextLine(); 

		//taking input
		System.out.println("Enter the name of author of book:");
		String author=scanner.nextLine();	

		//taking input
		System.out.println("Enter the price of book:");
		double price=scanner.nextDouble();	

        //creating class object with parameterized constructor
        Book book2 = new Book(title,author,price);
        book2.displayDetails(); 	

        scanner.close();		
	}
}

class Book{
	private String title;
	private String author;
	private double price;
	
	Book(){
		this.title="Learn java";
		this.author="Harshit";
		this.price=100;
	}
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void displayDetails(){
		System.out.println("-----Book Details-----");
		System.out.println("Title    : " + title);
		System.out.println("Author   : " + author);
		System.out.println("Price    : $" + price);
		System.out.println("----------------------");
	}
}
