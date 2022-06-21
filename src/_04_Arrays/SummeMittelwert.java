import java.util.Scanner;
public class SummeMittelwert {
  public static void main(String[] args) {
    double[] a = new double[10];
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie 10 Zahlen ein, getrennt durch Leerzeichen.");
    double summe = a[0];
    double mittelwert = a[0];
    for (int i=0; i<=9 ;i++ ) {
         a[i] = scan.nextDouble();
    } 
    summe = a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
    mittelwert = summe /10;
    System.out.println("Die Summer aller Zahlen lautet: "+summe);
    System.out.println("Der Mittelwert lautet: "+mittelwert); 
  } 
} 
