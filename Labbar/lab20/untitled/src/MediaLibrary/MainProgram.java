package MediaLibrary;

public class MainProgram {
    public static void main(String[] args) {
       /* TestMedia();
        TestBook();
        */
        TestConstructors();
    }

     /* public static void TestMedia(){
        Media media = new Media();
        media.setId("Music.101");
        media.setTitle("Those were the days my friend");

        System.out.println(media.toString());
    }
    public static void TestBook(){
        Book book = new Book();
        book.setId("BookLng.100");
        book.setTitle("Programming in Java 12");

        System.out.println(book.toString());

        //ToDo 2
        book = new ChildrenBook();
        book.setId("BookChl.100");
        book.setTitle("Pippi Longstocking");

        System.out.println(book.toString());
    }
      */

    public static void TestConstructors() {
        int minAge = 3;
        int numOfPages = 35;
        ChildrenBook pipi = new ChildrenBook("BKCHL-0001", "Pipi Longstocking", minAge, numOfPages);
    }

  }

