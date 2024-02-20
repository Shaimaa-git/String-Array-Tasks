import java.util.Scanner;

public class NonStart {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Call the nonStart method and print the result
        System.out.println("Result: " + nonStart(str1, str2));

        // Close the Scanner
        scanner.close();
    }

    public static String nonStart(String a, String b) {
        // Return the concatenation of the substrings excluding the first character
        return a.substring(1) + b.substring(1);
    }
}
