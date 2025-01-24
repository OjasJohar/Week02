import java.util.ArrayList;
import java.util.List;

class LibraryAndBooks_01{
	
	public static void main(String []args){
		
		Library library1 = new Library("Wisdom Library");
		Library library2 = new Library("University Library");
		
		Book book1 = new Book("Game of Thrones","RR Martin" );
		Book book2 = new Book("Harry Potter","JK Rowling" );
		Book book3 = new Book("The Alchemist","Saulo paulo" );
		
		library1.addBooks(book1);
		library1.addBooks(book3);
		
		library2.addBooks(book2);
		library2.addBooks(book3);
		
		library1.displayDetails();
		library2.displayDetails();
	}
}
class Library{
	private String libraryName;
	private List<Book>books;
	
	Library(String libraryName){
		this.libraryName = libraryName;
		this.books = new ArrayList<>();
	}
	
	public void addBooks(Book book){
		books.add(book);
	}
	
	public void displayDetails(){
		System.out.println("The Library Name is : "+libraryName);
		System.out.println("The Books in the library are -- ");
		
		for(Book book : books){
				book.displayBookDetails();
			  
		}  System.out.println();
	}
	
}
class Book{
	private String title;
	private String author;
	
	Book(String title, String author){
	
		this.title = title;
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}

	public void displayBookDetails(){
	
	   System.out.println("THe Book Title is : "+getTitle());
	   System.out.println("THe Book Author is : "+getAuthor());
	  
	}
}