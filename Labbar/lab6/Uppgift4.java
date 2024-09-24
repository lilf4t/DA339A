// Uppggift 4



public class Uppgift4 {
   public static void main(String[] args) {

     //b
      for (int i = 1; i <= 10; i++) {
         for (int j = 1; j <= 10-i; j++) {
            System.out.print('*');
         }

         System.out.println();
      }

//a
        for (int i = 1; i <= 10; i++) {
           for (int j = 1; j <= 0+i; j++) {
              System.out.print('*');
           }

           System.out.println();
        }
//c ?????????????????????????????
  for (int i = 1; i <= 5; i++) {
   for (int j = 1; j <= 0+i; j++) {
        System.out.print('*');
       }
   System.out.println();
}

for (int a = 4; a <= 1; a++) {
 for (int b = 2; b <= 0+a; b++) {
      System.out.print('*');
     }
 System.out.println();
}




   }
}
