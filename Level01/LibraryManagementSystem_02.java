public class  LibraryManagementSystem_02{
	
	public static void main(String[] args){
		//Creating class object
		Book book=new Book("Java Guide", "Ojas", "011-AS-034");
		Book.displayDetails(book);
		
        Book book1=new Book("C++ Guide", "Johar", "011-AS-035");
		Book.displayDetails(book1);
	}
}
//Creating Book class
class Book{
	
	//final variable accountNumber
	final String isbn;
	//static variable bankName
	static String libraryName="MyLibrary";
	
	String title, author;
	
	//Parameterized constructor
	Book(String title, String author, String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	//method to get library name
	public static String displayLibraryName(){
		return libraryName;
	}	
	
	//for display method 
	public static void displayDetails(Book book){
		if(book instanceof Book){	
			System.out.println("-----Book Details-----");
		    System.out.println("Book Title   : "+book.title);//non-static variable
		    System.out.println("Book Author  : "+book.author);//non-static variable
			System.out.println("Bank ISBN    : "+book.isbn);//static variable
			System.out.println("Library Name : "+displayLibraryName());//calling method
		    System.out.println("------------------------------");	
	    } else
			System.out.println("Object is not an instance of class ");
	}		
}