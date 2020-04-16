package majewski.mateusz;

public class HealthyHamburger extends Hamburger {
    private int cucumber;
    private double cucumberPrice;
    private int avocado;
    private double avocadoPrice;
    private String name;
    private double basePrice;
    private int maxAdditions;
    private int currentAdditions;

    public HealthyHamburger(String bread, String meat, int lettuce, int tomato, int cheese, int bacon, int cucumber, int avocado) {
        super(bread, meat, lettuce, tomato, cheese, bacon);
        this.cucumber = cucumber;
        this.cucumberPrice = 0.15;
        this.avocado = avocado;
        this.avocadoPrice = 0.40;
        this.name = "Bill's Deluxe Burger";
        this.basePrice = 18.00;
        this.maxAdditions = 6;
        this.currentAdditions = cucumber + avocado + lettuce + tomato + cheese + bacon;
        if ((currentAdditions) > maxAdditions) {
            System.out.println("You have entered too many additions");
        }
    }
}
