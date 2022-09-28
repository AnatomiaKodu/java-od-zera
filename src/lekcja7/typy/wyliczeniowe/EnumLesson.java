package lekcja7.typy.wyliczeniowe;

import java.util.Arrays;

class EnumLesson {

    public static String CAT = "kot";

    /**
     *  @formatter:off
     *
     *  Enum:
     *  - czym jest enum? Przykłady: Kolory, Dni tygodnia, Zwierzęta
     *  - constants (unchangeable variables) - public, static, final
     *  - enum jako zmienna
     *  - porównywanie ==
     *  - values() - tablica
     *  - ordinal()
     *
     *  docs:   https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Enum.html
     *
     *  @formatter:on
     */
    public static void main(String[] args) {
        createEnum();
        enumAsVariable();
        compareEnum();
        usefulMethods();
        enumFromNumber();
    }

    private static void enumFromNumber() {
        System.out.println("Enum na podstawie indexu");
        Color colorOfMyFiat = Color.RED;
        System.out.println(colorOfMyFiat.ordinal());
        System.out.println(Color.GREEN.ordinal());

        Color myColor = Color.values()[3];
        System.out.println(myColor);
        System.out.println("=====================");
    }

    private static void usefulMethods() {
        System.out.println("Metoda values()");

        Color[] values = Color.values();
        System.out.println(Arrays.toString(values));

        System.out.println("Metoda valueOf - enum z tekstu");
        Color yellowColor = Color.valueOf("YELLOW");
        System.out.println(yellowColor);
        System.out.println(yellowColor);
        System.out.println(yellowColor);

        System.out.println(Color.YELLOW.name());
        System.out.println(Color.RED.name());
        System.out.println("=====================");
    }

    private static void compareEnum() {
        System.out.println("Compare enums:");
        Weather todayWeather = Weather.CLOUDY;
        System.out.println(todayWeather == Weather.WINDY);
        System.out.println(todayWeather == Weather.CLOUDY);
        System.out.println(todayWeather.equals(Weather.SUNNY));
        System.out.println("=====================");
    }

    private static void enumAsVariable() {
        System.out.println("Enum jako zmienna:");
        Weather todayWeather = Weather.CLOUDY;
        System.out.println(todayWeather);
        todayWeather = Weather.SUNNY;
        System.out.println(todayWeather);
        System.out.println("=====================");
    }

    private static void createEnum() {
        System.out.println("Tworzenie enuma");
        Color colorOfMyFerrari = Color.RED;

        System.out.println(Color.GREEN);
        System.out.println("Kolor mojego Ferrari to: " + colorOfMyFerrari);
        System.out.println("Dziś jest: " + Weather.SUNNY);

        System.out.println("My favorite animal is: " + Animal.TIGER);

        Color[] colorsOfRainbow = {Color.BLUE, Color.YELLOW, Color.RED};
        System.out.println(Arrays.toString(colorsOfRainbow));
        System.out.println("=====================");

        System.out.println("public static constant - jako alternatywa dla enuma");
        System.out.println(CAT);
        System.out.println(Things.HAMMER);
        System.out.println("=====================");
    }

    enum Color {
        RED, BLUE, GREEN, YELLOW
    }
}

enum Weather {
    SUNNY, CLOUDY, WINDY, RAINY
}

