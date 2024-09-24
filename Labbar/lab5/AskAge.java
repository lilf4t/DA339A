
// uppgift 2

import java.util.Scanner;
public class AskAge{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ange din ålder: ");
    int number = input.nextInt();


   if (number <= 17)
      System.out.println("Du är ett barn ");


  else
      System.out.println("Du är en vuxen ");


  }
}
