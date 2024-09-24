//uppgift 5

import java.util.Scanner;

public class Week {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dag;


    System.out.println("Mata indag 1-7");
    switch(dag = in.nextInt()) {

     case 1 : System.out.println("måndag, tisdag, onsdag, torsdag, fredag");
         break;
     case 2 : System.out.println("tisdag, onsdag, torsdag, fredag");
         break;
     case 3 : System.out.println("onsdag, torsdag, fredag");
         break;
     case 4 :  System.out.println("torsdag, fredag");
          break;
     case 5 :  System.out.println("fredag");
          break;
    
}

  }
}
