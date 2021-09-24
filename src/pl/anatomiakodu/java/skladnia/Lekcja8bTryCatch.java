package pl.anatomiakodu.java.skladnia;

public class Lekcja8bTryCatch {

    /**
     * BUDOWA
     *
     * try-catch
     *
     * try {
     *      // logika która może wywołać wyjątek
     * } catch (Klasa-wyjatku nazwa-zmiennej){
     *      // logika która wykona się po wyrzuceniu wyjątku
     *      // wykona sie zamiast logiki w try
     * }
     *
     *
     * try-catch-finally
     *
     * try {
     *  // logika która może wywołać wyjątek
     * } catch (Klasa-wyjatku nazwa-zmiennej){
     *  // logika która wykona się po wyrzuceniu wyjątku
     *  // wykona sie zamiast logiki w try
     * } finaly {
     *  // logika która wykona się bez względu na to czy wyjątek zostanie wyrzucony czy nie
     * }
     *
     */


    public static void main(String[] args) {

        nullPointerException();
        arithmeticException();
        arrayIndexOutOfBoundsException();
        numberFormatException();

        celoweUzycieWyjatkow();

        System.out.println("Tekst który nigdy nie wyświetli się na konsoli ponieważ wyjątek przerywa całą metodę");

    }

    static void nullPointerException() {
        // Zdecydowanie najpopularniejszy
        try {
            String imie = null;
            imie.length();
        } catch (NullPointerException wyjatek) {

        }
    }

    static void arithmeticException() {
        try {
            Integer result = 123 / 0;
        } catch (ArithmeticException wyjatek) {

        }
    }

    static void arrayIndexOutOfBoundsException() {
        try {
            String[] tablica = {"element"};
            String element1 = tablica[1];
        } catch (ArrayIndexOutOfBoundsException wyjatek) {

        }
    }

    static void numberFormatException() {
        try {
            Integer.parseInt("sto");
        } catch (NumberFormatException wyjatek) {

        }
    }

    static void celoweUzycieWyjatkow() {

        przyklad1();
        przyklad2();

    }

    private static void przyklad1() {
        try {
            String imie = null;
            if (imie == null) {
                // Efekt:
                // "Exception in thread "main" java.lang.IllegalArgumentException: Błąd! Numer z dziennika nie może być ujemny!"
                throw new NullPointerException("Blad! Imie nie może nie istnieć!");
            }
        } catch (NullPointerException wyjatek) {

        }
    }

    private static void przyklad2() {
        try {
            Integer numerZDziennika = -213;
            if (numerZDziennika < 0) {
                // Opis który przekazujemy w wyjątku będzie wyświetlany w konsoli
                // "Exception in thread "main" java.lang.NullPointerException: Blad! Imie nie może nie istnieć!"
                throw new IllegalArgumentException("Błąd! Numer z dziennika nie może być ujemny!");
            }
        } catch (IllegalArgumentException wyjatek) {

        } finally {

        }
    }
}
