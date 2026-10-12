package lab_sheet_6.Q11;

import java.util.Scanner;

class NumberAnalyzer {
    private double[] numbers;
    private double average;

    NumberAnalyzer(double[] numbers) {
        this.numbers = numbers;
    }

    void displayAverageAndAboveCount() {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        this.average = sum / numbers.length;
        int aboveAverageCount = 0;
        for (double number : numbers) {
            if (number > this.average) {
                aboveAverageCount++;
            }
        }

        System.out.println("Average: " + this.average);
        System.out.println("Numbers above average: " + aboveAverageCount);
    }
}

public class AverageAnalyzerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }

        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        analyzer.displayAverageAndAboveCount();
    }
}