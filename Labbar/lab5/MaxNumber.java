//Uppgift 7, inte klar allsssss


import java.util.Scanner;
public class MaxNumber{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //create scanner for input

    System.out.println("Ange tal 1: "); //read first number
    int tal1 = input.nextInt();

    System.out.println("Ange tal 2: "); //read second number
    int tal2 = input.nextInt();

    System.out.println("Ange tal 3: "); //read third number
    int tal3 = input.nextInt();

    if (tal1 > tal2 && tal1 > tal3) {
       System.out.println("Tal 1 är störst");
}

     if else (tal2 > tal1 && tal2 > tal3) {
      System.out.println("Tal 2 är större");
}

    //if(nbr1==nbr2){
    //  System.out.println("Talen är lika stora!");
  //  }
  //  else if(nbr1>nbr2){
  //    System.out.println("Tal 1 är störst!");
  //  }
  //  else {
  //    System.out.println("Tal 2 är störst!");
  //  }
  }
}
