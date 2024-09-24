package Uppgift2;

public class Main {
    public static void main(String[] args) {

        //2a
        Telefon telefon = new Telefon("+46 70 71234", TelefonTyp.arbete);
        System.out.println(telefon);


        Person person = new Person("Homer Simpson", telefon);
        System.out.println(person);


       //2b
        Kontaktbok kontakt = new Kontaktbok(3); //skapar en array med 5 personer
        kontakt.addTestValues();

        String[] infoStrings = kontakt.getInfoStrings();
        if (infoStrings.length > 0) {
            for (String str : infoStrings) {
                if(str != null)
                    System.out.println(str);
            }
        }
    }
}

