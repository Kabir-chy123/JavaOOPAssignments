
package assignment3_1;

public class ShapeCalculator {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 8.0);

        System.out.println("Shape Calculator");

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape
                    + ": " + shape.calculateArea());
        }
    }
}


