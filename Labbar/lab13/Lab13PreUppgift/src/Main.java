/*
DA339A, L13
Sebastian Wöhrman, 2022-10-21
*/

public class Main {
    @SuppressWarnings("LanguageDetectionInspection")
    public static int tal1 = 0; // Static variabel (det finns endast en) som används i PrintTest

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "Dags för L";
        int i = 13;

        PrintTest pt = new PrintTest(s, i); // skapar ett objekt av PrintTest med namnet pt och konstruktorn som kan ta emot inparametrar
        PrintTest pt1 = new PrintTest();    // skapar ett objekt av PrintTest med namnet pt1 och konstruktorn som inte kan ta emot inparametrar
        PrintTest pt2 = new PrintTest();    // skapar ett objekt av PrintTest med namnet pt2 och konstruktorn som inte kan ta emot inparametrar
        //PrintTest pt3 = new PrintTest();

        System.out.println(pt.text + pt.tal);   // Skriver ut värdena på de två public variabler (text och tal) från objektet pt

        System.out.println();    // Ny rad så att utskriften blir lättare att läsa

        System.out.println("pt1");
        pt1.SetString("a");     // Använder objektet pt1 SetString för att ge dess myString ett värde
        pt1.SetNumber(1);     // Använder objektet pt1 SetNumber för att ge dess myNumber ett värde
        pt1.PrintNumberPublic();      // Anropar pt1 PrintNumberPublic() metod

        System.out.println();   // Ny rad så att utskriften blir lättare att läsa

        System.out.println("pt2");
        pt2.SetString("b");     // Använder objektet pt2 SetString för att ge dess myString ett värde
        pt2.SetNumber(2);     // Använder objektet pt2 SetNumber för att ge dess myNumber ett värde
        pt2.PrintNumberPublic();      // Anropar pt2 PrintNumberPublic() metod

        System.out.println();   // Ny rad så att utskriften blir lättare att läsa

        System.out.println("Combo: pt1 myNumber och pt2 myString");
        System.out.println(pt1.GetNumber() + " " + pt2.GetString());  // Skriver ut pt1 myNumber och pt2 myString

       // System.out.println("Addera pt2 tal variabel med pt1 tal");
       // System.out.println(pt2.Add(pt1)); // Använder ett objekt av klassen PrintTest som inparameter
    }
}