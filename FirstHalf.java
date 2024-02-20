import java.util.Scanner;

public class FirstHalf {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the firstHalf method and print the result
        System.out.println("Result: " + firstHalf(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static String firstHalf(String str) {
        // Calculate the index of the middle character
        int middleIndex = str.length() / 2;

        // Return the substring from the beginning up to the middle index
        return str.substring(0, middleIndex);
    }
}
