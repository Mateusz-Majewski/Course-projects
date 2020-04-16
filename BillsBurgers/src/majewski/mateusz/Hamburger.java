package majewski.mateusz;

public class Hamburger {
    private String bread;
    private String meat;
    private int lettuce;
    private double lettucePrice;
    private int tomato;
    private double tomatoPrice;
    private int cheese;
    private double cheesePrice;
    private int bacon;
    private double baconPrice;
    private double basePrice;
    private String name;
    private int maxAdditions;
    private int currentAdditions;

    public Hamburger(String bread, String meat, int lettuce, int tomato, int cheese, int bacon) {
        this.bread = bread;
        this.meat = meat;
        this.lettuce = lettuce;
        this.lettucePrice = 0.20;
        this.tomato = tomato;
        this.tomatoPrice = 0.30;
        this.cheese = cheese;
        this.cheesePrice = 0.50;
        this.bacon = bacon;
        this.baconPrice = 1.00;
        this.basePrice = 12.00;
        this.name = "Bill's Burger";
        this.maxAdditions = 4;
        this.currentAdditions = lettuce + tomato + cheese + bacon;
        if ((currentAdditions) > maxAdditions) {
            System.out.println("You have entered too many additions");
        }
    }

    public void calculatePrice() {
        if (currentAdditions <= 4) {
            System.out.println("The total price for the burger is: " + (basePrice + lettuce * lettucePrice + tomato * tomatoPrice + cheese * cheesePrice + bacon * basePrice));
        } else {
            System.out.println("");
        }
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public int getTomato() {
        return tomato;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public int getCheese() {
        return cheese;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public int getBacon() {
        return bacon;
    }

    public double getBaconPrice() {
        return baconPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public int getMaxAdditions() {
        return maxAdditions;
    }

    public int getCurrentAdditions() {
        return currentAdditions;
    }
}
