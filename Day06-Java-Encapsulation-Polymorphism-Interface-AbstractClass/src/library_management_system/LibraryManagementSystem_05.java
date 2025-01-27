package library_management_system;

public class LibraryManagementSystem_05 {
    public static void main(String[] args) {
        Book item1 = new Book(12, "Java", "Ojas", 5, true);
        item1.getItemDetails();
        item1.checkAvailability();
        System.out.println("Loan duration  :" + item1.getLoanDuration());

        Magazine item2 = new Magazine(12, "Times of India", "Company", 7, false);
        item2.getItemDetails();
        item2.checkAvailability();
        System.out.println("Loan duration  :" + item2.getLoanDuration());

        DVD item3 = new DVD(13, "Music", "Honey Singh", 10, false);
        item3.getItemDetails();
        item3.checkAvailability();
        System.out.println("Loan duration  :" + item3.getLoanDuration());

    }
}