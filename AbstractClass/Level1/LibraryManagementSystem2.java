class LibraryManagementSystem2 {
    public static void main(String[] args) {
        LibraryItem b = new Book(301, "Java Programming", "Kathy Sierra");
        LibraryItem m = new Magazine(302, "Tech Today", "Editorial Team");
        LibraryItem d = new DVD(303, "Inception", "Christopher Nolan");
        LibraryItem[] items = {b,m,d};
        for (LibraryItem it : items) {
            it.getItemDetails();
            System.out.println("Loan Duration (days): " + it.getLoanDuration());
            System.out.println("-----------------");
        }
    }
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId; this.title = title; this.author = author;
    }
    public int getItemId(){ return itemId; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
    public void getItemDetails(){ System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author); }
    public abstract int getLoanDuration();
}

interface Reservable {
    boolean reserveItem(int memberId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(int id, String title, String author){ super(id,title,author); }
    @Override public int getLoanDuration(){ return 14; }
    @Override public boolean reserveItem(int memberId){ if (available){ available = false; return true;} return false; }
    @Override public boolean checkAvailability(){ return available; }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String title, String author){ super(id,title,author); }
    @Override public int getLoanDuration(){ return 7; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    public DVD(int id, String title, String author){ super(id,title,author); }
    @Override public int getLoanDuration(){ return 3; }
    @Override public boolean reserveItem(int memberId){ if (available){ available = false; return true;} return false; }
    @Override public boolean checkAvailability(){ return available; }
}
