package _03_VerzwUndSchleifen;

import java.util.Scanner;

public class EinMalEins {
    public static void main(String[] args) {
        System.out.println("Bitte Zahl eingeben");
        Scanner eingeben = new Scanner(System.in);
        int eingegeben = eingeben.nextInt();
        for(int faktor=1; faktor<=10; faktor++) {
            System.out.println(eingegeben*faktor);
        }
    }
}
