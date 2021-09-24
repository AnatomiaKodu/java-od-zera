package pl.anatomiakodu.java.skladnia;

public class Lekcja6aPetle {

    /**
     * BUDOWA
     *
     * Pętla for:
     *
     * for ($wyrażenie-na-początku; $wyrażenie-na-końcu; $wyrażenie-powtarzane-za-każdym-razem) {
     *     // logika
     * }
     *
     * Pętla while
     *
     * while ($warunek) {
     *     // logika
     * }
     *
     * Pętla do-while
     *
     * do {
     *     // logika
     * } while ($warunek);
     *
     */

    public static void main(String[] args) {
        petlaForPrzyklad1();
        petlaForPrzyklad2();
        petlaWhilePrzyklad();
        petlaNieskończona();
        petlaDoWhile();
    }

    private static void petlaForPrzyklad1() {
        System.out.println("===");
        System.out.println("Pętla for:");
        // Pętla for definicja
        // for (wyrażenie-wykonywane-na-początku-pętli ; warunek-sprawdzany-po-każdej-iteracji ; wyrażenie-wykonywane-po-każdej-iteracji)
        for (int indeks = 0; indeks <= 10; indeks++) {
            System.out.println("Powtórzenie nr: " + indeks);
        }
        System.out.println("===");
    }

    private static void petlaForPrzyklad2() {
        System.out.println("===");
        System.out.println("Kolejna pętla for:");
        int indeks = 20;
        for (; indeks > 10; indeks--) {
            System.out.println("Powtórzenie nr: " + indeks);
        }
        System.out.println("===");
    }

    static void petlaWhilePrzyklad() {
        // Pętla while
        // najpierw warunek potem logika
        System.out.println("===");
        System.out.println("Pętla while:");
        Integer iloscUcziowDoWyswietlenia = 10;
        // while (zawiera-warunek-jaki-trzeba-spełnić-by-logika-się-wykonała)
        while (iloscUcziowDoWyswietlenia > 0) {
            System.out.println("Wyswietlono ucznia nr: " + iloscUcziowDoWyswietlenia);
            iloscUcziowDoWyswietlenia = iloscUcziowDoWyswietlenia - 1;
        }
        System.out.println("===");
    }

    static void petlaDoWhile() {
        // Pętla Do/While
        // najpierw logika potem warunek
        System.out.println("===");
        System.out.println("Pętla do/while:");
        Integer uczenNumer = 1;
        // do zawiera logikę do wykonania
        do {
            System.out.println("Wyswietlono ucznia nr: " + uczenNumer);
            uczenNumer = uczenNumer + 3;
        // while (zawiera-warunek-jaki-trzeba-spełnić-by-logika-wykonała-się-poraz-koeljny)
        } while (uczenNumer >= 10);
        System.out.println("===");
    }

    static void petlaNieskończona() {
        // Pętla nieskończona
//        while (true) {
//            System.out.println("ups...");
//        }
    }
}
