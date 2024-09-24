


import java.util.Scanner;
public class AskNumber{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //create scanner for input

    System.out.println("Ange ett heltal: ");  //text
    int number = input.nextInt();    // frågar om heltal

//uppgift 1a
   if (number > 100)     //if sats
      System.out.println("Talet är större än 100");  //text ifall det stämmer

//uppgift 1b
  else      //else sats
      System.out.println("Talet är högst 100"); //ifall talet är mindre än 100


  }
}
