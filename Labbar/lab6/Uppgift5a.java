// uppgift 5a

public class Uppgift5a{
   public static void main (String args[]){


     double fahrenheit, celsius;

        System.out.println("celsius --> fahrenheit ");


      for (celsius = 10; celsius <= 100; celsius = celsius + 10) {

      for (fahrenheit = 0; fahrenheit <= 10; fahrenheit = fahrenheit + 10) {
          fahrenheit =((celsius*9)/5)+32;
        System.out.println(celsius + " --> " + fahrenheit);

      }


      }



   }

}
