// Main class to test the implementation
public class BookLibrarySystem_02 {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("97835656", "Learning Java", "Ojas johar");
        System.out.println("Book Details:");
        System.out.println("ISBN: " + book.ISBN);
        System.out.println("Author: " + book.getAuthor());

        // Modify the author using setter
        book.setAuthor("Anush Tenguriya");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println("\nEBook Example:");
        // Create an EBook object
        EBook ebook = new EBook("96567666", "Let us see", "Om Tamrakar", "PDF");
        ebook.displayDetails();
    }
}

// Base class: Book
class Book {
    public String ISBN;       // Public attribute
    protected String title;   // Protected attribute
    private String author;    // Private attribute

    // Constructor
     Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass: EBook
class EBook extends Book {
    private String fileFormat;  // Specific to EBook

    // Constructor
    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);  // Call the parent constructor
        this.fileFormat = fileFormat;
    }

    // Method to display details of the EBook
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);   // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("Author: " + getAuthor()); // Accessing private member via getter
        System.out.println("File Format: " + fileFormat);
    }
}