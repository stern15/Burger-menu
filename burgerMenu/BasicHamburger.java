package burgerMenu;

public class BasicHamburger {
    private double price;
    private String breadRoll;
    private String meat;
    private String lettuce;
    private String carrot;
    private String tomato;
    private String mayonnaise;

    public BasicHamburger(double price, String breadRollType, String meatType) {
        this.price = price;
        this.breadRoll = breadRollType;
        this.meat = meatType;
    }

    public double getPrice() {
        return this.price;
    }

    public String getBreadRoll() {
        return this.breadRoll;
    }

    public String getMeat() {
        return this.meat;
    }

    public String getLettuce() {
        return this.lettuce;
    }


    public double addLettuce(){
        return this.price +=20.0;
    }
    public double addCarrot(){
        return this.price +=30.0;
    }
    public double addTomato(){
        return this.price +=50.0;
    }
    public double addMayonnaise(){
        return this.price +=10.0;
    }
}
