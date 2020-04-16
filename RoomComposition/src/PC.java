public class PC {

    private String model;
    private String color;
    private int RAM;
    private int HDD;

    public PC(String model, String color, int RAM, int HDD) {
        this.model = model;
        this.color = color;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public void playMusic() {
        System.out.println("The music is now playing.");
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHDD() {
        return HDD;
    }
}
