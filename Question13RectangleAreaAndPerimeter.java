// Question 13: Write a Java program to print the area and perimeter of a rectangle.

public class Question13RectangleAreaAndPerimeter {
    public static void main(String[] args) { // Java starts running here.
        double width = 5.6;
        double height = 8.5;
        double area = width * height; // Multiply width by height.
        double perimeter = 2 * (width + height); // Add both sides and double the result.

        // %.2f displays two digits after the decimal point.
        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, perimeter);
    }
}
