package pl.anatomiakodu.java.skladnia;

public class Lekcja2bZmienneGlobalne {

    static String tekstowaZmiennaGlobalna = "tekst 1";
    static Integer liczbowaZmiennaGlobalna = 123;
    static Boolean warunek = true;

    public static void main(String[] args) {
        String tekstowaZmiennaLokalna = "tekst 2";
        Integer liczbowaZmiennaLokalna = 999;
        Boolean warunek = false;

        System.out.println(tekstowaZmiennaLokalna);
        System.out.println(tekstowaZmiennaGlobalna);

        przykladWMetodzie();

        System.out.println("###");
        System.out.println("Local vs Global");
        System.out.println("###");
        System.out.println("lokalnie: " + warunek);
        System.out.println("globalnie: " + Lekcja2bZmienneGlobalne.warunek);
    }

    private static void przykladWMetodzie() {
        Integer liczbowaZmiennaLokalna = 555;
        // Nie mamy dostępu do liczbowaZmiennaLokalna w metodzie main
        System.out.println(liczbowaZmiennaLokalna);
        // Za to cały czas mamy dostęp do liczbowaZmiennaGlobalna
        System.out.println(liczbowaZmiennaGlobalna);
    }

}
