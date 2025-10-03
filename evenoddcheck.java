// Program to check whether a number is even or odd
import java.util.Scanner;

public class evenoddcheck {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if number is divisible by 2
        if (num % 2 == 0) {
            // If remainder is 0, number is even
            System.out.println(num + " is an Even number.");
        } else {
            // Otherwise, number is odd
            System.out.println(num + " is an Odd number.");
        }

        // Close the scanner to avoid memory leak
        sc.close();
    }
}
