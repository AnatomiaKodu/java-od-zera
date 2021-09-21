package pl.anatomiakodu.java.skladnia;

class Lekcja1MetodaMain {

    // main to standardowa metoda dzięki której możemy odpalać aplikację w Java
    // deklaracja do wykucia na pamięć ;)
    public static void main(String[] args) {
        // każda linia musi być zakończona ; lub zamknięciem nawiasu wąsatego }

        // System.out.println to metoda służąca do wyświetlania tekstu w konsoli
        System.out.println("Witaj Swiecie!");

        // każda metoda posiada nawiasy na końcu
        metodaKtoraNicNieRobi();

        // jeśli metoda posiada parametry to muszą znaleźć się wewnątrz nawiasu
        metodaZParametrami("tekst 1", "tekst 2", 123, 12);

        // kilka metod może się tak samo nazywać pod warunkiem że posiada różne parametry
        wyswietlTekst();
        wyswietlTekst("Witaj Świecie!");
        wyswietlTekst("Witaj", "Świecie!");

        String nowyTekst = pobierzTekst();
        System.out.println(nowyTekst);
    }

    // static definiuje że metoda jest statyczna - na samym początku nauki nie musisz wnikać w szczegóły ;)
    // void przed nazwą metody oznacza, że metoda nie zwraca żadnej wartości
    // nawiasy wąsate {} - zawierają całą logikę metody
    static void metodaKtoraNicNieRobi() {
    }

    // 2 parametry typu tekst (String) i 2 parametry liczbowe (int)
    static void metodaZParametrami(String parametr1, String parametr2, int parametr3, int parametr4) {
    }

    static void wyswietlTekst() {
        System.out.println("jakiś tekst");
    }

    // tekstDoWyswietlenia to tekstowy parametr tej metody
    static void wyswietlTekst(String tekstDoWyswietlenia) {
        System.out.println(tekstDoWyswietlenia);
    }

    // metoda z 2 parametrami
    static void wyswietlTekst(String tekstDoWyswietlenia, String drugiTekstDoWyswietlenia) {
        System.out.println(tekstDoWyswietlenia);
        System.out.println(drugiTekstDoWyswietlenia);
    }

    // String przed nazwą metody oznacza, że metoda zwraca tekst
    static String pobierzTekst() {
        // return oznacza wartość jaką metoda ostaecznie ma zwrócić
        return "Cześć Planeto ;)";
    }
}
