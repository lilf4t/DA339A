package MediaLibrary;

public class ChildrenBook extends Book {

    private final int minAge;
    public ChildrenBook(String id, String title, int numOfPages, int minAge) {
        super(id, title, numOfPages);
        this.minAge = minAge;
    }
    @Override
    public String toString() {
        return String.format("%s Age %d", super.toString(), minAge);
    }
}

