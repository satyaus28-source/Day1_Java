// Question 12: Write a Java program that reads three numbers and prints their average.

import java.util.Scanner;

public class Question12AverageOfThreeNumbers {
    public static void main(String[] args) { // Java starts running here.
        Scanner input = new Scanner(System.in); // Read from the keyboard.

        System.out.print("Input first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Input second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Input third number: ");
        double thirdNumber = input.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3; // Add, then divide by 3.
        System.out.println("Average is " + average);
    }
}
