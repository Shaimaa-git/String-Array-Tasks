import java.util.Scanner;

public class LastTwoTriple {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the lastTwoTriple method and print the result
        System.out.println("Result: " + lastTwoTriple(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static String lastTwoTriple(String str) {
        // Check if the length of the string is at least 2
        if (str.length() >= 2) {
            // Extract the last two characters
            String lastTwo = str.substring(str.length() - 2);

            // Return a new string made of 3 copies of the last two characters
            return lastTwo + lastTwo + lastTwo;
        }

        // If the length is less than 2, return an empty string
        return "";
    }
}
