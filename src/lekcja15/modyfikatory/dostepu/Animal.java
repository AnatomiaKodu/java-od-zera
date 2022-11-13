package lekcja15.modyfikatory.dostepu;

class Animal {

    public String name = "Pluto";
    protected String nickname = "Plutix";
    String age = "7";
    private String ownerName = "Micky Mouse";

    void printOwnerName(){
        System.out.println(ownerName);
    }

}
