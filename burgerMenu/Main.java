package burgerMenu;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        BasicHamburger basicHamburgerObj = new BasicHamburger(100.0, "normal bread", "normal steak");

        System.out.println("Burger List");
        System.out.println();
        System.out.println("1. Basic Burger --> Ksh100.0 without addition\n2. Healthy Burger --> Ksh150 without addition\n3. Deluxe Burger --> Ksh350 with addition(coke and fries)");
        System.out.println();
        System.out.println("Please select which Buger you want:\n");
        Scanner sc = new Scanner(System.in);
        int scInputBurg = sc.nextInt();

        switch (scInputBurg) {
            case 1:
                System.out.println("You have purchased a basic Burger with " + basicHamburgerObj.getBreadRoll() + " and " + basicHamburgerObj.getMeat() + " at " + basicHamburgerObj.getPrice() + " Ksh");
                System.out.println();
                System.out.println("List of all addition");
                System.out.println();
                System.out.println("1. lettuce --> Ksh20.0 each\n2. carrot --> Ksh30 each\n3. tomato --> Ksh50 each\n4. Mayonnaise --> Ksh 10 each");
                System.out.println();
                System.out.println("Please enter addition of your choice:\n");
                int scInputAddBas = sc.nextInt();

                switch (scInputAddBas) {
                    case 1:
                        basicHamburgerObj.addLettuce();
                        break;
                    case 2:
                        basicHamburgerObj.addCarrot();
                        break;
                    case 3:
                        basicHamburgerObj.addTomato();
                        break;
                    case 4:
                        basicHamburgerObj.addMayonnaise();
                        break;
                    default:
                        System.out.println("Please enter the value between 1 and 4");
                        break;
                }

                System.out.println();
                System.out.println("your final price is " + basicHamburgerObj.getPrice()+"\n\tBON APPETIT :)");
                break;

            case 2:
                HealthyBurger healthyBurgerObj = new HealthyBurger();
                System.out.println();
                System.out.println("You have purchased a healthy Burger with " + healthyBurgerObj.getBreadRoll() + " and " + healthyBurgerObj.getMeat() + " at " + healthyBurgerObj.getPrice() + " Ksh");
                System.out.println();
                System.out.println("List of all addition");
                System.out.println();
                System.out.println("1. Gluten --> Ksh90.0 each\n2. Salad --> Ksh50 each");
                System.out.println();
                System.out.println("Please enter addition of your choice:\n");
                int scInputAddHeal = sc.nextInt();

                switch (scInputAddHeal) {
                    case 1:
                        System.out.println();
                        System.out.println("your final price is " + healthyBurgerObj.addGluten()+" Ksh"+"\n\tBON APPETIT :)");
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("your final price is " + healthyBurgerObj.addSalad()+" Ksh"+"\n\tBON APPETIT :)");
                        break;
                    default:
                        System.out.println("Please enter the value between 1 and 4");
                        break;
                }
                break;
            case 3:
                DeluxeBurger deluxeBurgerObj = new DeluxeBurger();
                System.out.println();
                System.out.println("You have purchased a Deluxe Burger with " + deluxeBurgerObj.getBreadRoll() + " and " + deluxeBurgerObj.getMeat()+" with the addition of " +deluxeBurgerObj.getChipsType()+" and "+deluxeBurgerObj.getDrinkType()+ " at " + deluxeBurgerObj.getPrice() + " Ksh"+"\n\tBON APPETIT :)");
                break;
            default:
                System.out.println("Please select a value between 1 and 3");
                break;
        }
    }
}
