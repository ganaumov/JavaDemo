package homework6_1;

class Triangle extends Figure {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double x, double y, double sideA, double sideB, double sideC) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
