package _06_String;

import java.util.Scanner;

public class Verschlüsselung {
    public static String Verschluesseln(String code) {
        char[] buchstaben = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int laenge = code.length();
        String codiert = "";
        for (int i = 0; i <= laenge - 1; i++) {
            for (int j = 0; j <= 25; j++) {
                if (code.charAt(i) == buchstaben[j]) {
                    codiert = codiert + j + ", ";
                }
            }
        }
        return codiert;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine Nachricht ein, die Du gerne verschlüsselt hättest!");
        System.out.println("Bitte alles in Kleinbuchstaben und ohne Umlaute notieren!");
        String code = scan.nextLine();
        System.out.println("Deine Verschlüsselung lautet: \n" + Verschluesseln(code));
    }
}
