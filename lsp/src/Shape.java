
public abstract class Shape {

    private int width;
    private int height;

    public Shape() {
    }

    Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Abstract methods
    public abstract int getArea();

}
