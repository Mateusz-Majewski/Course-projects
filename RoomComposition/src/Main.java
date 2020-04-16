public class Main {
    public static void main(String[] args) {
        Desk desk = new Desk("Venge", 60, 60, 200);
        Door door = new Door("Venge", true);
        LightSwitch lightSwitch = new LightSwitch(false);
        Lamp lamp = new Lamp("cold", lightSwitch);
        Mattress mattress = new Mattress(140, 200, 30, "Foam");
        Bed bed = new Bed(140, 200, 40, true, mattress);
        PC pc = new PC("Asus", "Silver", 16, 580);
        Pillow pillow = new Pillow(60, 20, "Foam", "Soft");

        Room room = new Room(400, 400, 200, "Green", door, desk, pc, bed, pillow, mattress, lamp, lightSwitch);

        room.turnTheLightOn();
        room.turnTheLightOff();
        System.out.println("");
        room.getLamp().isOn();
    }
}
