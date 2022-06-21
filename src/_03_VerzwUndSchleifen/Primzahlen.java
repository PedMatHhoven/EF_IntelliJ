package _03_VerzwUndSchleifen;

public class Primzahlen {
    public static void main(String[] args) {
        boolean primzahl = true;
        int anzahlprimzahlen = 0;
        for (int zahl = 2; zahl <= 100; zahl++) {
            for(int division = 2; division < zahl; division++) {
                int modulozahl = zahl % division;
                if (modulozahl == 0) {
                    primzahl = false;
                    break;
                }
            }
            if (primzahl == true) {
                System.out.print(zahl + " ");
                anzahlprimzahlen += 1;
                if (anzahlprimzahlen % 9 == 0) System.out.println();
            }
            primzahl = true;
        }
        System.out.println("\nEs gibt " + anzahlprimzahlen + " Primzahlen!");
    }
}