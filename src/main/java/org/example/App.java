package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of the two values is: " + calculator.calculateSumOfTwoIntegerValues(4, 5));

        System.out.println("Subtraction of two values is: " + calculator.calculateSubtractionOfTwoIntegerValues(3, 2));
    }


}

