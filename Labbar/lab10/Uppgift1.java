// Uppgift 1 - om searchedValue inte finns så ska den ge en error??


public class Uppgift1{
  public static void main(String[] args) {



  int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

  int searchedValue = 14;
  int indexSearchedValue = -1;   //-1 för om vi skriver 0 så kmr den inte ta hänsyn till första talet


  /*
   if(array[i] != searchedValue) {
     System.out.println("\nError");
   } else  {
   */

    for(int i=0; i<array.length; i++) {   //index=0 så att den börjar räkna från 0, array.length för o ta reda på antal element i en array,
     System.out.println(array[i]);


    if(array[i] == searchedValue) {  //om den platsen du är på = 57, gå in i if satsen
      indexSearchedValue = i;  //hittar vilken plats finns 57 på, för o spara i till senare
      break; // en break annars fortsätter den att skriva ner alla tal, break om vi vill att den ska stanna efter vår searchedValue



  //  }

  }

}
  System.out.println("Du hittade värdet på position " + indexSearchedValue);






  }
}
