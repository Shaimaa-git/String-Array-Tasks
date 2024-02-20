import java.util.Scanner;

public class WithoutEnd {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the withoutEnd method and print the result
        System.out.println("Result: " + withoutEnd(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static String withoutEnd(String str) {
        // Check if the length of the string is at least 2
        if (str.length() >= 2) {
            // Return the substring excluding the first and last character
            return str.substring(1, str.length() - 1);
        }

        // If the length is less than 2, return an empty string
        return "";
    }
}
