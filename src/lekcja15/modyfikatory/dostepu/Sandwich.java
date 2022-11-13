package lekcja15.modyfikatory.dostepu;

class Sandwich {
    private String typeOfCheese;
    private Boolean glutenFree;
    private Integer numberOfTomatoesSlices;

    public Sandwich(String typeOfCheese, Boolean glutenFree, Integer numberOfTomatoesSlices) {
        this.typeOfCheese = typeOfCheese;
        this.glutenFree = glutenFree;
        this.numberOfTomatoesSlices = numberOfTomatoesSlices;
    }

    public String getTypeOfCheese() {
        return typeOfCheese;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public Integer getNumberOfTomatoesSlices() {
        return numberOfTomatoesSlices;
    }
}
