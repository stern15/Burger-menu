package burgerMenu;

public class HealthyBurger extends BasicHamburger {
    private String gluten;
    private String salad;
    public HealthyBurger() {
        super(150, "brown rye bread roll", "no meat");
    }


    public double addGluten(){
        double priceAddGluten=super.getPrice()+90.0;
        return priceAddGluten;
    }
    public double addSalad(){
        double priceAddSalad =super.getPrice()+50.0;
        return priceAddSalad;
    }


}
