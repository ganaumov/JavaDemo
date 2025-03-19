package homework6_1;

// Текст

abstract class Figure {
    double x;
    double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double getArea();

    abstract double getPerimeter();
}