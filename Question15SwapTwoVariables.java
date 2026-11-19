// Question 15: Write a Java program to swap two variables.

public class Question15SwapTwoVariables {
    public static void main(String[] args) { // Java starts running here.
        int firstNumber = 10;
        int secondNumber = 20;

        System.out.println("Before: " + firstNumber + ", " + secondNumber);

        int temporary = firstNumber; // Save the original first number.
        firstNumber = secondNumber; // Copy the second number into the first.
        secondNumber = temporary; // Put the saved number into the second.

        System.out.println("After: " + firstNumber + ", " + secondNumber);
    }
}
