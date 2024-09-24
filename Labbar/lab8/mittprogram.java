

import java.util.Scanner;
import java.security.SecureRandom;


public class mittprogram {
  public static void main(String[] args) {

    boolean isRunning = true;
    // om den är false, så kmr den avrbytas tills den blir true, om den är true, så kmr den fortsätta i guess tills man sätter en break?? så de e väl bäst o ha den på true i detta fallet
    do {

      // 1. här ska showmenu stå (visar meny)
showMenu();{
}

      // 2. Kalla på makeChoice() här och lagra ned returvärdet från metoden i en int variabel
      //      Ex. int choice = makeChoice(); (denna gör en till choice)

  makeChoice();{  // (denna gör att man kan lägga in en choice).
    int choice = makeChoice();

      // 3. skriv en switch/case sats här för valet lagrat i int variabeln från punkt 2.
    switch (choice) {
      case 0: isRunning = false;  //avslutar programmet
      break;
      case 1: countdown();
      break;
      case 2: addNumbers();
      break;
      case 3: compareNumbers(5);
      break;
      case 4:
      Scanner input = new Scanner(System.in);
      System.out.print("Ange ett nummer för fakulutet: ");
      int fac = input.nextInt();
      int result = factorial(fac);
      if (result >= 0)
      {
        System.out.println();
        System.out.println("Result = " + result);
        System.out.println();
      }
      else
      {
        System.out.println();
        System.out.println("Invalid result");
        System.out.println();
      }

      break;
      case 5: randomize();
      break;
    }

}
    } while (isRunning);
  }

  // Används ovan (1.)
  // Skriver ut menyn
  public static void showMenu()
  {
    System.out.println("Select one:");
    System.out.println("1. Countdown");
    System.out.println("2. Add numbers");
    System.out.println("3. Compare numbers");
    System.out.println("4. Factorial");
    System.out.println("5. Randomize");
    System.out.println("6. Temperature");
    System.out.println("0. Exit");
  }

  // Används ovan (2)
  // Gör ett val och returnerar valet i en int
  public static int makeChoice()
  {
    Scanner input = new Scanner(System.in);
     System.out.print("Make a choice: ");
     int choice = input.nextInt();
     return choice;
  }

  //case 1: Countdown, ska räkna ner från 50-1 med 2 mellan varje, med en for loop
  public static void countdown() {
    for (int a=50; a>=0; a = a - 2) {
       System.out.println(a);
  }
      System.out.println();
}

// case 2. addNumbers, ska addera värde b till heltal, while loop
  public static void addNumbers() {
    Scanner input = new Scanner(System.in);{


    System.out.print("Ange första talet att addera: ");
    int tal1 = input.nextInt();
    System.out.print("Ange andra talet att addera: ");
    int tal2 = input.nextInt();

    int summa = tal1 + tal2;

System.out.printf("Summan är: %d + %d = %d", tal1, tal2, summa);
}

  System.out.println();
  System.out.println();
}

//case 3: compareNumbers jämför tal o skriver ut den största FATTAR INTE
public static void compareNumbers(int num)
{
  SecureRandom range = new SecureRandom();
  double max = 1.0;
  for (int i=0; i<num; i++) {
    double value = range.nextDouble() * 1000.0;
    System.out.println("Nummer: " + value);

    if (value > max)
    {
      max = value;
    }
  }
  System.out.println("Största nummer var: " + max);
}

// case 4 factorial //förstår inte riktigt
       public static int factorial(int value)
       {
         int fact = 1; // Setup for multiplikation to work
         // Is ok
         if (value > 0)
         {
           for (int i=1; i <= value; i++) {
             fact *= i;
           }
         }
         // Special case
         else if (value == 0)
         {
           fact = 1;
         }
         // Invalid
         else
         {
           fact = -1; // Wrong result
         }
         // Return value
         return fact;
       }
//case 5
public static void randomize()
{
  System.out.println("Randomizing: ");
  boolean isRandomizing = true;
  SecureRandom rng = new SecureRandom();
  while(isRandomizing)
  {
    double num1 = rng.nextDouble()*10.0; // random mellan 0 och 10
    double num2 = rng.nextDouble()*10.0; // random mellan 0 och 10
    double pow = Math.pow(num1, num2);
    System.out.println(num1 + " powered to " + num2 + " is " + pow);
    if (pow > 3000.0)
    {
      isRandomizing = false;
    }

  }
}



}
