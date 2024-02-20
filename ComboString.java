import java.util.Scanner;

public class ComboString {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Call the comboString method and print the result
        System.out.println("Result: " + comboString(str1, str2));

        // Close the Scanner
        scanner.close();
    }

    public static String comboString(String a, String b) {
        // Check the lengths of the two strings
        if (a.length() < b.length()) {
            // If the first string is shorter, return short+long+short
            return a + b + a;
        } else {
            // If the second string is shorter, return short+long+short
            return b + a + b;
        }
    }
}
