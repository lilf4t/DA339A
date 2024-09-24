// Uppgift 2a - klar

public class Uppgift2a {
  public static void main (String[] args){


          int[] array = {32, 27, 64, 18, 95, 14, 95, 70, 60, 37};
          //max letar från 0 (alltså 32) till alla element
          int max = array[0];
          //denna ba letar vilket index värdet e på
          int indexSearchedValue = -1;

          for(int i = 0; i < array.length; i++) {

             /*
             //lägst position
              if(array[i] > max) {
              max = array[i];
              indexSearchedValue = i;
              */

           //störst position
            if(array[i] >= max) {
              max = array[i];
              indexSearchedValue = i;

            }
          }

       System.out.println(" det största talet är: " + max + " och hittades på index: " + indexSearchedValue);

     }
  }
