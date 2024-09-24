//uppgift 1


import java.util.Scanner;


public class L9uppgift2{
  public static void main(String[] args) {

  int[] array = new int[10];

  array[0] = 13;
  array[1] = 42;
  array[2] = 56;
  array[3] = 78;
  array[4] = 19;
  array[5] = 45;
  array[6] = 57;
  array[7] = 34;
  array[8] = 77;
  array[9] = 2;

int soktVarde = 57;
int indexSoktVarde = -1;


 for(int i=0; i<array.length; i++) {   //index=0, array.length för o ta reda på antal element i en array,
         System.out.println(array[i]);

  if(array[i] == soktVarde) {  //om den platsen du är på = 57, gå in i if satsen
    indexSoktVarde = i;  //hittar vilken plats finns 57 på, för o spara i till senare
    break;

  }
}
System.out.println("Du hittade värdet på position " + indexSoktVarde);

  }
}


// uppgift 2
// index>indexSoktVarde
