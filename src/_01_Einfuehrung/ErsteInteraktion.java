package _01_Einführung;

import java.util.Scanner;

public class ErsteInteraktion {
    public static void main (String[] args) {
        System.out.println("Die Zweite!");
        System.out.println("Los geht es!");
        System.out.println("Es sind sogar mehrere Variablen enthalten!");
        System.out.println("Zum Glück haben wir auch schon die Scanner-Klasse kennengelernt!");
        //Deklaration einer Scanner-Variablen
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWie heißen Sie?");
        //Einlesen einer String-Variablen mithilfe der Scanner-Instanz
        String wort = scan.nextLine();
        System.out.println("Okay - " + wort + " - ein schöner Name!");
        System.out.println("Und wie alt sind sie?");
        int alter = scan.nextInt();
        System.out.println("Wow, das hätte ich nicht erwartet.");
        System.out.println("Ich hätte Sie höchstens auf " + (alter-5) + " geschätzt!");
    }
}
