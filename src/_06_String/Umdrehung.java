package _06_String;

import java.util.Scanner;

public class Umdrehung {
    public static String drehUm(String s) {
        int laenge = s.length();
        String umdrehung = "";
        for (int i = laenge - 1; i >= 0; i--)
            umdrehung = umdrehung.concat("" + s.charAt(i));
        return umdrehung;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte ein Wort ein!");
        String eingabe = scan.nextLine();
        String ergebnis = drehUm(eingabe);
        System.out.println("Das umgedrehte Wort lautet: " + ergebnis);
    }
}
