import java.util.Scanner;

public class MinCat {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Call the minCat method and print the result
        System.out.println("Result: " + minCat(str1, str2));

        // Close the Scanner
        scanner.close();
    }

    public static String minCat(String a, String b) {
        // Find the minimum length of the two strings
        int minLength = Math.min(a.length(), b.length());

        // Return the concatenation of the substrings with the minimum length
        return a.substring(a.length() - minLength) + b.substring(b.length() - minLength);
    }
}
