
//uppgift 6

import java.util.Scanner;

public class Savings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amount;
        int weeks;
        int sum;
        int bonus1 = 100;
        int bonus2 = 50;
        int total = 0;


        System.out.println ("Hur mycket sparar du var vecka?" );
        amount = in.nextInt();
        System.out.println ("Hur många veckor sparar du?" );
        weeks = in.nextInt();
        sum = weeks * amount;


        if (sum >= 5000) {
            System.out.println ("Du är en duktig sparare!" );
          total = sum + bonus1;
}
         else if (sum >= 2500) {
            System.out.println ("Du är en duktig sparare!" );
          total = sum + bonus2;
}

        else  {
        System.out.println ("Du är ej bra på att spara!" );
        total = sum;
}

        System.out.println("Efter "+weeks+ " veckor har du " + total + " kr.");


    }
}
