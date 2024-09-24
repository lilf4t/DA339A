//uppgift 2 inte klar

public class L6Upp2{
  public static void main(String[] args) {
   int min = 10;
   int max = 25;
   int increase = 3;
      for(int i = min ; i <= max; i += increase ) {
          System.out.print( i + " " );
      }
      System.out.println();

      // skriv en while-loop som gör samma sak som for-loopen här
 int i = 10;

 while(i<=25) {
   System.out.print(i + " ");
  i = i + 3;
       }
       System.out.println();  //gör en ny rad


      // skriv en do-while-loop som gör samma sak som for-loopen här
  int o = 10;

  do {
    System.out.print(o + " ");
    o = o + 3;
  }  while(o <= 25);



  }
}
