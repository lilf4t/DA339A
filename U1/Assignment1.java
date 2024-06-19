/*
Author: Fatima Kadum
Id: an4263
Study program: DT
*/
import java.util.Scanner;
public class Assignment1{
  static int choice;
  static String newAge;
  static String newName;
  static int index1;
  static int index2;
  static Scanner input = new Scanner(System.in);
  static String[][] guestList =
  {{"Adam Ason", "35"},
  {"Berta Bson", "70"},
  {"Ceasar Cson", "12"},
  {"",""},
  {"",""},
  {"",""},
  {"",""},
  {"",""},
  {"",""},
  {"",""},
};

//-----------------------------Guest list---------------------------------------


public static void printGuestList(){
  System.out.println();
  System.out.printf("%1s%6s%7s%n", "Index", "Name", "Age");
  System.out.println("----------------------------------");

  for(int i = 0; i < guestList.length; i++){
    if(guestList[i][0] != "") {
      System.out.println(i + " " + guestList[i][0] + " " + guestList[i][1] + " ");
      }
    }
 }

//---------------------------Print Statistics-----------------------------------

public static void printStatistics(){
  System.out.println();
  System.out.println("You chose to print statistics");
  System.out.println("----------------------------------");

  int guests = 0;
  int adults  = 0;
  int children = 0;
  int oldestAge = 0;
  int oldestName = 0;
  int youngestAge = 200;
  int youngestName = 0;


  for(int i = 0; i < guestList.length; i++){
    //räknar antal gäster
    if(guestList[i][1] != ""){
      guests++;
      //räknar antal barn
      if(Integer.parseInt(guestList[i][1]) <= 13) {
        children++;
        //räknar antal vuxna
      }  else if(Integer.parseInt(guestList[i][1]) > 13) {
        adults++;
      }
      //räknar ut den äldsta
      if(Integer.parseInt(guestList[i][1]) > oldestAge){
        oldestName = i;
        oldestAge = Integer.parseInt(guestList[i][1]);
      }
      //räknar ut den yngsta
      if(Integer.parseInt(guestList[i][1]) < youngestAge){
        youngestName = i;
        youngestAge = Integer.parseInt(guestList[i][1]);
      }
    }
  }
  //antal gäster som finns
  System.out.println();
  System.out.print("Amounts of guests present: " + guests);
  System.out.println();

  //antal vuxna som finns
  System.out.println();
  System.out.print("Amount of adults: " + adults);
  System.out.println();

  //antal barn som finns
  System.out.println();
  System.out.println("Amount of children: " + children);
  System.out.println();

  //äldsta gästen
  System.out.println();
  System.out.println("The oldest guest: " + guestList[oldestName][0] + " " + oldestAge);
  System.out.println();

  //yngsta gästen
  System.out.println();
  System.out.println("The youngest guest: " + guestList[youngestName][0] + " " + youngestAge);
  System.out.println();
}

//---------------------------Add guest------------------------------------------

public static void addGuest(){
  System.out.println("You chose to add a guest");
  System.out.println("----------------------------------");
  Scanner addNewGuest = new Scanner(System.in);

  int ageInt;
  String ageString;
  String name;

  //namn
  System.out.println("Please input the name of the guest: ");
  name = addNewGuest.nextLine();
  //ålder
  System.out.println("Please input the age of the guest: ");
  ageInt = addNewGuest.nextInt();

  ageString = Integer.toString(ageInt);

  for(int i = 0; i < guestList.length; i++){
    if(guestList[i][0] == "") {
      guestList[i][0] = name;
      guestList[i][1] = ageString;

      System.out.println( name + " with the age of  " + ageString + " is added to the guest list.");
      break;
    }
    if(guestList.length-1 == i) {
      System.out.println("Error. You can't add any more guests.");
    }
  }
}

//---------------------------Change name of guest-------------------------------

public static void changeNameOfGuest(){
  System.out.println("You chose to change the name of a guest");
  System.out.println("----------------------------------");

  int index;

  Scanner chooseIndex = new Scanner(System.in);
  System.out.println("Please input the index of the guests name you want to change");
  index = chooseIndex.nextInt();

  if(index > guestList.length || index < 0 || index > 9 || guestList[index][0] == "") {
    System.out.println("Error, please choose an existing index value");
  } else {

    guestList[index][0] = newName;

    Scanner changeName = new Scanner(System.in);
    System.out.println("What name would you like to replace it with?");
    newName = changeName.nextLine();

    if(newName != "") {
      guestList[index][0] = newName;
    }
  }
}

//---------------------------Change age of guest--------------------------------

public static void changeAgeOfGuest(){
  System.out.println("You chose to change the age of a guest");

  int index;

  Scanner chooseIndex = new Scanner(System.in);
  System.out.println("Please input the index of the guests age you want to change");
  index = chooseIndex.nextInt();

  if(index > guestList.length || index < 0 || index > 9 || guestList[index][0] == "") {
    System.out.println("Error, please choose an existing index value");
  }
  else {

    guestList[index][1] = newAge;

    Scanner changeAge = new Scanner(System.in);
    System.out.println("What age would you like to replace it with?");
    newAge = changeAge.nextLine();

    guestList[index][1] = newAge;
  }
}

//---------------------------Remove guest---------------------------------------

public static void removeGuest(){
  System.out.println("You chose to remove a guest");

  int index;

  Scanner chooseIndex = new Scanner(System.in);
  System.out.println("Please input the index of the guest you want to remove");
  index = chooseIndex.nextInt();

  if(index > guestList[0].length || index < 0) {
    System.out.println("Error, please choose an existing index value");
  }
  else {
    guestList[index][0] = "";
    guestList[index][1] = "";
  }
}

//---------------------------Change places--------------------------------------

public static void changePlaces(){

  String tempName;
  String tempAge;

  System.out.println("You chose to switch places between index "+index1+" and "+index2);

  printGuestList();

  Scanner chooseIndex = new Scanner(System.in);
  System.out.println("Please input the first index of the guest you want to switch places with");
  index1 = chooseIndex.nextInt();
  System.out.println("Please input the second index of the guest you want to switch places with");
  index2 = chooseIndex.nextInt();

  if(index1 > guestList.length || index2 > guestList.length){
    System.out.println("Please choose an index between 0-9");
  }
  else {
    tempName = guestList[index1][0];
    tempAge = guestList[index1][1];

    guestList[index1][0] = guestList[index2][0];
    guestList[index1][1] = guestList[index2][1];

    guestList[index2][0] = tempName;
    guestList[index2][1] = tempAge;
  }
}

//---------------------------Menu-----------------------------------------------

public static void printMenu(){
  System.out.println();
  System.out.println("         Program menu            ");
  System.out.println("---------------------------------");
  System.out.println("Print guest list:               1");
  System.out.println("Print statistics:               2");
  System.out.println("Add guest:                      3");
  System.out.println("Change name of guest:           4");
  System.out.println("Change age of guest:            5");
  System.out.println("Remove guest:                   6");
  System.out.println("Switch places between guests:   7");
  System.out.println("Cancel:                        -1");
}

//---------------------------Main method----------------------------------------

public static void main(String[] args) {

  while(choice != -1) {
    printMenu();
    choice = input.nextInt();

    if(choice == 1) {
      printGuestList();
    }
    else if(choice == 2) {
      printStatistics();
    }
    else if(choice == 3) {
      addGuest();
    }
    else if(choice == 4) {
      changeNameOfGuest();
    }
    else if(choice == 5) {
      changeAgeOfGuest();
    }
    else if(choice == 6) {
      removeGuest();
    }
    else if(choice == 7) {
      changePlaces();
    }
    else if(choice == -1) {
      System.out.println("You have canceled.");
      }
    else {
      System.out.println("Invalid input. Please choose from menu.");
      }
    }
  }
}
