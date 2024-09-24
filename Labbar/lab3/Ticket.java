//Fatima


import java.util.Scanner;



public class Ticket
{


public static void main(String[] args)
//hälsningsfraser
   {
  System.out.println("Välkommen till dagens familjefilm");
  System.out.println("Biljetten kostar 100kr/person");
  System.out.println("Barn får alltid en rabatt på 25%");
  System.out.println();

//deklarera variabler
double barnRabatt = 0.25;
double pris = 100.0;
String namn;
int antalVuxna;
int antalBarn;
double totalKostnad;

// input från kunderna
//Denna är för text (String)
Scanner input = new Scanner(System.in);
System.out.print("Ange ditt namn: ");
namn = input.nextLine();

//funkar bara med siffror (för vi skrev double)
System.out.print("Antal vuxna: ");
antalVuxna = input.nextInt();

System.out.print("Antal barn: ");
antalBarn = input.nextInt();

//Gör uträkning
double rabatt = antalBarn * pris * barnRabatt;
totalKostnad = antalVuxna * pris + antalBarn * pris - rabatt;

//Visa resultat o kvitto

System.out.println();
System.out.println("Ditt kvitto: " + namn);
System.out.println("Totalt att betala: " + totalKostnad + "kr");
System.out.println("Avdragen barnrabatt: " + rabatt + "kr");
System.out.println();
System.out.println("Välkommen åter!");



   }

}
