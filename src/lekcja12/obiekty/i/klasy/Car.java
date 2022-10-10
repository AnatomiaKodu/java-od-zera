package lekcja12.obiekty.i.klasy;

class Car {

    public Car() {
        mark = "Pegout";
        productionDate = "02.02.2022";
        course = 0;
    }

    public Car(String model) {
        mark = "Pegout";
        this.model = model;
        productionDate = "02.02.2022";
        course = 0;
    }

    String mark;
    String model;
    String productionDate;
    Integer course;

}
