package homework6_1;

// Текст

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Triangle(0, 0, 3, 2, 5);
        figures[1] = new Rectangle(1, 1, 5, 11);
        figures[2] = new Circle(2, 2, 4);
        figures[3] = new Triangle(3, 3, 6, 8, 9);
        figures[4] = new Rectangle(4, 4, 7, 12);

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            totalPerimeter += figure.getPerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}

