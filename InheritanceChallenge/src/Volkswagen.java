public class Volkswagen extends Car {
    private String model;

    public Volkswagen(String color, double engine, String dieselPetrol, String model) {
        super("Volkswagen", 600, 230, 120, color, engine, dieselPetrol);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
