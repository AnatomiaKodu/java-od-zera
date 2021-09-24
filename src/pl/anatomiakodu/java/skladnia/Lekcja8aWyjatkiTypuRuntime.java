package pl.anatomiakodu.java.skladnia;

public class Lekcja8aWyjatkiTypuRuntime {

    /**
     * Co się stanie kiedy piszesz kod który jest niemożliwy do wykonania?
     *
     * Wszystkie wyjątki opisałem to:
     *  - NullPointerException
     *  - ArithmeticException
     *  - ArrayIndexOutOfBoundsException
     *  - NumberFormatException
     *  - IllegalArgumentException
     *
     * Każdy z nich jest wyjątkiem typu Runtime. To oznacza, że może wystąpić wszędzie w kodzie.
     *
     * */

    public static void main(String[] args) {

//        nullPointerException();
//        arithmeticException();
//        arrayIndexOutOfBoundsException();
//        numberFormatException();

        celoweUzycieWyjatkow();

        System.out.println("Tekst który nigdy nie wyświetli się na konsoli ponieważ wyjątek przerywa całą metodę");

    }

    static void nullPointerException() {
        // Zdecydowanie najpopularniejszy
        String imie = null;
        imie.length();
    }

    static void arithmeticException() {
        Integer result = 123 / 0;
    }

    static void arrayIndexOutOfBoundsException() {
        String[] tablica = {"element"};
        String element1 = tablica[1];
    }

    static void numberFormatException() {
        Integer.parseInt("sto");
    }

    static void celoweUzycieWyjatkow() {

//        przyklad1();
//        przyklad2();

    }

    private static void przyklad2() {
        Integer numerZDziennika = -213;
        if(numerZDziennika<0){
            // Opis który przekazujemy w wyjątku będzie wyświetlany w konsoli
            // "Exception in thread "main" java.lang.NullPointerException: Blad! Imie nie może nie istnieć!"
            throw new IllegalArgumentException("Błąd! Numer z dziennika nie może być ujemny!");
        }
    }

    private static void przyklad1() {
        String imie = null;
        if (imie == null) {
            // Efekt:
            // "Exception in thread "main" java.lang.IllegalArgumentException: Błąd! Numer z dziennika nie może być ujemny!"
            throw new NullPointerException("Blad! Imie nie może nie istnieć!");
        }
    }
}
