

public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea()); // 20

        Square sqr1 = new Square(5);
        sqr1.setWidth(width);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + sqr1.getWidth());
        System.out.println("Area = " + sqr1.getArea()); // 16
        sqr1.setHeight(height);        
        System.out.println("Height = " + sqr1.getHeight());
        System.out.println("Area = " + sqr1.getArea()); // 25


    }
}
