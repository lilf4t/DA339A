//uppgift 8a
import java.util.Scanner;
public class DentistReception{
  public static void main(String[] args) {
    double cost = 0;
    int treatment = 0;
    int exit;
    int choice;
    int k = 10;
    double finalCost;


    final double checkUp = 600.00;
    final double cleaning = 300.00;
    final double cavity = 1500.00;

    Scanner input = new Scanner(System.in);  //create scanner for input
    System.out.println("Ange vilken behandling som utförts: ");
    System.out.println("Kontroll: 1");
    System.out.println("Rengöring: 2");
    System.out.println("Laga hål: 3");
    System.out.println("Avbryt: 4");
    treatment = input.nextInt();

    //Skriv din kod här för att lägga till rätt kostnad till variablen cost


    System.out.println("Kostnaden utan avdrag är:"+cost);

    //Skriv din kod här för att se om avdrag ska göras
   while(treatment != 4) {   //om man då inte trycker på avbryt så görs detta:
      if(treatment == 1) {   //om man väljer 1
        cost += checkUp;     //lägger till 600 kr
        System.out.println("Du har valt behandling 1. Din varukorg har nu " + cost);
        System.out.println("Vill du ha något mer? Om inte, välj 4");
        treatment = input.nextInt();  // tar hänsyn till det man väljer
      }
    else if(treatment == 2){
      cost += cleaning;
      System.out.println("Du har valt behandling 2. Din varukorg har nu " + cost);
      System.out.println("Vill du ha något mer? Om inte, välj 4");
      treatment = input.nextInt();
    }
    else if(treatment == 3){
    cost += cavity;
    System.out.println("Du har valt behandling 3. Din varukorg har nu " + cost);
    System.out.println("Vill du ha något mer? Om inte, välj 4");
    treatment = input.nextInt();
    }
   else if(treatment == 4){
     break;
   }
       }
//uppgift 8b
  double discount = cost * 0.1;
  finalCost = cost - discount;

  if(finalCost >= 3000){
    System.out.println("Betalning: " + cost);
    System.out.println("Du har fått 10% rabatt, din betalning är nu på " + finalCost);
}
else {
  System.out.println("Du är inte behörig till någon rabatt, din betalning är på " + cost);

}




  }
}
