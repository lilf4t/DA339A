// Uppgift 2b - klar

public class Uppgift2b{
  public static void main(String[] args) {

    int[] array = {32, 27, 64, 18, 95, 14, 95, 70, 60, 37};
    //max letar från 0 (alltså 32) till alla element
    int min = array[0];
    int indexSearchedValue = -1;

    for(int i = 0; i < array.length; i++) {

       /*
       //lägst position
        if(array[i] < min) {
        max = array[i];
        indexSearchedValue = i;
        */

     //störst position
      if(array[i] <= min) {
        min = array[i];
        indexSearchedValue = i;

      }
    }

System.out.println(" det minsta talet är: " + min + " och hittades på index: " + indexSearchedValue);


    }
  }
