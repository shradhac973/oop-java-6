package lab_sheet_6.Q07;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSide)
                * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
    }

    @Override
    double calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}

public class ShapeCalculationMain {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(3, 4, 5);
        System.out.printf("Circle area: %.2f, perimeter: %.2f%n",
                circle.calculateArea(), circle.calculatePerimeter());
        System.out.printf("Triangle area: %.2f, perimeter: %.2f%n",
                triangle.calculateArea(), triangle.calculatePerimeter());
    }
}