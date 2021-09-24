package pl.anatomiakodu.java.skladnia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lekcja7dKolekcjeMap {

    public static void main(String[] args) {
        jakDzialaMapa();
        powtorzeniaWMapie();
    }

    static void jakDzialaMapa() {
        System.out.println("===");
        // HashMap to implementacja (definicja) Mapy
        Map<Integer, String> dziennikUczniow = new HashMap<>();

        // pierwszy element jest kluczem - musi być unikalna
        // drugi element jest wartością - może się powtarzać
        dziennikUczniow.put(1, "Adam");
        dziennikUczniow.put(2, "Karol");
        dziennikUczniow.put(3, "Zosia");
        dziennikUczniow.put(4, "Karolina");
        dziennikUczniow.put(5, "Krzysztof");

        String imieUcznia = dziennikUczniow.get(2);
        // Zosia jednak przeprowadziła się do innego miasta...
        dziennikUczniow.remove(3);

        System.out.println("Uczniem z numerem 2 jest: " + imieUcznia);
        System.out.println("czy posiada ucznia z numerem 0? - " + dziennikUczniow.containsKey(0));

        System.out.println("\nNumery:");
        Set<Integer> numeryUcziow = dziennikUczniow.keySet();
        for (Integer numer : numeryUcziow) {
            System.out.println(numer);
        }
        System.out.println("\nImiona:");
        List<String> imionaUczniow = new ArrayList<>(dziennikUczniow.values());
        for (String imie : imionaUczniow) {
            System.out.println(imie);
        }
        System.out.println("===");
    }

    static void powtorzeniaWMapie() {
        System.out.println("===");
        System.out.println("Słownik kolorów");
        Map<Kolor, String> slownikKolorow = new HashMap<>();
        slownikKolorow.put(Kolor.CZERWONY, "czerwień alizarynowa");
        slownikKolorow.put(Kolor.NIEBIESKI, "błękit Turnbulla");
        slownikKolorow.put(Kolor.ZOLTY, "bahama yellow");

        slownikKolorow.containsKey(Kolor.ZOLTY);
        System.out.println("aktualny żółty: " + slownikKolorow.get(Kolor.ZOLTY));
        slownikKolorow.put(Kolor.ZOLTY, "szafranowy");
        slownikKolorow.put(Kolor.ZOLTY, "kanarkowy");
        System.out.println("aktualny żółty: " + slownikKolorow.get(Kolor.ZOLTY));
        System.out.println("===");
    }
}
enum Kolor {
    ZOLTY, CZERWONY, NIEBIESKI
}