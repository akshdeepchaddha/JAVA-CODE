import java.util.Scanner;

public class positivenegativecheck{
    public static void main(String[] args) {
        
        // Scanner object with name 'in'
        Scanner in = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // Print entered number
        System.out.println("You entered: " + num);

        // Close scanner
        in.close();
    }
}
