package pl.anatomiakodu.java.skladnia;

public class Lekcja2cZmienneEnum {

    /*
    Upper case (with snake case)
    KLIENT_VIP_Z_KARTA_CZLONKOWSKA
    */

    public static void main(String[] args) {
        Kolor wybranyKolor = Kolor.CZERWONY;
        Kolor kolorSamochodu = Kolor.ZOLTY;

        System.out.println(wybranyKolor);
        System.out.println(kolorSamochodu);

        System.out.println(DniTygodnia.WTOREK);

        // konwersja z tekstu do enum
        Kolor niebieski = Kolor.valueOf("NIEBIESKI");
        System.out.println(niebieski.ordinal());
    }

    // enum możesz zdefiniować wewnątrz klasy
    enum Kolor {
        ZOLTY, CZERWONY, NIEBIESKI
    }
}
// enum możesz również zdefiniować poza klasą
enum DniTygodnia {
    PONIEDZIALEK, WTOREK, PIATEK
}
