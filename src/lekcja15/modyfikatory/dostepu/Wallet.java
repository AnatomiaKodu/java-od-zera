package lekcja15.modyfikatory.dostepu;

class Wallet {

    private Double money = 1000.0;

    public Double getMoney(String password) {
        if(password.equals("pass")){
            return money;
        }
        throw new RuntimeException("No access to money!");
    }

//    public void setMoney(Double money) {
//        this.money = money;
//    }

}
