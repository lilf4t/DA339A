//Exakt som names

import java.util.Scanner;

public class Names {
   public static void main(String[] args) {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);


      final int NBR_OF_ELEMENTS = 10;
      int score[] = new int[NBR_OF_ELEMENTS];
      int index = 0; // Java börjar alltid räkna index på 0

      /*Vad gör den här loopen? När du har förstått det:
      Förändra den så att du sparar samma värde i elementet som elementets index
      */
      while(index<NBR_OF_ELEMENTS){
        System.out.println("Loop är på index: "+index);
        score[index]=0;
        index = index+1;
      }

      index = 0; // Java börjar alltid räkna index på 0
      while(index<NBR_OF_ELEMENTS){
        System.out.println("Ange värdet som ska skrivas till index "+index);
        score[index]=input.nextInt();
        System.out.println("Värde på index "+index+" är nu "+score[index]);
        index = index+1;
      }

      System.out.println("I arrayen score finns nu följande värden");
      index = 0; // Java börjar alltid räkna index på 0
      while(index<NBR_OF_ELEMENTS){
        System.out.println("score["+index+"]="+score[index]);
        index = index+1;
      }
   }
}
