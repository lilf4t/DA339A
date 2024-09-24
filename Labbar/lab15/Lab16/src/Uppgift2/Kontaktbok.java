package Uppgift2;

//2b

public class Kontaktbok {
    private int amount;
    private Person[] person; //array av klassen Person

    //konstuktor, storlek = storlek av arrayen
    public Kontaktbok(int storlek) {
        this.amount = 0;
        this.person = new Person[storlek];
    }
    //lägga till person i arrayen
    public void addPerson(String namn, String nummer, TelefonTyp telTyp) {
        if(amount >= 0 && amount < person.length) {
            person[amount] = new Person(namn, nummer, telTyp);
            amount++;
        }
    }
    //en metod som returnerar en array av String, varje element representerar en person
    public String[] getInfoStrings() {
        String[] infoString = new String[amount];

        for(int i = 0; i < amount; i++) {
            infoString[i] = person[i].toString();
        }
        return infoString;
    }
    public void addTestValues() {
        addPerson("namn1", "telnr1", TelefonTyp.sommarhus);
        addPerson("hej", "då", TelefonTyp.arbete);
        addPerson("namn3", "telnr3", TelefonTyp.privat);
        addPerson("namn4", "7777777", TelefonTyp.arbete);

    }


}