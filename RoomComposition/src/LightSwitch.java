public class LightSwitch {
    private boolean isOn;

    public LightSwitch(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("The switch is now in ON state.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The switch is now in OFF state.");
    }

    public boolean isOn() {
        return isOn;
    }
}
