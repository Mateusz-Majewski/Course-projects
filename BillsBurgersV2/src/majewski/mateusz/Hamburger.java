package majewski.mateusz;

public class Hamburger {
    private String name;
    private String meat;
    private String bun;
    private double price;
    private int amountOfAdditions;

    public Hamburger(String name, String meat, String bun, double price) {
        this.name = name;
        this.meat = meat;
        this.bun = bun;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBun() {
        return bun;
    }

    public int getAmountOfAdditions() {
        return amountOfAdditions;
    }

    public void showPrice() {
        System.out.println(getName() + " burger on a " + getBun() + " bun with " +
                getMeat() + " meat with " + getAmountOfAdditions() + " additions costs a total of " +
                getPrice());
    }

    public void addLettuce(int amount, double price) {
        int additionsCheck = amountOfAdditions + amount;

        if (!maxAdditions(additionsCheck)) {
            amountOfAdditions += amount;
            this.price += amount * price;
        }
    }

    public void addTomato(int amount, double price) {
        int additionsCheck = amountOfAdditions + amount;

        if (!maxAdditions(additionsCheck)) {
            amountOfAdditions += amount;
            this.price += amount * price;
        }
    }

    public void addOnion(int amount, double price) {
        int additionsCheck = amountOfAdditions + amount;

        if (!maxAdditions(additionsCheck)) {
            amountOfAdditions += amount;
            this.price += amount * price;
        }
    }

    public void addCheese(int amount, double price) {
        int additionsCheck = amountOfAdditions + amount;

        if (!maxAdditions(additionsCheck)) {
            amountOfAdditions += amount;
            this.price += amount * price;
        }
    }

    public boolean maxAdditions(int additions) {
        if (additions > 4) {
            System.out.println("The amount of additions for normal hamburger cannot exceed 4.");
            return true;
        } else {
            return false;
        }
    }
}
