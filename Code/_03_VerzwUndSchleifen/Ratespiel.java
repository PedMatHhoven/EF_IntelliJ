package _03_VerzwUndSchleifen;

import java.util.Scanner;

public class Ratespiel {
    public static void main(String[] args) {
        int zufallszahl = (int) (Math.random()*100+1);
        boolean pruefen = false;
        int versuche = 0;
        System.out.println("Bitte raten Sie eine Zahl zwischen 1 und 100!");
        while (pruefen == false) {
            Scanner raten = new Scanner(System.in);
            int Zahl = raten.nextInt();
            versuche = versuche + 1;
            if (Zahl == zufallszahl) {
                pruefen = true;
                if (versuche < 6) {
                    System.out.println("super - nur " + versuche + " Versuche!");
                } else if (versuche > 6 && versuche < 9) {
                    System.out.println("ganz okay - " + versuche + " Versuche!");
                } else {
                    System.out.println("naja - " + versuche + " Versuche!");
                }
            } else if (Zahl > zufallszahl) {
                System.out.println("gesuchte Zahl ist kleiner!");
            } else System.out.println("gesuchte Zahl ist größer!");
        }
    }
}