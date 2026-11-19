// Question 10: Write a Java program to calculate and print the given formula.

public class Question10CalculateFormula {
    public static void main(String[] args) { // Java starts running here.
        double result = 4.0 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        System.out.println(result); // Using 1.0 keeps the fractional part when dividing.
    }
}
