package Uppgift1;

public class Login {

    private String id;
    private String password;


    //default konstruktor för initiering när vi skapar nytt objekt i main
    //vi ger id och password default värden
    public Login(String id, String password) {
        this.id = id;
        this.password = password;
  }

    //reset metod, om det kallas, kommer id och password ersätt av tomma strängar
    public void reset() {
        id = "";
        password = "";
    }

    //Tostring metod, när man skriver ut texten, så ser den ut såhär
     public String toString() {

    String text = String.format("ID: %-20s Password: %-20s", id, password);
      return text;

    }
}