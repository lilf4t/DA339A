public class Test_parseInt {

   public static void main(String args[]) {
      // sträng till tal
      int nbrInt =Integer.parseInt("9");
      double nbrDbl = Double.parseDouble("5");

      System.out.println("Skriver ut tal som tal");
      System.out.println(nbrInt);
      System.out.println(nbrDbl);
      System.out.println("Nu lägger vi till 10");
      System.out.println(nbrInt+10);
      System.out.println(nbrDbl+10);


      // tal till sträng
      String strNbrInt = Integer.toString(nbrInt);
      String strNbrDbl = Double.toString(nbrDbl);

      System.out.println("Skriver ut tal som stängar");
      System.out.println(strNbrInt);
      System.out.println(strNbrDbl);
      System.out.println("Nu lägger vi till 10");
      System.out.println(strNbrInt+ 10);
      System.out.println(strNbrDbl+ 10);
   }
}
