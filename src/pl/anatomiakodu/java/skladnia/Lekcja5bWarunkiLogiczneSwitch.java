package pl.anatomiakodu.java.skladnia;

public class Lekcja5bWarunkiLogiczneSwitch {

    enum Kolor {
        FIOLETOWY, JASNY_CZERWONY, ŻOLTY, CIEMNY_ZIELONY;
    }

    enum Danie {
        NAPOJ_BURGER_I_FRYTKI, BURGER_I_FRYTKI, FRYTKI, MALZE
    }

    public static void main(String[] args) {
        Kolor zielony = Kolor.CIEMNY_ZIELONY;

        wyswietlKolor(zielony);
        wyswietlKolor(Kolor.ŻOLTY);
        wyswietlKolor(Kolor.JASNY_CZERWONY);

        zjedzWMcdonald(Danie.NAPOJ_BURGER_I_FRYTKI);
        zjedzWMcdonald(Danie.BURGER_I_FRYTKI);
        zjedzWMcdonald(Danie.FRYTKI);
        zjedzWMcdonald(Danie.MALZE);

    }

    static void wyswietlKolor(Kolor kolor) {
        System.out.println("===");
        System.out.println("Wybrano kolor: " + kolor);
        switch (kolor) {
            case ŻOLTY:
                System.out.println("żółty dostępny!");
                break;
            case CIEMNY_ZIELONY:
                System.out.println("ciemnozielony dostępny!");
                break;
            default:
                System.out.println("Domyślny kolor to biały!");
        }
        System.out.println("===");
    }

    static void zjedzWMcdonald(Danie danie) {
        System.out.println("===");
        System.out.println("Wybrano zjedz w McDonald: " + danie);
        switch (danie) {
            case NAPOJ_BURGER_I_FRYTKI:
                System.out.println("Krok 1:");
                System.out.println("Napij się Coli!");
            case BURGER_I_FRYTKI:
                System.out.println("Krok 2:");
                System.out.println("Zjedz Burgera!");
            case FRYTKI:
                System.out.println("Krok 3:");
                System.out.println("Zjedz Frytki!");
            default:
                System.out.println("McDonald nie serwuje tego dania!");
        }
        System.out.println("===");
    }
}
