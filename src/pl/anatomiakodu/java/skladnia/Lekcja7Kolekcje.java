package pl.anatomiakodu.java.skladnia;

import java.util.Arrays;

public class Lekcja7Kolekcje {

    public static void main(String[] args) {

        // tablice
        System.out.println("===");
        System.out.println("tablice");

        // definicja pustej tablicy
        String[] tablicaSlow = new String[10];
        // Tablica zaczyna się od ZERA!
        tablicaSlow[0] = "Zero";
        tablicaSlow[1] = "Jeden";
        tablicaSlow[7] = "Siedem"; // ???
        //tablicaSlow[2] = "Osiem"; - problem z kolejnością

        System.out.println(tablicaSlow[0]);
        System.out.println(tablicaSlow[1]);
        System.out.println(tablicaSlow[7]);

        System.out.println("===");
        System.out.println("Tablica + Pętla");

        System.out.println("Ilosc elementów w tablicy: " + tablicaSlow.length);
        for (int indeks = 0; indeks < tablicaSlow.length; indeks++) {
            System.out.println(tablicaSlow[indeks]);
        }

        System.out.println("===");
        // definicja tablicy z elementami
        int[] tablicaLiczb1 = {1, 23, 45, 7, 41};
        int elementZIndexem2 = tablicaLiczb1[2];
        System.out.println("Element z indexem 2 to: " + elementZIndexem2);
        tablicaLiczb1[2] = 34;
        System.out.println("Zmiana na: " + tablicaLiczb1[2]);

        int[] tablicaLiczb2 = {0, 1, 2, 3, 4, 5};
        System.arraycopy(tablicaLiczb2, 2, tablicaLiczb1, 0, 3);

        Arrays.copyOf(tablicaLiczb1, 2);
        System.arraycopy(tablicaLiczb1, 1, tablicaLiczb2, 2, 4);

//        int[] suma = Arrays.fill();

        String[][] tytuly = {
                {"Pan. ", "Pani. "},
                {"Kowalski", "Nowak", "Lewandowski", "Boniek"}
        };

        String tytulyPanaNowaka = tytuly[0][1];
        String tytulyPaniBoniek = tytuly[1][3];
    }
}
