public class PrintTest {
    public String text = "";
    public int tal;
    private String myString;
    private int myNumber;

    public PrintTest() {     // PrintTest-konstruktor utan inparameter
        tal = Main.tal1++;
        //System.out.println(tal);
    }

    public PrintTest(String testString, int testInt) {    // PrintTest-konstruktor med inparameter (String s)
        text = testString;
        tal = testInt;
        //tal = Main.tal1++;
        //System.out.println(Main.tal1++);
    }

    public void SetString(String aString) {  // SetString, metod som anropas när vi vill sätta ett värde på variablen myString
        myString = aString;
    }

    public String GetString() {  // GetString, metod som retunerar en string, anropas när vi vill hämta/använda värdet på variablen myString
        return myString;
    }

    public void SetNumber(int aNumber) {   // SetNumber, metod som anropas när vi vill sätta ett värde på variabeln myNumber
        myNumber = aNumber;
    }

    public int GetNumber() {     // GetNumber, metod som retunerar en int, anropas när vi vill hämta/använda värdet på variabeln myNumber
        return myNumber;
    }

    public void PrintNumberPublic() {    // Metod som kan anropas utanför klassen om det finns ett PrintTest objekt skapat
        System.out.print(myNumber + " ");
        PrintStringPrivate();           // Anropar en private metod (PrintStringAndNumberPrivate)
    }

    private void PrintStringPrivate() {  // Metod som bara kan anropas inne i PrintTest eftersom den är private
        System.out.println(myString);
    }

    public int Add(PrintTest pt) {  // Metod som tar ett annat PrintTest objekt som inparameter, adderar deras tal variabel och retunerar resultatet
        return pt.tal + tal;
    }
}
