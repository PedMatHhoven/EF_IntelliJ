package _05_Methoden;

import java.util.Scanner;
//Das Programm funktioniert nur über das "Terminal" - weil darüber eine Windows-Konsole läuft.
//Die kompilierte Datei (im out-Ordner) muss erstmal über cd... angesteuert
//und dann über "java Dateiname" gestartet werden!
public class Passwort {
    public static void gibNutzerAus(String s) {
        System.out.println("Nutzer ist also: " + s);
    }
    public static String gibPasswort() {
        char[] pass = System.console().readPassword();
        return String.valueOf(pass);
    }

    public static void main(String[] args) {
        System.out.println("Kleines Test-Programm zur Eingabe eines unsichtbaren Passworts :).");
        System.out.print("Nutzername: ");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        System.out.print("Passwort: ");
        String s2 = gibPasswort();
        System.out.println("-------------- CHECK --------------");
        gibNutzerAus(s1);
        System.out.println("Passwort ist also: " + s2);
    }
}