package pl.anatomiakodu.java.skladnia;

public class Lekcja6bPetleOperacje {

    public static void main(String[] args) {
        przykladContinue();
        przykladBreak();
        przykladWewnetrznePetle();
    }

    static void przykladWewnetrznePetle() {
        System.out.println("===");
        System.out.println("Wyswietl tabliczkę mnożenia:");
        for (int indeksX = 1; indeksX < 10; ++indeksX) {
            System.out.println("Mnożymy teraz: " + indeksX);
            for (int indeksY = 1; indeksY < 10; ++indeksY) {
                System.out.println(indeksX + " x " + indeksY + " = " + indeksX * indeksY);
            }
            System.out.println("koniec wewnętrznej pętli");
        }
        System.out.println("===");
    }

    static void przykladBreak() {
        System.out.println("===");
        Integer numerZawodnika = 0;
        while (true) {
            if (numerZawodnika == 5) {
                System.out.println("Znaleziono zawodnika nr 5!");
                // break przerywa pętle w której obecnie się znajdujemy
                break;
            }
            ++numerZawodnika;
        }
        System.out.println("===");
    }

    static void przykladContinue() {
        System.out.println("===");
        for (int indeks = 0; indeks < 10; indeks++) {
            if (indeks % 2 == 1) {
                System.out.println("STOP! Liczba " + indeks + " jest nieparzysta");
                // continue kończy obecną iterację pętli i przechodzi do kolejnej
                continue;
            }
            System.out.println("Liczba " + indeks + " jest parzysta");
        }
        System.out.println("===");
    }
}
