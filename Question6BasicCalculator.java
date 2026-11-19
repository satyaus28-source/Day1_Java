// Question 6: Write a Java program to print the sum, difference, product, quotient, and remainder.

import java.util.Scanner;

public class Question6BasicCalculator {
    public static void main(String[] args) { // Java starts running here.
        Scanner input = new Scanner(System.in); // Read from the keyboard.

        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));

        // Division and remainder require a nonzero second number.
        if (secondNumber != 0) {
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
            System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber));
        } else {
            System.out.println("Division and remainder are undefined when the second number is zero.");
        }
    }
}
