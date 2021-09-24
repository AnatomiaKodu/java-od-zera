package pl.anatomiakodu.java.skladnia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lekcja7bKolekcjeListaSet {

    public static void main(String[] args) {

        listy();
        zbiory();

    }

    static void zbiory() {
        System.out.println("===");
        // ArrayList to jedna z implementacji (definicji) List
        List<String> listaSamochodow = new ArrayList<>();
        String ferrari = "Ferrari";
        listaSamochodow.add(ferrari);
        listaSamochodow.add(ferrari);
        listaSamochodow.add(ferrari);

        System.out.println("Rozmiat listy: " + listaSamochodow.size());

        // HashSet to jedna z implementacji (definicji) Set'u
        Set<String> zbiórSamochodów = new HashSet<>();
        zbiórSamochodów.add(ferrari);
        zbiórSamochodów.add(ferrari);
        zbiórSamochodów.add(ferrari);

        System.out.println("Rozmiar zbioru: " + zbiórSamochodów.size());

        // metoda inicjalizująca
        Set<String> zbiórSamochodów2 = Set.of("Ferrari", "Volvo", "Mercedes");

        System.out.println("===");
    }

    static void listy() {
        System.out.println("===");
        List<String> listaSamochodow = new ArrayList<>();
        listaSamochodow.add("Ferrari");
        listaSamochodow.add("Volvo");
        listaSamochodow.add("Mercedes");

        // lub użyj metody inicjalizującej
        List<String> listaSamochodow2 = List.of("Ferrari", "Volvo", "Mercedes");

        String fiat = "Fiat";
        listaSamochodow.add(fiat);

        System.out.println("listaSamochodow czy jest pusta? - " + listaSamochodow.isEmpty());
        System.out.println("listaSamochodow rozmiar: " + listaSamochodow.size());
        System.out.println("listaSamochodow czy zawiera fiata? - " + listaSamochodow.contains(fiat));
        System.out.println("listaSamochodow index fiata - " + listaSamochodow.indexOf(fiat));
        System.out.println("listaSamochodow usuń fiata - " + listaSamochodow.remove(fiat));
        System.out.println("listaSamochodow czy zawiera fiata? - " + listaSamochodow.contains(fiat));
        System.out.println("listaSamochodow index nr 0 - " + listaSamochodow.get(0));

        // Przy inicjalozacji tablicy trzeba podać wielkość
        String[] tablicaSamochodow = listaSamochodow.toArray(new String[listaSamochodow.size()]);
        System.out.println("===");
    }
}
