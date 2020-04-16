package majewski.mateusz;

public class HealthyHamburger extends Hamburger {
    public HealthyHamburger(String meat, double price) {
        super("Healthy", meat, "rye", price);
    }

    public boolean maxAdditions(int additions) {
        if (additions > 6) {
            System.out.println("The amount of additions for normal hamburger cannot exceed 6.");
            return true;
        }
        return false;
    }
}
