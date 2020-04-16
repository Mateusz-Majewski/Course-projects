public class Bed {
    private int width;
    private int length;
    private int height;
    private boolean isDouble;
    private Mattress mattress;

    public Bed(int width, int length, int height, boolean isDouble, Mattress mattress) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.isDouble = isDouble;
        this.mattress = mattress;
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

    public boolean isDouble() {
        return isDouble;
    }

    public Mattress getMattress() {
        return mattress;
    }
}
