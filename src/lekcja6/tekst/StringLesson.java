package lekcja6.tekst;


import java.util.Arrays;

class StringLesson {

    /**
     *  @formatter:off
     *
     *  Stringi:
     *  - indexOf, lastIndexOf
     *  - charAt
     *  - substring
     *  - Concatenation: concat oraz +
     *  - format
     *  - join
     *  - replace
     *  - split
     *  - trim
     *  - contains
     *  - startsWith, endsWith
     *  - equals
     *  - Special Characters - \\ \" \n \t
     *  - immutable - StringBuilder: append, delete, insert
     *
     *  docs:   https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
     *          https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html
     *          https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html
     *
     *  @formatter:on
     */
    public static void main(String[] args) {
        upperAndLower();
        indexOfExamples();
        stringOperations();
        stringOperations2();
        formatText();
        immutable();
    }

    private static void immutable() {
        System.out.println("Immutable");
        String x = "aaaa";
        System.out.println(x);
        String y = x.concat("bbb");
        System.out.println(x);
        System.out.println(y);

        StringBuilder mutableText = new StringBuilder("Witaj mój zły świecie!");
        System.out.println(mutableText);
        mutableText.append(" :)");
        System.out.println(mutableText);
        mutableText.replace(10, 13, "wspaniały");
        System.out.println(mutableText);
        System.out.println("================");
    }

    private static void stringOperations2() {
        System.out.println("Join:");
        System.out.println(String.join(",", "Ananas", "Ogórek", "Jabłko"));
        System.out.println(String.join("; ", "Ananas", "Ogórek", "Jabłko"));

        System.out.println("Replace:");
        String text = "Jestem smutnym tekstem!";
        System.out.println(text);
        text = text.replace("smutnym", "wesołym");
        System.out.println(text);

        String sentence = "To jest bardzo mądre zdanie";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words[2]);

        System.out.println("Trim, Empty i Blank:");
        System.out.println("     aass  asdsd    aa       ".trim());
        System.out.println("".isEmpty());
        System.out.println("        ".isBlank());

        System.out.println("startsWith, endsWith");
        String sentence2 = "Jestem smutnym tekstem";
        System.out.println(sentence2.startsWith("Aaaaa"));
        System.out.println(sentence2.endsWith("tekstem"));
        System.out.println(sentence2.endsWith("tem"));
        System.out.println(sentence2.endsWith("tem "));

        System.out.println("Porównywanie");
        String x = "banan";
        String y = "jabłko";
        System.out.println(x.equals(y));
        System.out.println(x.equals("banan"));

        System.out.println("Znaki specjalne:");
        System.out.println("Michal \"Mike\" Cwiekala \\ \\");
        System.out.println("\t Hello");
        System.out.println("\n Hello \n ");
        System.out.println("\t\t\t Hello");
        System.out.println("================");
    }

    private static void stringOperations() {
        System.out.println("Char At");
        String text = "Jestem tekstem";

        char letter = text.charAt(3);
        System.out.println(letter);
        System.out.println(text.charAt(10));
//        System.out.println(text.charAt(21));
//        System.out.println(text.charAt(-2));
        System.out.println("substring");

        System.out.println(text.substring(5));
        System.out.println(text.substring(4, 8)); // start index włącznie, endIndex Wyłącznie
        System.out.println(text.substring(7, 8));
        System.out.println(text.substring(7, 7));

        String concatenation = "aaa" + " bbb " + 123 + true;
        System.out.println(concatenation);
        System.out.println("aaa" + 123);
        System.out.println(123 + "asddd");
        System.out.println(text.concat(". A to jest kolejne zdanie."));
        System.out.println("================");
    }

    private static void formatText() {
        System.out.println("Formatowanie");
        String information = "Czesc Michal, dzis jest Sobota, a godzina 22:20";
        System.out.println(information);
        String informationWithParamaters = "Czesc %s, dzis jest %s, a godzina %s";
        String formattedInfo1 = informationWithParamaters.formatted("Karol", "Poniedziałek", "11:15");
        System.out.println(formattedInfo1);
        System.out.println(informationWithParamaters.formatted("Ewa", "Niedziela", "11:32"));
        System.out.println("================");
    }

    private static void indexOfExamples() {
        System.out.println("Metoda indexOf");
        String text = "Jestem tekstem";
        int indexA = text.indexOf("a");
        int indexT = text.indexOf("t");
        System.out.println(indexA);
        System.out.println(indexT);
        System.out.println(text.indexOf("J"));

        System.out.println("Metoda lastIndexOf");
        System.out.println(text.lastIndexOf("t"));
        System.out.println(text.indexOf("t", 5));
        System.out.println("================");
    }

    private static void upperAndLower() {
        System.out.println("wielkie i małę litery");
        String text = "Jestem tekstem";

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println("================");
    }
}
