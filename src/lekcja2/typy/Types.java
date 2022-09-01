package lekcja2.typy;

class Types {

    /**
     * 0. Zmienne - nazwa i typ
     *      a) wybór nazwy (słowa kluczowe)
     *      b) camelCase
     * 1. Typy prymitywne i obiektowe/referencyjne (non-primitive)
     * 2. Porównanie typów liczbowych:
     *      a) Byte, byte - 8-bit
     *      b) Short, short - 16-bit
     *      c) Integer, int - 32-bit
     *      d) Long, long - 64-bit
     * 3. Wartość minimalna i maksymalna
     * 4. Typy liczbowe zmiennoprzecinkowe:
     *      a) Float, float - 32-bit
     *      b) Double, double - 64-bit
     * 5. Typ tekstowy String
     * 6. Typ logiczny - Boolean, boolean
     * 7. Wartość null
     * 8. Typ literalny Char, char 16-bit
     * */
    public static void main(String[] args) {
        zmienneLiczbowe();
        zmienneZmiennoPrzecinkowe();
        zmiennaTekstowa();
        zmienneLogiczne();
        waroscNull();
        typChar();
    }

    private static void typChar() {
        System.out.println("Typ literalny char");
        char x = 'a';
        char y = 'q';
        System.out.println(x);
        System.out.println(y);
        System.out.println("===========");
    }

    private static void waroscNull() {
        System.out.println("nulle");
        Integer a = null;
        String b = null;
        String c = "";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("===========");
    }

    private static void zmienneLogiczne() {
        System.out.println("zmienne logiczne");
        boolean a = true;
        boolean a1 = false;
        Boolean b1 = true;
        Boolean b2 = true;

        boolean czy5JestWiekszeNiz2 = 5 > 2;
        int x = 1;
        int y = 2;
        Boolean czyLiczbySaRowne = x == y;

        System.out.println(czy5JestWiekszeNiz2);
        System.out.println(czyLiczbySaRowne);
        System.out.println("===========");
    }

    private static void zmiennaTekstowa() {
        System.out.println("Typ tekstowy");
        String informacja = "Jestem typem String!";
        String informacjaMalymiLiterami = informacja.toLowerCase();
        String informacjaDuzymiLiterami = informacja.toUpperCase();
        System.out.println(informacja);
        System.out.println(informacjaMalymiLiterami);
        System.out.println(informacjaDuzymiLiterami);
        System.out.println("===========");
    }

    private static void zmienneZmiennoPrzecinkowe() {
        System.out.println("Typy zmiennoprzecinkowe");
        double x = 1.5;
        Double x2 = 2.312;
        Double liczbaPi = 3.14;

        float y = 121.221323f;
        Float y2 = 32432432.34324324234f;

        System.out.println(x);
        System.out.println(y);
        System.out.println("===========");
    }

    static void zmienneLiczbowe(){
        System.out.println("Zmienne Liczbowe");
        int x;
        int zmiennaX;
        int iloscKolWSamochodzie; // camelCase
        int iloscOkienWMieszkaniu;
        int iloscCukierkowWPudelku;

        int y =  12;
//        System.out.println(y);

        int z1 =  13;
        Integer z2 = 13;

//        System.out.println(z1);
//        System.out.println(z2);

        z2.intValue();

        byte a1 = 111;
        short a2 = 11111;
        int a3 = 1111111111;
        long a4 = 11111111111111L;

        System.out.println("Zakres Byte:");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Zakres Short:");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("Zakres Integer:");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Zakres Long:");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("===========");
    }

}
