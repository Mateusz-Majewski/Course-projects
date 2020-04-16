public class Car extends Vehicle {

    private double engine;
    private String dieselPetrol;

    public Car(String name, int weight, int length, int width, String color, double engine, String dieselPetrol) {
        super(name, 4, weight, length, width, color);
        this.engine = engine;
        this.dieselPetrol = dieselPetrol;
    }

    public void drive(int speed) {
        super.move(speed);
        System.out.println("The vehicle is driving.");
    }

    public void steer() {
        System.out.println("Steering the car.");
    }

    public void changeGear(boolean upOrDown) {
        if (upOrDown) {
            System.out.println("Changing the gear up");
        } else {
            System.out.println("Changing the gear down");
        }
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getDieselPetrol() {
        return dieselPetrol;
    }

    public void setDieselPetrol(String dieselPetrol) {
        this.dieselPetrol = dieselPetrol;
    }
}
