import java.util.*;

//Uppgift 10
public class prova{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kostnad = 0;
        double rabatt = 0;
        double totalSum = 0;

        int x = 0;
        int c = 0;

        String [][] behandling = {{"Kontroll","600"},{"Lagning hål","1500"},{"Rengöring","300"}};
        String [][] kostnadArrayen = new String[10][2];

        Behandlingar();
        x = input.nextInt();

        while (x != -1){
            if((c < 10) && (x < 3)){
                kostnadArrayen[c] = behandling[x];
                kostnadArrayen[c][1] = behandling[x][1];
                kostnad += Integer.parseInt(behandling[x][1]);
                c++;
            }
            Behandlingar();
            x = input.nextInt();
        }

        if(kostnad >= 3000){
            rabatt = kostnad * 0.10;
        }
        totalSum = kostnad - rabatt;
        Kvitto(kostnad, rabatt, totalSum, kostnadArrayen);
    }

    public static void Behandlingar(){
        System.out.println();
        System.out.println("Ange vilken bebhandling som utförts: ");
        System.out.println("Kontroll: 0");
        System.out.println("Laga hål: 1");
        System.out.println("Rengöring: 2");
        System.out.println("Avbryt: -1");
        System.out.println();
    }

    public static void Kvitto(double k, double r, double tS, String [][] array){
        System.out.println("Kvitto");
        for(int i = 0; i < array.length; i++){
            if(array[i][0] != null){
                System.out.println(array[i][0]+ "   " + array[i][1]);
            }
        }
        System.out.println("--------------------------");
        System.out.println("Kostnad             " + k);
        System.out.println("Rabatt              " + r);
        System.out.println("Summa att betala    " + tS);
    }
}
