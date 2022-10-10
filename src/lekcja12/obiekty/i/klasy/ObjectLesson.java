package lekcja12.obiekty.i.klasy;

class ObjectLesson {

    /**
     *  @formatter:off
     *
     * Obiekty i Klasy:
     *  - Czym jest OOP?
     *  - Słowo kluczowe new
     *  - metody i pola klasy
     *  - Czym jest klasa, a czym instacja klasy?
     *  - Jak stworzyć obiekt?
     *  - Czym jest klasa Object?
     *  - getClass i instanceOf
     *  - konstruktory: domyślny i customowy (parametry)
     *  - Słowo kluczowe this
     *
     *  @formatter:on
     */
    public static void main(String[] args) {
        objectAndClass();
        objectClass();
        instanceofAndGetClass();
        constructors();
    }

    private static void constructors() {
        System.out.println("Konstruktory");
        Car peugeot = new Car();

//        peugeot.productionDate = "02.02.2022";
//        peugeot.mark = "Peugeot";
//        peugeot.course = 0;

        System.out.println(peugeot.mark);
        System.out.println(peugeot.model);
        System.out.println(peugeot.productionDate);
        System.out.println(peugeot.course);

        System.out.println();

        Car peugeot206 = new Car("206");

        System.out.println(peugeot206.mark);
        System.out.println(peugeot206.model);
        System.out.println(peugeot206.productionDate);
        System.out.println(peugeot206.course);

        System.out.println("======================");
    }

    private static void instanceofAndGetClass() {
        System.out.println("Instanceof oraz getClass");

        Object headOfHuman = new Head();

        System.out.println(headOfHuman.getClass());

        System.out.println(headOfHuman instanceof Head);
        System.out.println(headOfHuman instanceof String);
        System.out.println(headOfHuman instanceof Boolean);
        System.out.println(headOfHuman instanceof Leg);
        System.out.println(headOfHuman instanceof Dog);

        System.out.println("======================");
    }

    private static void objectClass() {
        System.out.println("klasa Object");

        String text = "";
        Boolean bool = true;
        boolean primitiveBool = false;
        int amount = 8;
        Dog dog = new Dog();

        text.equals("");
        text.compareTo("");
        text.toString();

        bool.toString();
        bool.compareTo(true);
        bool.equals(true);

        dog.toString();
        dog.hashCode();
//        dog.notify();
//        dog.notifyAll();
//        dog.wait();
//        dog.compareTo(null);
        dog.equals(true);

//        primitiveBool.toString();
//        primitiveBool.compareTo(true);
//        primitiveBool.equals(true);

        System.out.println("======================");
    }

    private static void objectAndClass() {
        System.out.println("Klasa i obiekt");

        Dog pluto = new Dog();
        Dog reksiu = new Dog();
        Dog lessi = new Dog();

        pluto.name = "Pluto";
        pluto.numberOfLegs = 4;
        pluto.hasTail = true;

        System.out.println(pluto.name);
        System.out.println(pluto.numberOfLegs);
        System.out.println(pluto.hasTail);

        reksiu.name = "Reksiu";
        lessi.name = "Lessi";

        System.out.println(reksiu.name);
        System.out.println(lessi.name);

        lessi.eat();
        lessi.bark();

        reksiu.eat();
        reksiu.bark();

        System.out.println("======================");
    }

}
