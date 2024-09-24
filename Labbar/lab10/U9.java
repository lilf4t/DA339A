
//Uppgift 9

public class U9{
    public static void main(String[] args) {


        int[][] array1 =
        {
         {1,1,2,3,},
         {2,1,1,2,},
         {3,2,2,1,},
         {3,3,3,3,}
        };

        //skriver ut array1
        for(int i = 0; i<array1.length; i++){
            System.out.println();
            for(int j=0; j<array1[0].length; j++){
                System.out.print(array1[i][j] + " ");
            }
        }
        System.out.println();

        //deklarerar boolean för array2
        boolean[][] array2 = new boolean[array1.length][array1[0].length];


        //for loopar för o traversera genom array1
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[0].length; j++){

                //deklarerar c för counter
                int c = 0;

                //-1 för den letar ett steg bak
                for(int x = -1; x <=1; x++){
                 for(int y = -1; y<=1; y++){

/*
• Om positionen en figur står på har värdet 3 dör figuren direkt.
• Om det sammanlagda värdet av grannarna till positionen (utan positionens egna värde)
är 15 eller mer dör figuren direkt.
• Om positionen figuren står på har värdet 2 eller mindre och grannarnas sammanlagda
värde är mindre än 15 lever figuren vidare.
 */
                   if((i + x >= 0) && (i + x < array1.length) && (j + y >= 0) && (j + y < array1[i].length) && !(x == 0 && y == 0)){
                     //sparar array1[i+x][j+y] i var c, denna letar genom både ix och jy
                      c += array1[i+x][j+y];
                     }
                      if(array1[i][j] == 3 || c >= 15){
                        array2[i][j]  = false;
                        }
                        else if(c < 15){
                         array2[i][j]  = true;
                        }
                    }
                }
            }
        }
        //skriver ut array2
        for(int i = 0; i<array2.length; i++){
          System.out.println();
            for(int j=0; j<array2[0].length; j++){
              System.out.print(array2[i][j] + " ");
            }
        }
    }
}
