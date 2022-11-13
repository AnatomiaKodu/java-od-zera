package lekcja14.wyjatki;

class Ship {

    Boolean alive = true;

    void status(){
        if(alive) {
            System.out.println("Owca: Jestem cała! :D ");
        } else {
            System.out.println("Owca: Nie jestem cała :.(");
        }
    }

}
