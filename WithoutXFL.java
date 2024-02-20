import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the withoutX method and print the result
        System.out.println("Result: " + withoutX(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static String withoutX(String str) {
        // Check if the string is not empty and the first character is 'x'
        if (!str.isEmpty() && str.charAt(0) == 'x') {
            // Remove the first character and return the substring
            return str.substring(1);
        }

        // Check if the string is not empty and the last character is 'x'
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
            // Remove the last character and return the substring
            return str.substring(0, str.length() - 1);
        }

        // If neither the first nor the last character is 'x', return the original string
        return str;
    }
}
