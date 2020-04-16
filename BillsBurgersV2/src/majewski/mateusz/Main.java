package majewski.mateusz;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "medium rare", "basic", 10.20);
        hamburger.addLettuce(5, 0.2);
        hamburger.showPrice();

        HealthyHamburger healthyHamburger = new HealthyHamburger("rare", 23.00);
        healthyHamburger.addLettuce(6, 0.2);
        healthyHamburger.showPrice();
        healthyHamburger.addTomato(1, 0.5);
        healthyHamburger.showPrice();
    }
}
