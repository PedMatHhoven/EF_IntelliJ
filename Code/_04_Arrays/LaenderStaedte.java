package _04_Arrays;

import java.util.Scanner;

public class LaenderStaedte {
    public static void main(String[] args) {
        System.out.println("Hiermit können Sie eine kurze Übersicht über ein paar Länder " +
                "und zugehörige Hauptstädte erstellen!");
        System.out.println("Bitte drei Länder mit Hauptstadt - je in einer Zeile - eingeben.");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        String[][] c = new String[3][3];
        for (int i = 0; i <= 2; i++)
            for (int j = 0; j <= 1; j++)
                c[i][j] = scan.next();
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Land:", c[0][0], c[1][0], c[2][0]);
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Hauptstadt:", c[0][1], c[1][1], c[2][1]);
    }
}