package lekcja13.dziedziczenie;

class InheritanceLesson {

    /**
     *  @formatter:off
     *
     * Dziedziczenie:
     *  - extends - dziecko i rodzic
     *      Animal -> Mammal -> Dog
     *  - hierarchia klas
     *  - typ referencji
     *  - nadpisywanie metod
     *  - final - klasy i metody
     *  - getClass i instanceOf
     *  - rzutowanie
     *
     *  @formatter:on
     */
    public static void main(String[] args) {
        inheritance();
        methodOverriding();
        typeCasting();
    }

    private static void typeCasting() {
        System.out.println("Rzutowanie");

        Animal bird = new Bird();
        Animal dog = new Dog();
        Animal fish = new Fish();
        Animal hamster = new Hamster();

//        System.out.println(bird.fly());
        System.out.println(dog.getClass());
        System.out.println(fish.getClass());
        System.out.println(bird.getClass());
        if (bird instanceof Bird) {
            Bird birdReference = (Bird) bird;
            birdReference.fly();
        }

//        method(bird);
//        Horse horse = (Horse) dog;
        System.out.println("=====================");
    }

    private static void method(Animal animal) {
        System.out.println(animal.getClass());
        Horse horse = (Horse) animal;
    }

    private static void methodOverriding() {
        System.out.println("Nadpisywanie metod");
        Fish fish1 = new Fish();
        fish1.eat();
        fish1.sleep();
        System.out.println("=====================");

    }

    private static void inheritance() {
        System.out.println("Dziedziczenie");
        Object dog1 = new Dog();
        Animal dog2 = new Dog();
        Mammal dog3 = new Dog();
        Dog dog4 = new Dog();

        dog1.toString();
        dog2.eat();
        dog2.sleep();
        dog3.gaveBirth();

        dog4.bark();
        dog4.gaveBirth();
        dog4.eat();
        dog4.sleep();
        dog4.equals("");

        System.out.println("=====================");
    }

}
