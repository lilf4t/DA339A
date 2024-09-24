//uppgift 5b

import java.util.Scanner;

public class Week5b {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dag;


    System.out.println("Mata indag 1-7");
    switch(dag = in.nextInt()) {

     case 1 : System.out.println("Monday you can fall apart ");
              System.out.println("Tuesday, Wednesday break my heart ");
              System.out.println("Oh, Thursday doesn't even start ");
              System.out.println("It's Friday, I'm in love ");
              System.out.println("Saturday, wait ");
              System.out.println("And Sunday always comes too late ");
         break;
     case 2 : System.out.println("Tuesday, Wednesday break my heart");
         break;
     case 3 : System.out.println("Tuesday, Wednesday break my heart");
         break;
     case 4 :  System.out.println("Oh, Thursday doesn't even start");
          break;
     case 5 :  System.out.println("It's Friday, I'm in love");
          break;
     case 6 :  System.out.println("Saturday, wait");
         break;
     case 7 :  System.out.println("And Sunday always comes too late");
              break;
}

  }
}
