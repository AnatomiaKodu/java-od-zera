package pl.anatomiakodu.java.skladnia;

public class Lekcja3Tekst {

    public static void main(String[] args) {
        podstawyPrzyklad();
        operacjePrzyklad();
        znakiSpecjalnePrzyklad();
        laczenieTekstu();
    }

    static void podstawyPrzyklad() {
        String tekst = "Witaj w Anatomii Kodu!";
        System.out.println("Dłogość tekstu: " + tekst.length());
        System.out.println("Małe litery: " + tekst.toLowerCase());
        System.out.println("Duże litery: " + tekst.toUpperCase());
    }

    static void operacjePrzyklad() {
        String tekst = "Witaj w Anatomii Kodu!";
        String newText = tekst.replace("Witaj", "Cześć!");
        System.out.println(newText);
        System.out.println("Indeks słowa: " + tekst.indexOf("Kodu"));
    }

    static void laczenieTekstu() {
        // StringBuilder klasa służąca do edytowania tekstu
        introPrzyklad();
        przykladZLaczeniem();
        przykladZOperacjami();
    }

    static void introPrzyklad() {
        System.out.println("===");
        System.out.println("Łaczenie tekstu:");
        String czesc1 = "Anakin";
        String czesc2 = "Skywalker";
        String imieINazwisko = czesc1 + " " + czesc2;
        System.out.println(imieINazwisko);
    }

    static void przykladZOperacjami() {
        StringBuilder ciagTekstu2 = new StringBuilder("Dzieńńńdóbry!");
        ciagTekstu2.delete(5,7); // pamiętaj - tylko druga wartość włącznie!
        ciagTekstu2.insert(5, " ");
        ciagTekstu2.replace(7,8, "o");
        System.out.println(ciagTekstu2);
        System.out.println("===");
    }

    static void przykladZLaczeniem() {
        StringBuilder ciagTekstu1 = new StringBuilder("Cześć!");
        ciagTekstu1.append("To jest 1 zdanie.");
        ciagTekstu1.append("To jest 2 zdanie.");
        System.out.println(ciagTekstu1);
    }

    static void znakiSpecjalnePrzyklad() {
        System.out.println("===");
        System.out.println("Znaki specjalne:");
        System.out.println("W filmie \"Star Wars\" bohater Obi-Wan Kenobi \\ Obi-Wan");
        System.out.println("To jest \n\nnowa linia! \t\t\ta to nowy odstęp!");
        System.out.println("===");
    }
}
