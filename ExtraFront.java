import java.util.Scanner;

public class ExtraFront {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the extraFront method and print the result
        System.out.println("Result: " + extraFront(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static String extraFront(String str) {
        // Check if the length of the string is at least 2
        if (str.length() >= 2) {
            // Extract the first two characters
            String firstTwo = str.substring(0, 2);

            // Return a new string made of 3 copies of the first two characters
            return firstTwo + firstTwo + firstTwo;
        }

        // If there are fewer than 2 characters, use whatever is there
        return str + str + str;
    }
}
