package homework33126;

class Triangle extends Shape {
    private double a, b, c;
    private boolean isRightTriangle;

    public Triangle(String color, double a, double b, double c) {
        super("Triangle", color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.isRightTriangle = checkRightTriangle();
    }

    private boolean checkRightTriangle() {
        return (a*a + b*b == c*c) ||
                (a*a + c*c == b*b) ||
                (b*b + c*c == a*a);
    }

    public boolean getIsRightTriangle(){
        return isRightTriangle;
    }

    @Override
    public int getPerimeter() {
        return (int)(a + b + c);
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
