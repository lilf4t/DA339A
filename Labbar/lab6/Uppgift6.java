// uppgift 6

import java.util.Scanner;


public class Uppgift6{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Ange ett nummer för fakultetet: ");
    int a = sc.nextInt();
    int resultat = 1;  //denna gör 1 ggr resultatet
    System.out.print(a + "! = "); //ba text

    for (int i = 1; i <= a; i++)
      {
        resultat = resultat * i;
        System.out.print(i);
        if (i < a) {
        System.out.print("*");
      }  else {
        System.out.print(" = ");
     }

     }
    System.out.println(resultat);
  }
}
