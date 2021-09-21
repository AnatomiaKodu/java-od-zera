package pl.anatomiakodu.java.skladnia;

public class Lekcja4Matematyka {

    public static void main(String[] args) {

        // docs
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

        System.out.println("Wartosc max: " + Math.max(1, 10));
        System.out.println("Wartosc min: " + Math.min(1, 10));
        System.out.println("Pierwiastkowanie: " + Math.sqrt(9));
        System.out.println("Wartosc absolutna: " + Math.abs(-7));
        // przedział - od 0 do 1 włącznie
        System.out.println("Liczba losowa: " + Math.random());

        przykladUzycia();

        System.out.println("Zaokrąglij w górę: " + Math.ceil(3.14));
        System.out.println("Zaokrąglij w dół: " + Math.floor(7.94));
        System.out.println("Zaokrąglij: " + Math.round(2.345));
        System.out.println("Zaokrąglij: " + Math.round(0.645));

    }

    private static void przykladUzycia() {
        // Math.floor(Math.random()*(max-min+1)+min)
        // przedział - [210-230]
        Double liczbaLosowa = Math.floor(Math.random() * (230 - 210 + 1) + 210);
        System.out.println("===");
        System.out.println("przyklad uzycia");
        System.out.println(liczbaLosowa);
        System.out.println("===");
    }
}
