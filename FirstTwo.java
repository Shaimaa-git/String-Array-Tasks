import java.util.Scanner;

public class FirstTwo {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the firstTwo method and print the result
        System.out.println("Result: " + firstTwo(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static String firstTwo(String str) {
        // Check if the length of the string is at least 2
        if (str.length() >= 2) {
            // Return the string made of its first two characters
            return str.substring(0, 2);
        }

        // If the length is less than 2 or the string is empty, return the original string
        return str;
    }
}
