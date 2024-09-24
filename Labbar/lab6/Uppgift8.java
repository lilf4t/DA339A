// uppgift 8 inte klar

import java.util.Scanner;
import java.util.Random;


public class Uppgift8{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    Random randomGenerator = new Random();
    int randomNumber;
    //*Kopiera kodraden nedan när du behöver ett nytt slumptal mellan 0-9.

    randomNumber = randomGenerator.nextInt(10);

    boolean result = false;

    while (result == false) {
      System.out.println("Gissa på ett nummer mellan 1-10 ");
      int i = sc.nextInt();


    if (i==randomNumber){
     result = true;
     System.out.println("Du gissa rätt!, talet är: " + i);

   }

  else if (i>randomNumber){
     result = true;
     System.out.println("Talet är mindre än " + i);
   }

  else if (i<randomNumber){
    result = true;
    System.out.println("Talet är större än " + i);
  }

}


  }
}
