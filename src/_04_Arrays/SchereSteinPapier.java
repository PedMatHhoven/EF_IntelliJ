import java.util.*;

public class SchereSteinPapier {
    public static void main(String[] args) {
        String[] ssp = {"Schere","Stein","Papier"};
        int ZaehlerCom = 0, ZaehlerSpieler = 0;
        System.out.println("Spiel über drei Runden!");
        for (int i = 0; i != 3; i++) {
            Random computer = new Random();
            int com = computer.nextInt(3);
            Scanner eingabe = new Scanner(System.in);
            System.out.println("Schere, Stein oder Papier?");
            String eing = eingabe.nextLine();
            if (eing.equals(ssp[0]) && com == 0) {
                System.out.println("Schere gegen Schere - unentschieden - beide 1 Punkt.");
                ZaehlerCom += 1; ZaehlerSpieler += 1;
            } else if (eing.equals(ssp[0]) && com == 1) {
                System.out.println("Schere gegen Stein - verloren - Computer 1 Punkt.");
                ZaehlerCom += 1;
            } else if (eing.equals(ssp[0]) && com == 2) {
                System.out.println("Schere gegen Papier - gewonnen - Du 1 Punkt.");
                ZaehlerSpieler += 1;
            } else if (eing.equals(ssp[1]) && com == 0) {
                System.out.println("Stein gegen Schere - gewonnen - Du 1 Punkt.");
                ZaehlerSpieler += 1;
            } else if (eing.equals(ssp[1]) && com == 1) {
                System.out.println("Stein gegen Stein unentschieden - beide 1 Punkt.");
                ZaehlerCom += 1; ZaehlerSpieler += 1;
            } else if (eing.equals(ssp[1]) && com == 2) {
                System.out.println("Stein gegen Papier - verloren - Computer 1 Punkt.");
                ZaehlerCom += 1;
            } else if (eing.equals(ssp[2]) && com == 0) {
                System.out.println("Papier gegen Schere - verloren - Computer 1 Punkt.");
                ZaehlerCom += 1;
            } else if (eing.equals(ssp[2]) && com == 1) {
                System.out.println("Papier gegen Stein - gewonnen - Du 1 Punkt.");
                ZaehlerSpieler += 1;
            } else if (eing.equals(ssp[2]) && com == 2) {
                System.out.println("Papier gegen Papier - unentschieden - beide 1 Punkt.");
                ZaehlerCom += 1; ZaehlerSpieler += 1;
            } else System.out.println("Fehler - bitte komplett neustarten!");
        }
        System.out.println("Spielende!");
        if (ZaehlerCom > ZaehlerSpieler) {
            System.out.println("Leider verloren - Ergebnis: " + ZaehlerSpieler + " zu " + ZaehlerCom + ".");
        } else if (ZaehlerCom < ZaehlerSpieler) {
            System.out.println("Gewonnen :) - Ergebnis: " + ZaehlerSpieler + " zu " + ZaehlerCom + ".");
        } else System.out.println("Unentschieden: " + ZaehlerSpieler + " zu " + ZaehlerCom + ".");
    }
}
