package CalculatorExercise;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The first number is: ");
        double numberOne = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double numberTwo = scanner.nextDouble();

        Calculator calculator = new Calculator(numberOne, numberTwo);

        double sum = calculator.add();
        double Product = calculator.multi();

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + Product);
        System.out.println("Subtraction: " + calculator.sub());

        if (numberTwo != 0) {
            System.out.println("Division: " + calculator.divide());
        } else {
            System.out.println("Cannot divide by zero.");
        }

        Calculator newCalculator = new Calculator(Product, sum);

        System.out.println("\nNew Calculator object:");
        System.out.println("New Sum: " + newCalculator.add());
        System.out.println("New Product: " + newCalculator.multi());
        scanner.close();
    }
}
