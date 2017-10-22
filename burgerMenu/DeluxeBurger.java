package burgerMenu;

public class DeluxeBurger extends BasicHamburger {
    private String drinkType;
    private String  chipsType;
    public DeluxeBurger() {
        super(350, "white wheat roll", "steak au fromage");
        this.chipsType = "potato chips";
        this.drinkType = "coke";

    }

    public String getDrinkType() {
        return this.drinkType;
    }

    public String getChipsType() {
        return this.chipsType;
    }

    public double priceDeluxeBurger(){
        return super.getPrice();
    }
}
