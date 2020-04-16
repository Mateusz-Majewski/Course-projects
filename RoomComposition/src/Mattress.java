public class Mattress {
    private int width;
    private int height;
    private int thickness;
    private String material;

    public Mattress(int width, int height, int thickness, String material) {
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getThickness() {
        return thickness;
    }

    public String getMaterial() {
        return material;
    }
}
