package homework33126;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return (int)(2 * (width + height));
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
