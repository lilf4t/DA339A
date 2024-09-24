package Uppgift2;

public class Person {

    private String namn;
    private Telefon telefonNr;

    //konstruktor
    public Person(String namn, Telefon telefonNr) {
        this.namn = namn;
        this.telefonNr = telefonNr;
    }

    //get metod
    public String getNamn() {
        return namn;
    }

    public Telefon getTelefon() {
        return telefonNr;
    }

    //set metod
    public void setNamn(String n) {
        namn = n;
    }

    public void setTelefon(Telefon t) {
        telefonNr = t;
    }

    //toString
    public String toString() {
        String text = String.format("%s %s", namn, telefonNr);
        return text;
    }

    // uppgift 2b - ny konstruktor
    public Person(String namn, String nummer, TelefonTyp telTyp) {

        Telefon nyTelefon = new Telefon(nummer, telTyp);

        this.namn = namn;
        this.telefonNr = nyTelefon;
    }

}
