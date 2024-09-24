//Uppgift10 - klar

import java.util.Scanner;

public class Uppgift10{
 public static void main(String[] args){
   //scanner för input
   Scanner input = new Scanner(System.in);

   double cost = 0;
   double discount = 0;
   double sum = 0;
   int choice = 0;
   int counter = 0;

   //skapar en ny array som räknar kostaned
   String [][] treatment = {{"Kontroll","600"},{"Lagning hål","1500"},{"Rengöring","300"}};
   //tom array för kvittot, ska ha 10 element
   String [][] costArray = new String[10][2];

   //skriver ut behandlingar
   printTreatments();
   choice = input.nextInt();

   //sålänge man inte trycker avbryt, counter har jag för att kunna räkna för kostnaden
   while (choice != -1) {
     if((counter < 10) && (choice < 3)){
       costArray[counter] = treatment[choice];
       costArray[counter][1] = treatment[choice][1];

       //parsing då jag vill kunna räkna cost med string treatment och en counter++ då den lägger till för kostnaden
       cost += Integer.parseInt(treatment[choice][1]);
       counter++;
     }

     //visar the treatments
     printTreatments();
     choice = input.nextInt();
   }

   //För rabatten
   if(cost >= 3000){
     discount = cost * 0.10;
   }
   sum = cost - discount;

   //Skriver ut kvitton
   System.out.println("Kvitto");
   for (int i = 0; i < costArray.length; i++) {
     if(costArray[i][0] != null){
       System.out.println(costArray[i][0]+ "   " + costArray[i][1]);
     }
   }
   System.out.println();
   System.out.println("Kvitto");
   System.out.println("--------------------------");
   System.out.println("Kostnad             " + cost);
   System.out.println("Rabatt              " + discount);
   System.out.println("Summa att betala    " + sum);

 }

 public static void printTreatments(){
   System.out.println();
   System.out.println("Ange vilken behandling som ska utföras: ");
   System.out.println("Kontroll:  0");
   System.out.println("Laga hål:  1");
   System.out.println("Rengöring: 2");
   System.out.println("Avbryt:   -1");
   System.out.println();
   }
}
