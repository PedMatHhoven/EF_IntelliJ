import java.util.Scanner;

public class Zeichen {
    public static void main(String[] args) {
        System.out.println("Dieses Programm sagt Ihnen, was Sie eingegeben haben.");
        System.out.print("Ihre Eingabe: ");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.next();
        int ascii_zeichen = eingabe.charAt(0);
        if (ascii_zeichen >= 48 && ascii_zeichen <= 57) {
            System.out.println(eingabe + " ist eine Zahl!");
        } else if (ascii_zeichen >= 65 && ascii_zeichen <= 90) {
            System.out.println(eingabe + " ist ein Großbuchstabe");
        } else if (ascii_zeichen >= 97 && ascii_zeichen <= 122) {
            System.out.println(eingabe + " ist ein Kleinbuchstabe!");
        } else if (ascii_zeichen >= 33 && ascii_zeichen <= 126) {
            System.out.println(eingabe + " ist ein Sonderzeichen!");
        } else {
            System.out.println("Keine passende Kategorie!");
        }
        main(null); //die main-Methode wird erneut (von Beginn an) aufgerufen!
    }
}