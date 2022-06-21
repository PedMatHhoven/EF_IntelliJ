import java.util.Scanner;

public class Monate {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie einen Monat als Zahl ein!");
        Scanner scan = new Scanner(System.in);
        int monat = scan.nextInt();
        switch(monat) {
            case 1: System.out.println("Januar: 31 Tage");
                    break;
            case 2: System.out.println("Februar: 28 Tage");
                    break;
            case 3: System.out.println("März: 31 Tage");
                    break;
            case 4: System.out.println("April: 30 Tage");
                    break;
            case 5: System.out.println("Mai: 31 Tage");
                    break;
            case 6: System.out.println("Juni: 30 Tage");
                    break;
            case 7: System.out.println("Juli: 31 Tage");
                    break;
            case 8: System.out.println("August: 31 Tage");
                    break;
            case 9: System.out.println("September: 30 Tage");
                    break;
            case 10: System.out.println("Oktober: 31 Tage");
                    break;
            case 11: System.out.println("November: 30 Tage");
                    break;
            case 12: System.out.println("Dezember: 31 Tage");
                    break;
            default: System.out.println("Diese Eingabe ist ungültig!");
        }
    }
}
