public class Room {
    private int width;
    private int length;
    private int height;
    private String color;
    private Door door;
    private Desk desk;
    private PC pc;
    private Bed bed;
    private Pillow pillow;
    private Mattress mattress;
    private Lamp lamp;
    private LightSwitch lightSwitch;

    public Room(int width, int length, int height, String color, Door door, Desk desk, PC pc, Bed bed, Pillow pillow, Mattress mattress, Lamp lamp, LightSwitch lightSwitch) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.door = door;
        this.desk = desk;
        this.pc = pc;
        this.bed = bed;
        this.pillow = pillow;
        this.mattress = mattress;
        this.lamp = lamp;
        this.lightSwitch = lightSwitch;
    }

    public void turnTheLightOn() {
        lightSwitch.turnOn();
        lamp.isOn();
    }

    public void turnTheLightOff() {
        lightSwitch.turnOff();
        lamp.isOn();
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public Door getDoor() {
        return door;
    }

    public Desk getDesk() {
        return desk;
    }

    public PC getPc() {
        return pc;
    }

    public Bed getBed() {
        return bed;
    }

    public Pillow getPillow() {
        return pillow;
    }

    public Mattress getMattress() {
        return mattress;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public LightSwitch getLightSwitch() {
        return lightSwitch;
    }
}
