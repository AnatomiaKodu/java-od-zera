package lekcja9.petle;

class LoopLesson {

    /**
     *  @formatter:off
     *
     *  Pętle:
     *  - pętla for:
     *      for (statement 1; statement 2; statement 3) {
     *        // code
     *      }
     *  - pętla while:
     *      while (condition) {
     *       // code
     *      }
     *  - pętla do-while
     *      do {
     *       // code
     *      }
     *      while (condition);
     *  - for and array
     *  - break
     *  - continue
     *
     *  @formatter:on
     */
    public static void main(String[] args) {

        forLoopExplained();
        forAndArray();
        whileAndDoWhile();
        continueAndBreak();

    }

    private static void continueAndBreak() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("for: continue i break");
        System.out.println("Koljeka klientów");
        for (int customerNumber = 0; customerNumber <= 20; customerNumber++) {
            if (customerNumber == 7 || customerNumber == 13) {
                System.out.println("Pomiń klienta nr: " + customerNumber);
                continue;
            }
            if (customerNumber >= 18) {
                System.out.println("Nie chcę już więcej klientów! Na dziś to już koniec!");
                break;
            }
            System.out.println("Obsłużono klienta nr: " + customerNumber);
        }
        System.out.println("=====================");
    }

    private static void whileAndDoWhile() {
        int retry = 3;
        while (retry > 0) {
            System.out.println("Ponawiam próbę wysyłki maila!");
            retry--;
        }

        do {
            System.out.println("hello");
        } while (false);

        int numberOfCusotmer = 5;
        do {
            System.out.println("hello customer number: " + numberOfCusotmer);
            numberOfCusotmer--;
        } while (numberOfCusotmer > 0);
        System.out.println("=====================");
    }

    private static void forAndArray() {
        System.out.println("Tablica i pętla for");

        String[] names = {"Jan", "Marcin", "Zosia"};

        for (int index = 0; index < names.length; index++) {
            System.out.println("Cześć: " + names[index] + " fajnie że jesteś!");
        }

        System.out.println("=====================");
    }

    private static void forLoopExplained() {
        System.out.println("Pętla for");
        for (int i = 0; i <= 7; i++) {
            System.out.println("Cześć!");
        }

        Long x = 10L;
        for (; x <= 12; x++) {
            System.out.println("Przykład 2");
        }

        // nieskończona pętla
//        for (; true; ) {
//            System.out.println("Przykład 3");
//        }

        // nieużywana pętla
//        for (; false; ) {
//            System.out.println("Przykład 3");
//        }

        Double y;
        for (y = 4.0; y > 0; y--) {
            System.out.println("Przykład 4");
        }

        System.out.println("=====================");
    }
}
