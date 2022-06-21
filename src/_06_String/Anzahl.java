package _06_String;

import java.util.Scanner;

public class Anzahl {
    public static int count(String s, char a) {
        int i=0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == a) i += 1;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println("Text eingeben:");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        System.out.println("Welchen Buchstaben möchten Sie suchen?");
        char suchstabe = scanner.next().charAt(0);
        int x = count(eingabe, suchstabe);
        System.out.println("Ihr gesuchter Buchstabe ist " + x + " mal im Text vorhanden!");
    }
}