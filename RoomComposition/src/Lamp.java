public class Lamp {
    private String color;
    private LightSwitch lightSwitch;

    public Lamp(String color, LightSwitch lightSwitch) {
        this.color = color;
        this.lightSwitch = lightSwitch;
    }

    public void isOn() {
        if (lightSwitch.isOn()) {
            System.out.println("The lamp is on.");
        } else {
            System.out.println("The lamp is off.");
        }
    }

    public String getColor() {
        return color;
    }

    public LightSwitch getLightSwitch() {
        return lightSwitch;
    }
}
