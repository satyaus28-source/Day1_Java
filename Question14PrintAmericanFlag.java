// Question 14: Write a Java program to print an American flag.

public class Question14PrintAmericanFlag {
    public static void main(String[] args) { // Java starts running here.
        String sixStars = "* * * * * * ==================================";
        String fiveStars = " * * * * *  ==================================";
        String stripe = "==============================================";

        for (int i = 1; i <= 4; i++) { // Print four pairs of star rows.
            System.out.println(sixStars);
            System.out.println(fiveStars);
        }

        System.out.println(sixStars); // Print the ninth star row.

        for (int i = 1; i <= 6; i++) { // Print six rows of stripes.
            System.out.println(stripe);
        }
    }
}
