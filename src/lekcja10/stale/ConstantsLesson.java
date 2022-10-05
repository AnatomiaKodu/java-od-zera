package lekcja10.stale;

class ConstantsLesson {

    public static final int SATURDAY = 6;
    public static final int INVITATION_PERIOD = 3 * 7;
    public static final String WELCOME_MESSAGE = "Siema ";
    public static final int WINTER_HOLIDAYS = 3 * 7 * 4 - 2;
    public static final int PRICE_FOR_PLASTIC_MATERIAL = 17;
    public static final int PRICE_FOR_WOOD_MATERIAL = 57;
    public static final int AMOUNT_IN_BOX = 6;
    static String loadingInformation = "Loading...";
    static Double pi = 3.14;

    static final Double PI_NUMBER = 3.14;

    public static final String LOADING_MESSAGE = "Loading...";

    final int CONSTANT_CLASS_SCOPE = 0;
    static final int CONSTANT_CLASS_SCOPE_1 = 1;


    /**
     *  @formatter:off
     *
     * Stałe:
     *  - public static final - scope w różnych metodach
     *  - UPPER_CASE
     *  - final i błędy kompilacji
     *  - final:
     *      * zmienne: typy prymitywne, pole klasy, referencja w metodzie, argument metody
     *      * metody
     *      * klasa
     *  - clean code - pisanie "z palca" - łączenie zmiennych i stałych
     *
     *  @formatter:on
     */
    public static void main(String[] args) {

        howAndWhyUseConstants();
        finalVariables();

        System.out.println("Constant w clean code");

        displayText("Lubię placki", SATURDAY);
        displayText(WELCOME_MESSAGE + "Wojtek!", INVITATION_PERIOD);
        displayText(WELCOME_MESSAGE + "Monika!", INVITATION_PERIOD);
        displayText(WELCOME_MESSAGE + "Krystian!", INVITATION_PERIOD);
        displayText("Lubię placki. " + "Cześć Wojtek!", INVITATION_PERIOD);
        displayText("Lubię placki. " + "Tylko przez kilka miesięcy", WINTER_HOLIDAYS);

        int radius = 5;

        System.out.println("Oblicz cena pudełka pełnego plastikowych kół");
        System.out.println(Math.pow(radius, 2) * PI_NUMBER * PRICE_FOR_PLASTIC_MATERIAL * AMOUNT_IN_BOX);
        System.out.println(Math.pow(radius, 2) * PI_NUMBER * PRICE_FOR_WOOD_MATERIAL * AMOUNT_IN_BOX);


    }

    static void displayText(String text, Integer day) {
        // very complicated logic
    }

    final void runAlgorithm() {
        // very complicated algorithm
    }

    private static void finalVariables() {
        System.out.println("Omówienie final");
        final int x;
        x = 12;
//        x = 13;

        final Double y = 12.122;
//        y = 12.1113;

        sumNumbers(1, 2);

        System.out.println("================");
    }

    static void sumNumbers(final Integer x, final Integer y) {
        System.out.println("Result:");
        // linia kodu
        // linia kodu
        // linia kodu
        // linia kodu
        // linia kodu
        // linia kodu
        // linia kodu
        // linia kodu
//        x = 15;
        // linia kodu
        // linia kodu
        // linia kodu
        // linia kodu
        // linia kodu
        // linia kodu
        System.out.println(x + y);
    }

    private static void howAndWhyUseConstants() {
        System.out.println("Jak i dlaczego korzystać ze stałych");
        String variable = "test";

//        System.out.println(loadingInformation);
//        System.out.println(loadingInformation);
//        System.out.println(loadingInformation);

        getInput();
        processData();
        sendData();

        System.out.println("================");
    }

    static void getInput() {
        System.out.println("in method: getInput");
        System.out.println(loadingInformation);
    }

    static void processData() {
        loadingInformation = "ładuj dane!";
        String loadingInfo = "Loading Data for Processing...";

        System.out.println("in method: processData");
        System.out.println(loadingInfo);
        System.out.println(loadingInformation);
//        System.out.println("Loading...");
    }

    static void processData2() {
        pi = 3.3333;
    }

    static void processData1() {
        loadingInformation = "ładuj dane!";
        String loadingInfo = "Loading Data for Processing...";

        Double result = pi * 10;
    }

    static void sendData() {
        System.out.println("in method: sendData");
        System.out.println(loadingInformation);
    }

}
