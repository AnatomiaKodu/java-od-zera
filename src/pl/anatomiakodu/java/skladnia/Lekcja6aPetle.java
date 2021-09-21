package pl.anatomiakodu.java.skladnia;

public class Lekcja6aPetle {

    public static void main(String[] args) {
        petlaForPrzyklad();
        petlaWhilePrzyklad();
        petlaPrzyklad();
        petlaDoWhile();
    }

    private static void petlaDoWhile() {
        // Pętla Do/While
        System.out.println("===");
        System.out.println("Pętla do/while:");
        Integer uczenNumer = 1;
        do {
            System.out.println("Wyswietlono ucznia nr: " + uczenNumer);
            uczenNumer = uczenNumer + 3;
        // Wyswietl tak długo dopóki:
        } while (uczenNumer >= 10);
        System.out.println("===");
    }

    private static void petlaPrzyklad() {
        // Pętla nieskończona
//        while (true) {
//            System.out.println("ups...");
//        }
    }

    private static void petlaForPrzyklad() {
        // Pętla for
        System.out.println("Pętla for:");
        System.out.println("===");
        for (int indeks = 0; indeks <= 10; indeks++) {
            System.out.println("Powtórzenie nr: " + indeks);
        }
    }

    private static void petlaWhilePrzyklad() {
        // Pętla while
        System.out.println("===");
        System.out.println("Pętla while:");
        Integer iloscUcziowDoWyswietlenia = 10;
        // Wyswietl tak długo dopóki:
        while (iloscUcziowDoWyswietlenia > 0) {
            System.out.println("Wyswietlono ucznia nr: " + iloscUcziowDoWyswietlenia);
            iloscUcziowDoWyswietlenia = iloscUcziowDoWyswietlenia - 1;
        }
    }
}
