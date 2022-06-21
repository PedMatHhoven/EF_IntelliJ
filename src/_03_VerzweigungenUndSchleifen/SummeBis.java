import java.util.Scanner;

public class SummeBis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie bitte eine natürliche Zahl ein: ");
        int i = scan.nextInt();
        int j = 1; //zum Hochzählen
        int ergebnis = 0;
        String s = ""; //für Ausgabe der Rechnung
        do {
            ergebnis = ergebnis + i;
            s = s + j + " + ";
            i = i - 1;
            j = j + 1;
        } while (i > 1);
        //Ende der Schleife "zu früh", damit kein unnötiges "+" in s auftaucht
        //deshalb noch folgende zwei Anweisungen von Nöten
        ergebnis = ergebnis + 1;
        s = s + j;
        System.out.println("Die Summe aller natürlichen Zahlen bis zu deiner Zahl lautet: " + ergebnis);
        System.out.println("Prüfe: " + s + " = " + ergebnis);
    }
}
