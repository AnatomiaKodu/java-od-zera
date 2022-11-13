package lekcja14.wyjatki;

class Wolf {

    void eatShip(Ship ship) {
        eat();
        killShip(ship);
        System.out.println("Wilk: ZJADŁEM OWCE!!!!");
    }

    private void killShip(Ship ship) {
        ship.alive = false;
    }

    private void eat() {
        System.out.println("Wilk: Jestem Syty!!!! Najadłem się!");
    }
}
