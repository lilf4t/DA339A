// uppgift 7b inte klaaar

import java.util.Scanner;


public class Uppgift7b{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Ange startvärde och slutvärde: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

  for(a=1; a<=10; a = a + 1){
  for(b=1; b<=10; b = b + 1){
    System.out.print(" " + a*b);
}
System.out.println();
}


  }
}
