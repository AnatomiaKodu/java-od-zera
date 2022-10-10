package lekcja12.obiekty.i.klasy;

class Dog {

    String name;
    Integer numberOfLegs;
    Boolean hasTail;

    Head head;
    Leg frontLeftLeg;
    Leg frontRightLeg;
    Leg backLeftLeg;
    Leg backRightLeg;
    Tail tail;

    void eat(){
        System.out.println(name + ": Mlask, mlask");
    }

    void bark(){
        System.out.println(name + ": hau, hau!");
    }

}
