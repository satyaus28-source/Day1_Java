// Question 7: Write a Java program to print a number's multiplication table up to 10.

import java.util.Scanner;

public class Question7MultiplicationTable {
    public static void main(String[] args) { // Java starts running here.
        Scanner input = new Scanner(System.in); // Read from the keyboard.

        System.out.print("Input a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) { // Count from 1 through 10.
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
