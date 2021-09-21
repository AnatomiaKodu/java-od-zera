package pl.anatomiakodu.java.skladnia;

public class Lekcja5aWarunkiLogiczne {

    public static void main(String[] args) {

        Boolean warunek1 = true;
        boolean warunek2 = false;

        andPrzyklad(warunek1, warunek2);
        orPrzyklad(warunek1, warunek2);
        negacjaPrzyklad(warunek1, warunek2);
        ifElsePrzyklad();
        warunekZPorownaniem(warunek2);
    }

    private static void warunekZPorownaniem(boolean warunek2) {
        if (warunek2 == false) {
            System.out.println("Spełniono warunek 5");
        } else {
            System.out.println("Nie spełniono warunku 5");
        }

        if ("tekst" instanceof String) {
            System.out.println("Spełniono warunek 5");
        } else {
            System.out.println("Nie spełniono warunku 5");
        }
    }

    private static void ifElsePrzyklad() {
        Integer zmienna1 = 4;
        if (zmienna1 + 2 >= 6) {
            System.out.println("Spełniono warunek 4a");
        } else if (zmienna1 + 2 < 6) {
            System.out.println("Spełniono warunek 4b");
        } else {
            System.out.println("Nie spełniono warunku 4");
        }
    }

    private static void negacjaPrzyklad(Boolean warunek1, boolean warunek2) {
        if (warunek1 && !warunek2) {
            System.out.println("Spełniono warunek 3");
        } else {
            System.out.println("Nie spełniono warunku 1");
        }
    }

    private static void orPrzyklad(Boolean warunek1, boolean warunek2) {
        if (warunek1 || warunek2) {
            System.out.println("Spełniono warunek 2");
        } else {
            System.out.println("Nie spełniono warunku 1");
        }
    }

    private static void andPrzyklad(Boolean warunek1, boolean warunek2) {
        if (warunek1 && warunek2) {
            System.out.println("Spełniono warunek 1");
        }
    }
}
