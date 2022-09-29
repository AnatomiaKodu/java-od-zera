package lekcja8.warunki.logiczne;

class ConditionsLesson {

    /**
     *  @formatter:off
     *
     *  Warunki logiczne:
     *  - if
     *  - else
     *  - else if
     *  - Nested if statement
     *  - switch - break and default
     *  - switch - strings, numbers, enums
     *  - Ternary Operator - variable = (condition) ? expressionTrue :  expressionFalse;
     *
     *  @formatter:on
     */
    public static void main(String[] args) {

        ifExplained();
        ifElseExplained();
        multipleConditions();
        nestedIf();
        switchCaseExplained();
        switchOnRestaurantExample();
        switchTypes();
        ternaryOperator();

    }

    private static void ternaryOperator() {
        System.out.println("Warunek skrótowy");

        int score1 = 50;
        int score2 = 27;
        String result1 = score1 > 40 ? "pass" : "fail";
        String result2 = score2 > 40 ? "pass" : "fail";

        System.out.println("wynik 1 - " + result1);
        System.out.println("wynik 2 - " + result2);

        System.out.println("=====================");
    }

    private static void switchTypes() {
        System.out.println("switch na string, number i enum");
        switch (""){
            case "":
        }

        switch (1){
            case 1:
        }

        Order myOrder = Order.CHEAP;

        switch (myOrder){
            case CHEAP:
            case STANDARD:
            case EXPENSIVE:
        }
        System.out.println("=====================");
    }

    private static void switchOnRestaurantExample() {
        System.out.println("-=Restaurant=-");
        int expensiveDinner = 1;
        orderDiner(expensiveDinner);
        int dinner = 2;
        orderDiner(dinner);
        int cheapDinner = 3;
        orderDiner(cheapDinner);
    }

    private static void orderDiner(int order) {
        System.out.println("****");
        System.out.println("Twoje zamówienie:");
        System.out.println("Wybrano opcje nr: " + order);
        switch (order) {
            case 1:
                System.out.println(" - wybrano schabowy");
            case 2:
                System.out.println(" - wybrano ziemniaki");
            case 3:
                System.out.println(" - wybrano sałatkę");
        }
        System.out.println("****");
    }

    private static void switchCaseExplained() {
        System.out.println("Omówienie swich - case");
        gameShow(3);
        gameShow(2);
        gameShow(1);
        gameShow(12);
        gameShow(-2);
        gameShow(7);
        System.out.println("=====================");
    }

    private static void gameShow(Integer decision) {
        switch (decision) {
            case 1:
                System.out.println("Wygrałeś lot balonem!");
                break;
            case 2:
                System.out.println("Wygrałeś kota w butach");
                break;
            case 3:
                System.out.println("Wygrałeś dziurkacz!");
                break;
            default:
                System.out.println("Błąd podano złą liczbę - wybierz z zakresu 1-3");
        }
    }

    private static void nestedIf() {
        System.out.println("Zagnieżdżanie warunków logicznych");

        boolean isVegetarian = false;
        boolean likesPotatoes = false;

        if (isVegetarian) {
            if (likesPotatoes) {
                System.out.println("Ziemniaki z masłem");
            } else {
                System.out.println("Ryż z owocami");
            }
        } else {
            System.out.println("stek wołowy");
        }
        System.out.println("=====================");
    }

    private static void multipleConditions() {
        System.out.println("Wiele warunków logicznych");

        greetPerson("mama");
        greetPerson("tata");
        greetPerson("córka");
        greetPerson("syn");
        greetPerson("pies");
        greetPerson("kot");

        System.out.println("=====================");
    }

    private static void greetPerson(String osoba) {
        if ("tata".equals(osoba)) {
            System.out.println("Dzień dobry tato!");
        } else if ("mama".equals(osoba)) {
            System.out.println("Cześć mamo!");
        } else if ("syn".equals(osoba)) {
            System.out.println("Siema synek!");
        } else if ("córka".equals(osoba)) {
            System.out.println("Serwus córeczko!!");
        } else {
            System.out.println("Witaj nieznajomy");
        }
    }

    private static void ifElseExplained() {
        System.out.println("Czym jest if-else?");

        int age = 1;
        buyDrink(12);
        buyDrink(23);
        System.out.println("=====================");
    }

    static void buyDrink(int age) {
        if (age > 18) {
            System.out.println("kup piwo");
        } else {
            System.out.println("Kup kakao");
        }
    }

    private static void ifExplained() {
        System.out.println("Czym jest if?");
        boolean conditional = true;
        if (conditional) {
            logic(conditional);
        }

        boolean conditionalWithFalse = false;
        if (conditionalWithFalse) {
            logic2(conditional);
        }
        System.out.println("================");
    }

    private static void logic2(boolean conditional) {
        System.out.println("Warunek 2 został spełniony!! Wartość: " + conditional);
    }

    private static void logic(boolean conditional) {
        System.out.println("Warunek 1 został spełniony!! Wartość: " + conditional);
    }
}

enum Order {
    EXPENSIVE, STANDARD, CHEAP
}