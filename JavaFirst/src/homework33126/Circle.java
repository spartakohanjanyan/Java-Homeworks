package homework33126;

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public int getPerimeter() {
        return (int)(2 * Math.PI * radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
