package lekcja3.operatory;

class Operators {


    /**
     * @formatter:off
     * Operatory:
     *  - Arithmetic operators
     *  - Assignment operators
     *  - Comparison operators
     *  - Logical operators
     * @formatter:on
     */
    public static void main(String[] args) {
        checkArithmeticalOperators();
        checkAssignmentOperators();
        checkComparisonOperators();
        checkLogicalOperators();
    }

    private static void checkLogicalOperators() {
        System.out.println("OPERATORY LOGICZNE");
        boolean x = true;
        boolean y = false;
        System.out.println("AND:");
        System.out.println(x && y);
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println("OR:");
        System.out.println(x || y);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println("NOT:");
        System.out.println(!true);
        System.out.println(x && !y);
        System.out.println((true && false) || true != false);
        // (false) || true != false
        // true != false
        // true
        System.out.println((true && false) || true);
        System.out.println("=================");
    }

    private static void checkComparisonOperators() {
        System.out.println("OPERATORY POROWNANIA");
        int x = 1;
        int y = 3;
        System.out.println("Porównanie:");
        System.out.println(x == y);
        System.out.println("Nierówne:");
        boolean x1 = x != y;
        System.out.println(x1);
        System.out.println("Większe niż:");
        System.out.println(x > y);
        System.out.println("Większe lub równy:");
        System.out.println(2 >= 2);
        System.out.println("Mniejsze niż:");
        System.out.println(x < y);
        System.out.println("Mniejsze lub równy:");
        System.out.println(2 <= 2);
        System.out.println("==============");
    }

    private static void checkAssignmentOperators() {
        System.out.println("OPERATORY PRZYPISANIA");
        int x = 5; // =
        int y = 8;
        y += 3; // += // y = y + 3;
        System.out.println("+=");
        System.out.println(y);
        System.out.println("-=");
        System.out.println(x -= 2); // x = x -2
        System.out.println(x);
        System.out.println("*=");
        int x1 = 10;
        System.out.println(x1 *= 3);
        System.out.println(x1);
        System.out.println("/=");
        int x2 = 20;
        System.out.println(x2 /= 10);
        System.out.println(x2);
        System.out.println("%=");
        int x3 = 27;
        System.out.println(x3 %= 10);
        System.out.println(x3);
        System.out.println("==============");
    }

    private static void checkArithmeticalOperators() {
        System.out.println("OPERATORY ARYTMETYCZNE");
        int x = 3;
        int y = 2;

        System.out.println("Dodawanie:");
        System.out.println(x + y);
        System.out.println("Odejmowanie:");
        System.out.println(x - y);
        System.out.println(y - x);
        System.out.println("Mnożenie");
        System.out.println(x * y);
        System.out.println("Dzielenie");
        System.out.println(16 / 4);
        System.out.println(16.0 / 5);
        System.out.println(16 / 5.0);
        System.out.println("Kolejność");
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println("Modulo - reszta z dzielenia");
        System.out.println(13 % 5);
        System.out.println("Increment");
        int z = 10;
        System.out.println(z); // 10
        System.out.println(++z); // 11  // z = z + 1;
        System.out.println(z); // 11
        System.out.println(z++); // 11
        System.out.println(z); // 12
        System.out.println("Decrement");
        int w = 20;
        System.out.println(w); // 20
        System.out.println(--w); // 19 // w = w - 1
        System.out.println(w); // 19
        System.out.println(w--); // 19
        System.out.println(w); // 18
        System.out.println("================================");
    }
}
