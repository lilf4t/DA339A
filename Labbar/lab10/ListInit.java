public class ListInit {
  public static void main(String[] args) {
    // En array av int
    // Initieras med en lista
    int[] numbers = {7, 45, 13, 3, 99};
    // Printa rubriker
    System.out.printf("%5s%8s%n", "Index", "Value");
    // Loopa igenom arrayen och skriv ut
    for (int i=0; i < numbers.length; i++ ) {
      System.out.printf("%5d%8d%n", i, numbers[i]);
    }
  }
}
