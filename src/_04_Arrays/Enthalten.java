import java.util.Scanner;

public class Enthalten {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in) ;
    System.out.println("Gesuchte natürliche Zahl eingeben (zwischen 1 und 20):");
    int b = scan.nextInt();
    int[] a = {3,5,7,11,13,17};
    boolean c = false;
    for (int i=0; i<=5; i++) {
      if (b == a[i]) {
        System.out.println(b + " im Array vorhanden");
        c = true;
      }
    }
    if (c == false) {
      System.out.println(b + " nicht im Array vorhanden");
    }
  }
}