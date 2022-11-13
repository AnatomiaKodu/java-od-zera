package lekcja14.wyjatki;

import java.io.IOException;

class ExceptionsLesson {

    /**
     *  @formatter:off
     *
     * Wyjątki:
     *  - czym są wyjątki? NullPointerException, ArithmeticException, ClassCastException
     *  - Wywoływanie wyjątków - throws RuntimeException
     *  - Hierarchia:
     *
     *    Throwable:
     *      * Errors
     *      * Exceptions:
     *          o Unchecked Exceptions - based on RuntimeException
     *              NullPointerException, ClassCastException, ArithmeticException, DateTimeException, ArrayStoreException
     *          o Checked Exceptions
     *              ClassNotFoundException, SocketException, SQLException, IOException, FileNotFoundException
     *
     *  - Error
     *  - Exception
     *  - Runtime Exceptions
     *  - Czym jest "Stack Trace"?
     *  - try-catch - charakterysyczne dla Java
     *  - throws w sygnaturze metody
     *  - finally
     *  - tworzenie własnego wyjątka
     *  - Przykład: Wilk syty i owca cała
     *  - krytyka: Checked Exception
     *
     * docs:
     *      https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/RuntimeException.html
     *      https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html
     *      https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Throwable.html
     *      https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Error.html
     *
     *  @formatter:on
     */
    public static void main(String[] args) {
        exceptionExamples();
        manuallyThrowException();
        stackTraceWithExample();
        checkedExceptionsExplained();
        throwsClauseExplained();
        finallyExplained();
        wolfAndShipHomework();
    }

    /**
     * ZADANIE DOMOWE:
     * Co zrobić by wilk był syty a owca cała?
     * Możesz edytować tylko 1 linię kodu,
     * ALE nie zmieniaj metody poniżej.
     */
    private static void wolfAndShipHomework() {
        System.out.println();
        System.out.println("Example - Wilk i owca:");
        Wolf wolf = new Wolf();
        Ship ship = new Ship();

        try {
            wolf.eatShip(ship);
        } catch (DoNotEatMyShipException e) {

        } finally {
            ship.status();
        }
        System.out.println("===================");
    }

    private static void finallyExplained() {
        System.out.println("Czym jest finally");
        System.out.println("--wywołanie 1");
        testTryCatchFinally(true);
        System.out.println("--wywołanie 2");
        testTryCatchFinally(false);
        System.out.println("===================");
    }

    private static void testTryCatchFinally(Boolean throwException) {
        try {
            // logika do wykonania
            System.out.println("logika 1");
            if (throwException) {
                throw new Exception();
            }
            System.out.println("logika 2");
        } catch (Exception e) {
            System.out.println("obsługa wyjątku");
            // obsługiwanie wyjątku
        } finally {
            // logika która ma się wykonać zawsze
            System.out.println("finally");
        }
    }

    private static void throwsClauseExplained() {
        System.out.println("Omówienie sygnatury throws");
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (IOException e) {
            System.out.println("Do nothing :p");
        }
        System.out.println("===================");
    }

    private static void checkedExceptionsExplained() {
        System.out.println("Użycie Checked Exception");
        getPassword("Piotr");
//        getPassword("Adam");
        System.out.println("===================");
    }

    private static void getPassword(String username) {
        try {
            if (username.equals("Adam")) {
                throw new Exception("Go away Adam! I don't like you!");
            }
            System.out.println("Cześć " + username + "! Tajne hasło: admin1");
        } catch (Exception e) {
            System.out.println("Hasło dla Adama to: kwiatuszki6545");
            System.out.print(e.getMessage());
        }
    }

    private static void stackTraceWithExample() {
        System.out.println("Stack Trace - przykład kalkulator");
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
//        System.out.println(calculator.sum(null,2));
//        System.out.println(calculator.sum(1,null));
        System.out.println("===================");
    }

    private static void manuallyThrowException() {
        System.out.println("Ręczne wywoływanie wyjątków");
//        throw new NullPointerException("This is not a number! This value is null!");
//        throw new Throwable();
//        throw new Error();
//        throw new Exception();
//        throw new SQLException();
//        throw new IOException();
        System.out.println("===================");
    }

    private static void exceptionExamples() {
        System.out.println("Przykłady Exceptionów:");
//        // NullPointerException
//        String text = null;
//        text.toString();

        // ArithmeticException
        // System.out.println(12/0);

        // ClassCastException
//        Object number = 123;
//        String text = (String) number;
        System.out.println("===================");
    }

}
