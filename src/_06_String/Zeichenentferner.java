package _06_String;

import java.util.Scanner;

public class Zeichenentferner {
    public static String Entfernung(String buchstabe) {
        String satz = "Drei Chinesen mit dem Kontrabass";
        int laenge = satz.length();
        String neuer_satz = "";
        for (int i = 0; i <= laenge - 1; i++) {
            String help = satz.substring(i, i + 1);
            if (!buchstabe.equals(help)) neuer_satz += help;
        }
        return neuer_satz;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie einen Buchstaben ein, den Sie gerne entfernt haben möchten!");
        System.out.println("Das ist der Satz: Drei Chinesen mit dem Kontrabass");
        String eingabe = scan.next();
        String satz = Entfernung(eingabe);
        System.out.println("Der Satz ohne " + eingabe + " lautet:\n" + satz);
    }
}

