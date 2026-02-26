package homework22726;

public class RectangleClass {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle1:");
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());

        Rectangle r2 = new Rectangle(8, 3);
        System.out.println("Rectangle2:");
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());


    }
}

class Rectangle {

    int length;
    int width;

     Rectangle() {

    }

     Rectangle(int length1, int width1) {
        length = length1;
        width = width1;
    }

     int area() {
        return length * width;
    }

     int perimeter() {
        return 2 * (length + width);
    }
}