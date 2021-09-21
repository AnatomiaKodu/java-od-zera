package pl.anatomiakodu.java.skladnia;

public class Lekcja3OperacjeMatematyczne {

    public static void main(String[] args) {
        int liczba1 = 10;
        int liczba2 = 2;

        System.out.println("Operacje matematyczne:");
        System.out.println("===================");
        System.out.println(liczba1 + liczba2 + " - dodawanie");
        System.out.println(liczba1 - liczba2 + " - odejmowanie");
        System.out.println(liczba1 * liczba2 + " - mnożenie");
        System.out.println(liczba1 / liczba2 + " - dzielenie");
        System.out.println(liczba2 % liczba1  + " - modulo");
        System.out.println(++liczba1  + " - zwiększ o 1");
        System.out.println(liczba1++  + " - zwiększ o 1");
        System.out.println(liczba1  + " - test");
        System.out.println(--liczba1 + " - zmniejsz o 1");
        System.out.println("===================");

        // Nan - Not a Number
        System.out.println("Nan - Not a Number:");
        Float wynik = 0f / 0f;
        System.out.println(wynik);
        System.out.println("Czy to jest NaN? - " + wynik.isNaN());
        System.out.println("===================");
    }
}
