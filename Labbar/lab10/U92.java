import java.util.Scanner;

public class U92{

  public static void main(String[] args){

  int[][] array1 = {{1, 1, 2, 3, 3}, {2, 1, 1, 2, 3, 2}, {3, 2, 2, 1, 2}, {3, 3, 3, 3, 3}};

for(int i = 0; i < array1.length; i++){
  System.out.println();
  for(int j = 0; j < array1[0].length; j++){
    System.out.print(array1[i][j]);
  }
}
System.out.println();

  boolean[][] array2 = new boolean[array1.length][array1[0].length];

  // traversea array1
  for(int i = 0; i < array1.length; i++){
    for(int j = 0; j < array1[0].length; j++){

      int count = 0;

      // går tillbaka och letar ett steg därför -1
      // efter a och b mindre än 1 så att den inte går och kollar samma varje gång
      for(int a = -1; a <= 1; a++){
        for(int b = -1; b <= 1; b++){

          if((i + a >= 0) && (i + a < array1.length) && (j + b >= 0) && (j + b < array1[i].length) && !(a == 0 && b == 0)){
            count += array1[i + a][j + b];
            if(array1[i][j] == 3 || count >= 15){
              array2[i][j] = false;
            }
            else if(count < 15){
              array2[i][j] = true;
            }
            }

          }
        }
      }
    }
    // array2
    for(int i = 0; i < array2.length; i++){
      System.out.println();
      for(int n = 0; n < array2[0].length; n++){
        System.out.print(array2[i][n] + " ");
      }
    }

  }
}
