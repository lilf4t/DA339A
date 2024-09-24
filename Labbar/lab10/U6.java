//uppgift 6 - klar

public class U6 {
  public static void main(String[] args) {

    int[] array = {12,13,14,13,0,0,15,15,0,13};

    int nyArray[] = new int[array.length];


    for(int k = 0; k < array.length; k++) {
      System.out.println(array[k]);
    }
   System.out.println();


     for(int i = 0, j = 0; i < array.length; i++) {
       if(array[i] != 0) {

        nyArray[j] = array[i];
        System.out.println(nyArray[j]);
      }
    }
  }
}
