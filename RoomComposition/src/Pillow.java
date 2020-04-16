public class Pillow {
    private int width;
    private int height;
    private String material;
    private String hardness;

    public Pillow(int width, int height, String material, String hardness) {
        this.width = width;
        this.height = height;
        this.material = material;
        this.hardness = hardness;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public String getHardness() {
        return hardness;
    }
}
