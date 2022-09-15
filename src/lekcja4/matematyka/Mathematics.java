package lekcja4.matematyka;

import java.math.BigDecimal;

class Mathematics {


    /**
     * @formatter:off
     * Math:
     *  - PI, E - log naturalny
     *  - random,
     *  - max, min,
     *  - sqrt, pow
     *  - abs,
     *  - round, ceil, floor
     *  - log
     *  - NaN, Infinity
     *  - BigDecimal
     * Docs: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html
     * @formatter:on
     */
    public static void main(String[] args) {
        System.out.println("Stałe:");
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println("Liczba losowa:");
        double random = Math.random();
        System.out.println(random);
        int max = 8;
        int min = 2;
        System.out.println("Liczba losowa od 2 do 8:");
        Double randomFrom2To8 = getRandomFromMinToMax(max, min); // 8 - 2
        System.out.println(randomFrom2To8.intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println(getRandomFromMinToMax(max, min).intValue());
        System.out.println("max:");
        System.out.println(Math.max(2, 5));
        System.out.println(Math.max(45.232, 12.323));
        System.out.println("min:");
        System.out.println(Math.min(2, 5));
        System.out.println(Math.min(45.232, 12.323));
        System.out.println("Potęgowanie:");
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(3, 2));
        System.out.println("Pierwiastkowanie:");
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(45));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.sqrt(64));
        System.out.println("Wartość absolutna:");
        int x = -12;
        int a = 32;
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(a));
        System.out.println("Zaokrąglanie w górę:");
        System.out.println(Math.ceil(4.32332));
        System.out.println(Math.ceil(4.99999));
        System.out.println(Math.ceil(4.0001));
        System.out.println("Zaokrąglanie w dół:");
        System.out.println(Math.floor(4.32332));
        System.out.println(Math.floor(4.99999));
        System.out.println(Math.floor(4.0001));
        System.out.println("Zaokrąglanie:");
        System.out.println(Math.round(4.32332));
        System.out.println(Math.round(4.99999));
        System.out.println(Math.round(4.0001));
        System.out.println(Math.round(4.500));
        System.out.println(Math.round(4.499));
        System.out.println("Zaawansowane:");
        System.out.println(Math.log(12));
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(0)));
        System.out.println(Math.cos(Math.toRadians(30)));
        System.out.println("Wartość NaN i nieskończoności:");
        double infinityValue = 12.0 / 0;
        double nanValue = 0.0 / 0;
        System.out.println(infinityValue);
        System.out.println(nanValue); // NaN - Not a Number
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.isFinite(infinityValue));
        System.out.println(Double.isNaN(nanValue));
        System.out.println(Double.isInfinite(12.12));
        System.out.println("Bardzo duże liczby");
        BigDecimal bigNumber = new BigDecimal(22.0/7.0);
        System.out.println(bigNumber);
    }

    private static Double getRandomFromMinToMax(int max, int min) {
        return min + Math.random() * ((max - min) + 1);
    }
}
