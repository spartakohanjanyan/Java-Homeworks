package homework33126;

public class Main {
    public static void main(String[] args) {

        Square square = new Square("green", 5);
        Rectangle rectangle = new Rectangle("blue", 4, 6);
        Circle circle = new Circle("red", 3);
        Triangle triangle = new Triangle("yellow", 3, 4, 5);

        Shape[] shapes = {square, rectangle, circle, triangle};

        int maxPerimeter = Integer.MIN_VALUE;
        Shape maxShape = null;

        for (Shape s : shapes) {
            int p = s.getPerimeter();

            if (p > maxPerimeter) {
                maxPerimeter = p;
                maxShape = s;
            }
        }

        System.out.println(triangle.getIsRightTriangle());

        System.out.println("Max perimeter: " + maxPerimeter);
        System.out.println("Shape: " + maxShape.getName());
    }
}
