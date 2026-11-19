// Question 11: Write a Java program to print the area and perimeter of a circle.

public class Question11CircleAreaAndPerimeter {
    public static void main(String[] args) { // Java starts running here.
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius; // Use 2 × pi × radius.
        double area = Math.PI * radius * radius; // Use pi × radius × radius.

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
