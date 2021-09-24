package pl.anatomiakodu.java.skladnia;

public class Lekcja5aWarunkiLogiczne {

    public static void main(String[] args) {
        andPrzyklad();
        orPrzyklad();
        negacjaPrzyklad();
        ifElsePrzyklad();
        warunekZPorownaniem();
    }

    static void andPrzyklad() {
        System.out.println("===");
        Boolean warunek1 = true;
        boolean warunek2 = false;
        if (warunek1 && warunek2) {
            System.out.println("Spełniono warunek 1");
        }
        System.out.println("===");
    }

    static void orPrzyklad() {
        System.out.println("===");
        boolean warunek1 = true;
        boolean warunek2 = false;
        if (warunek1 || warunek2) {
            System.out.println("Spełniono warunek 2");
        } else {
            System.out.println("Nie spełniono warunku 1");
        }
        System.out.println("===");
    }

    static void negacjaPrzyklad() {
        System.out.println("===");
        Boolean warunek1 = true;
        Boolean warunek2 = false;
        if (warunek1 && !warunek2) {
            System.out.println("Spełniono warunek 3");
        } else {
            System.out.println("Nie spełniono warunku 1");
        }
        System.out.println("===");
    }

    static void ifElsePrzyklad() {
        System.out.println("===");
        Integer zmienna1 = 4;
        if (zmienna1 + 2 >= 6) {
            System.out.println("Spełniono warunek 4a");
        } else if (zmienna1 + 2 < 6) {
            System.out.println("Spełniono warunek 4b");
        } else {
            System.out.println("Nie spełniono warunku 4");
        }
        System.out.println("===");
    }

    static void warunekZPorownaniem() {
        System.out.println("===");
        boolean warunek = false;
        if (warunek == false) {
            System.out.println("Spełniono warunek 5");
        } else {
            System.out.println("Nie spełniono warunku 5");
        }

        if ("tekst" instanceof String) {
            System.out.println("Spełniono warunek 5");
        } else {
            System.out.println("Nie spełniono warunku 5");
        }
        System.out.println("===");
    }
}
