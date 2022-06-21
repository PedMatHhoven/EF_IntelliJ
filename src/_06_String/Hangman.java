package _06_String;

import java.util.Scanner;

public class Hangman {
    public static String[] woerter = {"TITANIC", "SCHIFFFAHRTSGESELLSCHAFT", "COMPUTERABSTURZ", "VORSTANDSSPRECHER",
            "MAGAZIN", "ZUFALL", "CYBERSEX", "KONTAKTANZEIGEN", "KOSTENPFLICHTIG", "KREDITKARTE", "EISENBAHN",
            "WIRRUNGEN",
            "FAMILIENLEBEN", "ATLANTIK", "TYPENVIELFALT", "ZUGBEGLEITERINNEN", "HOCHSOMMERTAG", "KRATZER",
            "ARBEITSINSTRUMENT", "SERVERSTEUERUNG", "AUSBLICK", "GANGSCHALTUNG", "OPFER", "Benedikt",
            "REIS", "ESSSTAEBCHEN", "LIEGESTUHL", "WASSERMELONE", "STROHHALM", "LAWINE", "WEINTRAUBE",
            "DATENVERARBEITUNG", "PORZELLAN", "AKTIE", "QUALLE", "KORREKTUR", "MARATHONLAUF", "PFERDERENNEN",
            "ORCHESTER", "NATURKATASTROPHE", "ZINSSATZ", "ADVENT", "KAPITAL", "POST", "DATENBANK", "NETZWERKUMGEBUNG",
            "ZWISCHENZEIT", "PFANNE", "MAUSTASTE", "HANDBUCH", "ZUSAMMENSETZUNG", "SHANGHAI",
            "CHINA", "VITAMINE", "MAUS", "FEUERWEHR", "FUSSBALL", "STRASSENLATERNE", "PROTOKOLL", "ELECTRONIC",
            "LOKOMOTIVE", "BASEL","Informatik", "SCHWEIZ", "KALENDER", "DRUCKER", "AUTOBAHN", "BANGKOK", "TELEFON",
            "KREDITOR", "BEARBEITUNG", "ZYLINDERROLLENLAGER", "SEGELFLUGZEUG", "MOTORFLUGZEUG", "FEUER", "ANANAS",
            "HANGMAN", "HALLO", "WEISSWEIN", "OBERAFFENGEIL", "SCHLAGERFORUM", "KILOMETER",
            "WURSTSALAT", "WANDERGESELLE", "NASHORNAUGEN", "UNIKAT", "WORT", "POLIZEI", "SCHWARZMARKT", "TAKTFRQUENZ",
            "LOEFFEL", "MAISKOLBEN", "MAUSZEIGER", "UNSINN", "KIPPE",
            "DRUCKERANSCHLUS", "BIER", "BIERFASS", "FAHRRADSATTELTASCHE", "BUNDESRAT", "TATSACHE", "PUSTEKUCHEN",
            "KIRSCHKERNWEITSPUCKWETTBEWERB", "KOSTENVORANSCHLAG",
            "COMPUTERDATENBANKZUSATZSPEICHER", "DANKE", "SPREEWALD", "KINGSWAY", "EPSONDRUCKER", "CHILICHIPS",
            "SENTABABY", "HANDYGAME", "HUEHNERSUPPE", "ROCKY", "EISTEE",
            "SCHWANGERSCHAFTSKONFLIKTBERATUNG", "KIRCHENOBERHAUPT", "RABE", "PARANOID", "SCHWEINFURT",
            "MORGENMUFFEL", "SCHLAFWANDLER", "BLIND", "EGAL",
            "DONAUDAMPFSCHIFFFAHRTGESELLSCHAFTSKAPITAENMUETZE", "SCHILLERSTRASSE", "SYNAPSE", "KLEISTER",
            "FLUGZEUGGESCHWADER", "FRAGESTUNDE", "MALERBETRIEB", "ARZTHELFER", "GLUECK",
            };

    public static String wort = woerter[(int) (Math.random() * woerter.length)];
    public static String a = new String(new char[wort.length()]).replace("\0", "_");
    public static int leben = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        while (leben < 7 && a.contains("_")) {
            System.out.println("Raten sie jeden Buchstaben des Wortes(Nur Großbuchstaben");
            System.out.println(a);
            String rate = sc.next();
            hang(rate);
        }
    }

    public static void hang(String rate) {
        String newa = "";
        for (int i = 0; i < wort.length(); i++) { //Prüfung auf richtig geratenen Buchstaben
            if (wort.charAt(i) == rate.charAt(0)) {
                newa += rate.charAt(0); //erratenen Buchstaben einblenden
            } else if (a.charAt(i) != '_') {
                newa += wort.charAt(i); //vorher geratene Buchstaben stehenlassen
            } else {
                newa += "_"; //noch nicht geratene Stellen-Unterstriche stehenlassen
            }
        }
        if (a.equals(newa)) { //wenn sich nichts geändert hat, ist der Buchstabe nicht dabei!
            leben++;
            Falsch();
        } else {
            a = newa; //Zwischenlösung wird (neu) gespeichert (laut newa oben)
        }
        if (a.equals(wort)) {
            System.out.println("Korekt! Du hast gewonnen! Das Wort war " + wort);
        }
    }

    public static void Falsch() {
        if (leben == 1) {
            System.out.println("Falsch, nächster Versuch");
            System.out.println(        "");
            System.out.println(       "");
            System.out.println(       "");
            System.out.println("\t__|__");
        } else if (leben == 2) {
            System.out.println("Falsch, nächster Versuch");
            System.out.println("");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__");
        } else if (leben == 3) {
            System.out.println("Falsch, nächster Versuch");
            System.out.println("  ----");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__");
        } else if (leben == 4) {
            System.out.println("Falsch, nächster Versuch");
            System.out.println("  ----");
            System.out.println("  |  /\\");
            System.out.println("  |  \\/");
            System.out.println("__|__");
        } else if (leben == 5) {
            System.out.println("Falsch, nächster Versuch");
            System.out.println("  |   /  \\");
            System.out.println("  |   \\(:/");
            System.out.println("__|__  |");
            System.out.println("              ");
        } else if (leben == 6) {
            System.out.println("Falsch, nächster Versuch");
            System.out.println("\t----");
            System.out.println("\t|   /  \\");
            System.out.println("\t|   \\(:/");
            System.out.println("  __|__  |");
            System.out.println("         /\\");
        } else if (leben == 7) {
            System.out.println("RIP, Tod durch: " + wort);
            System.out.println("\t----");
            System.out.println("\t|   /  \\");
            System.out.println("\t|   \\(:/");
            System.out.println("  __|__ -|-");
            System.out.println("         /\\");
        }
    }
}
