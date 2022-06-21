package _05_Methoden;

public class Tarife {
    public static double Tarif1 (int a) {
       return 11.75 + a*0.5;
    }

    public static double Tarif2 (int a) {
        return 19.25 + a*0.25;
    }

    public static double Tarif3 (int a) {
        if (a<30) return 22.75; else return 22.75 + (a-30)*0.375;
    }

    public static void main(String[] args) {
        System.out.println("Im Folgenden werden die drei Tarife vergleichend dargestellt.");
        for (int i=0; i<=100; i+=10) {
            System.out.print(i + " Minuten - Tarif 1: " + Tarif1(i) + " ,");
            System.out.print(" Tarif 2: " + Tarif2(i) + " ," );
            System.out.println(" Tarif 3: " + Tarif3(i) + " ." );
        }
    }
}