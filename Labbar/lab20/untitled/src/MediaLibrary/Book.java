package MediaLibrary;

public class Book extends Media {


    private final int numOfPages;

    public Book(String id, String title, int numOfPages) {
        super(id, title);
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return String.format("%s Pages = %d", super.toString(), numOfPages);
    }
}