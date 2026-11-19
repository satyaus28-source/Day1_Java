// Question 5: Write a Java program that reads two numbers and prints their product.

import java.util.Scanner;

public class Question5MultiplyTwoNumbers {
    public static void main(String[] args) { // Java starts running here.
        Scanner input = new Scanner(System.in); // Read from the keyboard.

        System.out.print("Input first number: ");
        int firstNumber = input.nextInt(); // Read the first number.

        System.out.print("Input second number: ");
        int secondNumber = input.nextInt(); // Read the second number.

        int product = firstNumber * secondNumber; // Multiply the numbers.
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);
    }
}
