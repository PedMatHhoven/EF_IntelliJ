import java.util.Scanner;

public class Notenspiegel {
  public static void main (String args[]){
    int[] anz = new int[6];
    System.out.println("Hiermit können Sie ihren Notenspiegel und Durchschnitt ermitteln!");
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Bitte geben Sie die Anzahl der Einsen an!");
    anz[0] = scan1.nextInt();
    System.out.println("Bitte geben Sie die Anzahl der Zweien an!");
    anz[1] = scan1.nextInt();
    System.out.println("Bitte geben Sie die Anzahl der Dreien an!");
    anz[2] = scan1.nextInt();
    System.out.println("Bitte geben Sie die Anzahl der Vieren an!");
    anz[3] = scan1.nextInt();
    System.out.println("Bitte geben Sie die Anzahl der Fünfen an!");
    anz[4] = scan1.nextInt();
    System.out.println("Bitte geben Sie die Anzahl der Sechsen an!");
    anz[5] = scan1.nextInt();

    float notenzsm = anz[0]*1 + anz[1]*2 + anz[2]*3 + anz[3]*4 + anz[4]*5 + anz[5]*6;
    float notenanzahl = anz[0] + anz[1] + anz[2] + anz[3] + anz[4] + anz[5];

    int[] a = new int[6];
    a[0]=1; a[1]=2; a[2]=3; a[3]=4; a[4]=5; a[5]=6;

    System.out.println("Notenspiegel:");
    for(int i=0; i<=5; i++) System.out.print(a[i] + "|");
    System.out.println();
    for(int i=0; i<=5; i++) System.out.print(anz[i] + "|");
    System.out.println();

    System.out.println("Durchschnitt: " + notenzsm/notenanzahl);
  }
}