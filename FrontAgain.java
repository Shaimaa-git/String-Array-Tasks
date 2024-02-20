import java.util.Scanner;

public class FrontAgain {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the frontAgain method and print the result
        System.out.println("Result: " + frontAgain(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static boolean frontAgain(String str) {
        // Check if the length of the string is at least 2
        if (str.length() >= 2) {
            // Extract the first two characters
            String firstTwo = str.substring(0, 2);

            // Extract the last two characters
            String lastTwo = str.substring(str.length() - 2);

            // Check if the first two characters are equal to the last two characters
            return firstTwo.equals(lastTwo);
        }

        // If the length is less than 2, return false
        return false;
    }
}
