//uppgift 3b

import java.util.Scanner;


public class Uppgift3b{
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);

System.out.println("Ange ett nummer");
int a = sc.nextInt();

    for (int i = 1; i <= 10; i++)
     {
      System.out.printf("%d * %d = %d \n", a, i, a * i);
     }
  }
}
