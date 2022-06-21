package _05_Methoden;

import java.util.Scanner;

public class Seminar {
    public static double Punkte(double a, double b) {
        return (a*3)+(b*2);
    }

    public static void main(String[] args) {
        System.out.println("Geben Sie bitte im Folgenden die erreichten Punkte an.");
        System.out.println("1. Die Punkte der Hausarbeit (0-10):");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("2. Die Punkte des Vortrags (0-10):");
        double b = scan.nextDouble();
        double c = Punkte(a,b);
        System.out.println("Die Gesamtpunktzahl beträgt " + c + ".");
    }
}
