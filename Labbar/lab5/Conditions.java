
//uppgift 4a-b

import java.util.Scanner;
public class Conditions{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //create scanner for input

    System.out.println("Ange ett heltal: ");
    int number = input.nextInt();


    boolean result = false;


 if(number > 67) {
   result = true;
   System.out.println("number är större än 67");
 }

 if(number == 3 || number == 6 || number == 7) {
   result = true;
    System.out.println("number är antingen 3, 5 eller 7");
 }

 if(number >= 25 && number <= 50 ) {
   result = true;
  System.out.println("number är i intervallet 25-50");
}

if(number >= 1 && number <= 4 || number >= 7 && number <= 9) {
  result = true;
 System.out.println("number tillhör något av intervallen 1-4 eller 7-9");

if(number < 0 || number > 10)
  result = true;
   System.out.println("number är negativt eller större än 10 ");
}




  }
}
