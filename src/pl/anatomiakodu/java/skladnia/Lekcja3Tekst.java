package pl.anatomiakodu.java.skladnia;

public class Lekcja3Tekst {

    public static void main(String[] args) {
        podstawyPrzyklad1();
        podstawyPrzyklad2();
        operacjePrzyklad();
        znakiSpecjalnePrzyklad();
        laczenieTekstu();
    }

    static void podstawyPrzyklad1() {
        System.out.println("===");
        String tekst = "Witaj w Anatomii Kodu!";
        System.out.println("Dłogość tekstu: " + tekst.length());
        System.out.println("Małe litery: " + tekst.toLowerCase());
        System.out.println("Duże litery: " + tekst.toUpperCase());
        System.out.println("===");
    }

    static void podstawyPrzyklad2() {
        System.out.println("===");
        System.out.println("Łaczenie tekstu z String:");
        String czesc1 = "Anakin";
        String czesc2 = "Skywalker";
        String imieINazwisko = czesc1 + " " + czesc2;
        System.out.println(imieINazwisko);
        System.out.println(czesc1.concat(czesc2));
        // metoda trim usuwa spacje na początku i końcu tekstu
        String alfabet = "    Abcd EF    ".trim();
        String pustyTekst = "";
        System.out.println(pustyTekst.isEmpty());
        System.out.println(alfabet);
        System.out.println("===");
    }

    static void operacjePrzyklad() {
        System.out.println("===");
        String tekst = "Witaj w Anatomii Kodu!";
        String newText = tekst.replace("Witaj", "Cześć!");
        System.out.println(newText);
        System.out.println("Indeks słowa: " + tekst.indexOf("Kodu"));
        System.out.println("===");
    }

    static void laczenieTekstu() {
        // StringBuilder to klasa służąca do edytowania tekstu
        // dokumentacja: https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
        przykladZLaczeniem();
        przykladZOperacjami();
    }

    static void przykladZOperacjami() {
        System.out.println("===");
        StringBuilder ciagTekstu2 = new StringBuilder("Dzieńńńdóbry!");
        ciagTekstu2.delete(5,7); // pamiętaj - tylko druga wartość włącznie!
        ciagTekstu2.insert(5, " ");
        ciagTekstu2.replace(7,8, "o");
        System.out.println(ciagTekstu2);
        System.out.println("===");
    }

    static void przykladZLaczeniem() {
        System.out.println("===");
        StringBuilder ciagTekstu1 = new StringBuilder("Cześć!");
        ciagTekstu1.append("To jest 1 zdanie.");
        ciagTekstu1.append("To jest 2 zdanie.");
        System.out.println(ciagTekstu1);
        System.out.println("===");
    }

    static void znakiSpecjalnePrzyklad() {
        System.out.println("===");
        System.out.println("Znaki specjalne:");
        System.out.println("W filmie \"Star Wars\" bohater Obi-Wan Kenobi \\ Obi-Wan");
        System.out.println("To jest \n\nnowa linia! \t\t\ta to nowy odstęp!");
        System.out.println("===");
    }
}
