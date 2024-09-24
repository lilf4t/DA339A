import java.util.Scanner;
import java.security.SecureRandom;

// Ersätt 'Template' med ditt klassnamn
// filnamn och klass namn måste överensstämma
// ex. public class Calculator => 'Calculator.java'
//
public class Template {
  public static void main(String[] args) {

    boolean isRunning = false;
    // Denna while loop kommer att fortsätta ända tills isRunning tilldelas värdet false
    do {
      // 1. Ersätt nedanstående utskrift genom att istället
      // kalla på metoden showMenu() här för att skriva ut menyn
      System.out.println("Select one:");
      System.out.println("1. Countdown");
      System.out.println("2. Add numbers");
      System.out.println("3. Compare numbers");
      System.out.println("4. Factorial");
      System.out.println("5. Randomize");
      System.out.println("6. Temperature");
      System.out.println("0. Exit");

      // 2. Kalla på makeChoice() här och lagra ned returvärdet från metoden i en int variabel.
      //      Ex. int choice = makeChoice();

      // 3. skriv en switch/case sats här för valet lagrat i int variabeln från punkt 2.

      // 4. Skapa metoder för varje case enligt uppgiftsbeskrivningen


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

}
