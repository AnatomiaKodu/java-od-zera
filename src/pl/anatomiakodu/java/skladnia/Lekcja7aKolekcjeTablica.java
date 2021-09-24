package pl.anatomiakodu.java.skladnia;

// import pozwala Ci korzystać z gotowych klas
// importy zawsze znajduą się na samej górze klasy tuż pod informacją o pakiecie (package)
import java.util.Arrays;

public class Lekcja7aKolekcjeTablica {

    public static void main(String[] args) {
        start();
        tablicaIPetla();
        operacjeNaTablicach();
        tablicaDwuWymiarowa();

    }

    static void start() {
        System.out.println("===");
        // tablice
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
    }

    static void tablicaIPetla() {
        System.out.println("===");
        System.out.println("Tablica + Pętla");
        String[] tablicaSlow = {"a", "b", "c", "d", "e"};
        System.out.println("Ilosc elementów w tablicy: " + tablicaSlow.length);
        for (int indeks = 0; indeks < tablicaSlow.length; indeks++) {
            System.out.println(tablicaSlow[indeks]);
        }
        System.out.println("===");
    }

    static void operacjeNaTablicach() {
        System.out.println("===");
        // definicja tablicy z elementami
        int[] tablicaLiczb1 = {1, 23, 45, 7, 41};
        int elementZIndexem2 = tablicaLiczb1[2];
        System.out.println("Element z indexem 2 to: " + elementZIndexem2);
        tablicaLiczb1[2] = 34;
        System.out.println("Zmiana na: " + tablicaLiczb1[2]);

        int[] tablicaLiczb2 = {0, 1, 2, 3, 4, 5};
        System.arraycopy(tablicaLiczb2, 2, tablicaLiczb1, 0, 3);

        // Warto sprawdzić dokuementację klasy Arrays
        // klasa Arrays została zaimportowana na samym początku tego pliku.
        // https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

        Arrays.copyOf(tablicaLiczb1, 2);
        System.arraycopy(tablicaLiczb1, 1, tablicaLiczb2, 2, 4);

        int[] suma = new int[5];
        Arrays.fill(suma, 123);
        for (int indeks = 0; indeks < suma.length; indeks++) {
            System.out.println(suma[indeks]);
        }
        System.out.println("===");
    }

    static void tablicaDwuWymiarowa() {
        System.out.println("===");
        String[][] zwierzeta = {
                // tu są koty
                {"Kot", "Lew", "Tygrys", "Puma"},
                // tu są psy
                {"Labrador", "Doberman", "Owczarek Niemiecki"}
        };

        String kot = zwierzeta[0][2];
        String pies = zwierzeta[1][0];

        System.out.println(kot);
        System.out.println(pies);
        System.out.println("===");
    }
}
