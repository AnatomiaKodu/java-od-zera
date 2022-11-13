package lekcja15.modyfikatory.dostepu;

import lekcja15.modyfikatory.dostepu.package1.Mammal;
import lekcja15.modyfikatory.dostepu.package1.PublicClass;

class EncapsulationLesson {

    /**
     *  @formatter:off
     *
     * Enkapsulacja / Hermetyzacja:
     *  - modyfikatory klas - public / (default) package-scope
     *  - modyfikatory dostępów - hierarchia:
     *      o public
     *      o protected
     *      o (default) package-scope - pakiety
     *      o private
     *  - API - Application Programming Interface - z perspektywy kodu
     *      https://docs.oracle.com/en/java/javase/17/docs/api/
     *  - gettery i settery
     *  - Immutable Object - read only
     *  - przykład: Człowiek i żołądek
     *
     *  @formatter:on
     */
    public static void main(String[] args) {
        classModifiers();
        dontDoThat();
        privateExplained();
        packageScopeExplained();
        protectedExplained();
        publicExplained();
        gettersAndSetters();
        immutableObjectsExplained();
        eatHumanExample();
    }

    private static void eatHumanExample() {
        System.out.println("Nakarm Boba!");
        Human bob = new Human();
        Sandwich bobSandwich = new Sandwich("cheddar", false, 0);
//        bob.stomach.somethingToEat = bobSandwich;
//        bob.stomach.empty = false;
        bob.takeSandwitch(bobSandwich);
        bob.eat();
        System.out.println("===================");
    }

    private static void immutableObjectsExplained() {
        System.out.println("Immutable Objects");
        Sandwich mikeSandwich = new Sandwich("goat", true, 5);
        Sandwich bobSandwich = new Sandwich("cheddar", false, 0);
        System.out.println("===================");
    }

    private static void gettersAndSetters() {
        System.out.println("gettery i settery");
        Wallet myWallet = new Wallet();
//        myWallet.money = 5000000.0;
//        myWallet.money = 0.0;
        System.out.println(myWallet.getMoney("pass"));
//        myWallet.setMoney(0.0);
        System.out.println(myWallet.getMoney("pass"));
        System.out.println("===================");
    }

    private static void publicExplained() {
        System.out.println("public explained");
        Mammal dog = new Mammal();
        System.out.println(dog.name);
        System.out.println("===================");
    }

    private static void protectedExplained() {
        System.out.println("protected explained");
        Dog dog = new Dog();
        System.out.println(dog.name);
        dog.printNickname();
//        System.out.println(dog.age);
//        System.out.println(dog.ownerName);
        System.out.println("===================");
    }

    private static void packageScopeExplained() {
        System.out.println("package scope Explained");
        Mammal dog = new Mammal();
        System.out.println(dog.name);
//        System.out.println(dog.nickname);
//        System.out.println(dog.age);
//        System.out.println(dog.ownerName);
        System.out.println("===================");
    }

    private static void privateExplained() {
        System.out.println("private explained");
        Animal dog = new Animal();
        System.out.println(dog.name);
        System.out.println(dog.nickname);
        System.out.println(dog.age);
//        System.out.println(dog.ownerName);
        dog.printOwnerName();
        System.out.println("===================");
    }

    private static void dontDoThat() {
        // nie rób tego!
//        public String a;
//        private String a;
    }

    private static void classModifiers() {
        System.out.println("Modifikatory klas");
        new PublicClass();
        new PackageClass2();
        System.out.println("===================");
    }

}
