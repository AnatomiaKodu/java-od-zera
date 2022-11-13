package lekcja14.wyjatki;

class Calculator {

    Integer sum(Integer x, Integer y) {
        validateArgument(x);
        validateArgument(y);
        return x + y;
    }

    private static void validateArgument(Integer number) {
        if (number == null) {
            throw new NullPointerException("I's my exception! And we should stop here!");
        }
    }

}
