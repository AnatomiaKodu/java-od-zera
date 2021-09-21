package pl.anatomiakodu.java.skladnia;

public class Lekcja7Kolekcje {

    public static void main(String[] args) {

        // tablice
        System.out.println("===");
        System.out.println("tablice");
        String[] tablicaSlow = new String[10];
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

        int[] tablicaLiczb = {1, 23, 45, 7, 41};
    }
}
