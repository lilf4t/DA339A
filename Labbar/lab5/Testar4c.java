//uppgift 4C

import java.util.Scanner;
public class Testar4c{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //create scanner for input

    System.out.println("Ange ett heltal: ");
    int number = input.nextInt();


    boolean result = false;


 if(number % 3 == 0) {
   result = true;
   System.out.println("number är delbart med 3");
 }

 if(number % 4 != 0) {
   result = true;
   System.out.println("number är ej delbart med 4");
}

if(number % 10 == 0) {
  result = true;
  System.out.println("entalsiffran i number är 7");
}

if(number % 700 / 100 == 0  ) {
  result = true;
  System.out.println("hundratalsiffran i number är 7");
}

 }
}
