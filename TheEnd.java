import java.util.Scanner;

public class TheEnd {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean front = scanner.nextBoolean();

        // Call the theEnd method and print the result
        System.out.println("Result: " + theEnd(inputString, front));

        // Close the Scanner
        scanner.close();
    }

    public static String theEnd(String str, boolean front) {
        // Check if front is true, then return the first character
        // Otherwise, return the last character
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }
}
