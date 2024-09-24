package MediaLibrary;

public class Media {

    private String id;
    private String title;
    private boolean borrowable;
    private Language language;
    private String publisher;


    //1c
     public Media(String id, String title) {
         this.id = id;
         this.title = title;
     }


    public String getId() {return id;}
    public String getTitle() {return title;}

    public void setId(String id) {this.id = id;}
    public void setTitle(String title) {this.title = title;}


   public String toString() {
       String text = String.format("%s %s", id, title);
       return text;
   }

}
