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

        System.out.println(liczbowaZmiennaLokalna);
        System.out.println(liczbowaZmiennaGlobalna);

        System.out.println("###");
        System.out.println("Local vs Global");
        System.out.println("###");
        System.out.println("lokalnie: " + warunek);
        System.out.println("globalnie: " + Lekcja2bZmienneGlobalne.warunek);

    }

}
