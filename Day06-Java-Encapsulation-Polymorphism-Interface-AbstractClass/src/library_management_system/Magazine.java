package library_management_system;

public class Magazine extends LibraryItem implements Reservable{
    private final int loanDuration;
    private boolean isReserved;

    public Magazine(int itemId, String title, String author,int loanDuration,boolean isReserved) {
        super(itemId, title, author);
        this.loanDuration=loanDuration;
        this.isReserved=isReserved;
    }

    @Override
    int getLoanDuration() {
        return loanDuration;
    }

    @Override
    public void reserveItem() {
        this.isReserved=!isReserved;
    }

    @Override
    public void checkAvailability() {
        if(isReserved) {
            System.out.println("Availability : available");
        }else{
            System.out.println("Availability : not available");
        }
    }
}

