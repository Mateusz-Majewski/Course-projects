package majewski.mateusz;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private int speed;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
        this.speed = 0;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> Starting engine";
    }

    public String accelerate() {
        return "Car -> Accelerating";
    }

    public String brake() {
        return "Car -> Braking";
    }
}

class Polo extends Car {
    public Polo(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Polo -> Starting engine";
    }

    @Override
    public String accelerate() {
        return "Polo -> Accelerating";
    }

    @Override
    public String brake() {
        return "Polo -> Braking";
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(3, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Polo polo = new Polo(4, "Polo");
        System.out.println(polo.startEngine());
    }
}
