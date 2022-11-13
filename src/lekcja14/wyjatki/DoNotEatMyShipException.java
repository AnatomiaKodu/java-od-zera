package lekcja14.wyjatki;

class DoNotEatMyShipException extends RuntimeException {

    public DoNotEatMyShipException() {
    }

    public DoNotEatMyShipException(String message) {
        super(message);
    }
}
