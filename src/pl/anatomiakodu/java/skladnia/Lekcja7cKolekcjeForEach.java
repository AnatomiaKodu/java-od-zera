package pl.anatomiakodu.java.skladnia;

import java.util.List;
import java.util.Set;

public class Lekcja7cKolekcjeForEach {

    public static void main(String[] args) {

        porownianiePetli();
        foreachNaTablicy();
        foreachNaZbiorze();

    }

    static void porownianiePetli() {
        System.out.println("===");
        List<String> listaSamochodow = List.of("Ferrari", "Volvo", "Mercedes");

        // pętla for
        for (int indeks = 0; indeks < listaSamochodow.size(); indeks++) {
            String samochod = listaSamochodow.get(indeks);
            System.out.println(samochod);
        }

        System.out.println("\nRezultat jest dokładnie taki sam a zapis jest dużo prostszy:\n");

        // pętla for-each
        // for ($typ-argumentu $aktualny-argument : $kolekcja-po-której-iterujemy)
        for (String samochod : listaSamochodow) {
            System.out.println(samochod);
        }
        System.out.println("===");
    }

    static void foreachNaZbiorze() {
        System.out.println("===");
        Set<Character> alfabet = Set.of('a', 'b', 'c');
        for (Character litera : alfabet) {
            System.out.println(litera);
        }
        System.out.println("===");
    }

    static void foreachNaTablicy() {
        System.out.println("===");
        Integer[] liczby = {1,2,3,4,5};
        for (Integer liczba : liczby) {
            System.out.println(liczba);
        }
        System.out.println("===");
    }
}
