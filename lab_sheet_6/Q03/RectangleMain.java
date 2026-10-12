package lab_sheet_6.Q03;

import java.util.Scanner;

class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rectangle length and width: ");
        double length = input.nextDouble();
        double width = input.nextDouble();

        Shape rectangle = new Rectangle(length, width);
        System.out.println("Area: " + rectangle.getArea());
    }
}