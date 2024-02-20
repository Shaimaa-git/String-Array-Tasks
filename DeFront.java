import java.util.Scanner;

public class DeFront {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the deFront method and print the result
        System.out.println("Result: " + deFront(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static String deFront(String str) {
        // Check if the string is not empty
        if (!str.isEmpty()) {
            // Check if the first character is 'a'
            boolean keepFirstChar = str.charAt(0) == 'a';

            // Check if the second character is 'b'
            boolean keepSecondChar = str.length() > 1 && str.charAt(1) == 'b';

            // Build the result string based on the conditions
            if (keepFirstChar && keepSecondChar) {
                return str; // Keep both 'a' and 'b'
            } else if (keepFirstChar) {
                return "a" + str.substring(2); // Keep 'a' and skip the first 2 characters
            } else if (keepSecondChar) {
                return "b" + str.substring(2); // Keep 'b' and skip the first 2 characters
            } else {
                return str.substring(2); // Skip the first 2 characters
            }
        }

        // If the string is empty, return an empty string
        return "";
    }
}
