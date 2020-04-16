public class Door {
    private String color;
    private boolean isLockable;

    public Door(String color, boolean isLockable) {
        this.color = color;
        this.isLockable = isLockable;
    }

    public void open() {
        System.out.println("The door is now opening");
    }

    public void close() {
        System.out.println("The door is now closing");
    }

    public String getColor() {
        return color;
    }

    public boolean isLockable() {
        return isLockable;
    }
}
