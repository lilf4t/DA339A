import java.util.Scanner;
import java.security.SecureRandom;

public class L8facit{
  public static void main(String[] args) {

    boolean isRunning = true;
    do {
      showMenu();
      int choice = makeChoice();
      switch (choice) {
        case 1:
          countdown();
          break;
        case 2:
          addNumbers();
          break;
        case 3:
          compare(5);
          break;
        case 4:
          // Factorial
          Scanner input = new Scanner(System.in);
          System.out.print("Integer to calculate: ");
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
        case 5:
          randomize();
          break;
        case 6:
          temperature();
          break;
        case 0:
          isRunning = false;
          break;
        default:
          System.out.println();
          System.out.println("Wrong choice, try again!");
          System.out.println();
          break;
      }
    } while (isRunning);
  }

  // showMenu() - Metod
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
  // ----

  // makeChoice() - Metod
  public static int makeChoice()
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Make a choice: ");
    int choice = input.nextInt();
    return choice;
  }
  // ----

  // addNumbers() - Metod
  public static void addNumbers()
  {
    Scanner input = new Scanner(System.in);
    int count = 1;  // Håll reda på vilket tal vi är på
    int sum = 0;    // Summan
    int number = 0; // Det inmatade heltalet

    do
    {
      System.out.print("Number " + count++ + ": ");
      number = input.nextInt();
      sum += number;
    }while(number != 0);

    System.out.println();
    System.out.println("The sum is " + sum);
    System.out.println();
  }
  // ----

  // countdown() - Metod
  public static void countdown()
  {
    for (int i=50; i >= 0; i-=2 ) {
      System.out.println("Value : " + i);
    }
    System.out.println();
  }
  // ----

  // compare() - Metod
  public static void compare(int num)
  {
    SecureRandom rng = new SecureRandom();
    double max = -1.0;
    for (int i=0; i<num; i++) {
      double value = rng.nextDouble() * 1000.0;
      System.out.println("Number: " + value);
      if (value > max)
      {
        max = value;
      }
    }
    System.out.println("The largest number was: " + max);
  }
  // ----

  // factorial() - Metod
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
  // ----

  // randomize() - Metod
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

      // Note! Theoretical risk of infinite loop. Why?
    }
  }
  // ----

  // temperature() - Metod
  public static void temperature()
  {
    System.out.println();
    System.out.println("1. F to C");
    System.out.println("2. C to F");
    System.out.println();
    int val = makeChoice();
    System.out.print("Enter temperature: ");
    Scanner input = new Scanner(System.in);
    double temp = input.nextDouble();
    System.out.println();

    if (val == 1)
    {
      double celsius = fahrToCels(temp);
      System.out.println("Celsius: " + celsius);
    }
    else if (val == 2)
    {
      double fahrenheit = celsToFahr(temp);
      System.out.println("Fahrenheit: " + fahrenheit);
    }
    else
    {
      System.out.println("Wrong choice");
    }
    System.out.println();
  }
  // ----

  // fahrToCels() - Metod
  public static double fahrToCels(double t)
  {
    return 5.0 / 9.0 * (t - 32.0);
  }
  // ----

  // celsToFahr() - Metod
  public static double celsToFahr(double t)
  {
    return (9.0/5.0) * t + 32.0 ;
  }
  // ----
}
