import java.util.Scanner;

public class WithoutX2 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the withoutX2 method and print the result
        System.out.println("Result: " + withoutX2(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static String withoutX2(String str) {
        // Check if the length of the string is at least 2
        if (str.length() >= 2) {
            // Check if the first character is 'x' and the second character is also 'x'
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                // Return substring starting from index 2
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                // Return substring starting from index 1
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                // Return substring with first character and then starting from index 2
                return str.charAt(0) + str.substring(2);
            }
        }

        // If the length is less than 2 or no 'x' is found at the beginning, return the original string
        return str;
    }
}
