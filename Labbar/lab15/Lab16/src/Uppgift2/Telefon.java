package Uppgift2;

public class Telefon {

    private String nummer;
    private TelefonTyp telefonTyp;

    //konstruktor
    public Telefon(String nummer, TelefonTyp telTyp) {
        this.nummer = nummer;
        this.telefonTyp = telTyp;

    }

    //getmetod
    public String getNummer() {
        return nummer;
    }

    public TelefonTyp getTelefonTyp() {
        return telefonTyp;
    }

    //set metod
    public void setNummer(String n) {
        nummer = n;
    }

    public void setTelefonTyp(TelefonTyp telTyp) {
        telefonTyp = telTyp;
    }

    public String toString() {
        String text = String.format("%s (%s)", nummer, telefonTyp.name());
        return text;
    }



}
