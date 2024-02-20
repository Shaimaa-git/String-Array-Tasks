import java.util.Scanner;

public class EndsLy {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the endsLy method and print the result
        System.out.println("Result: " + endsLy(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static boolean endsLy(String str) {
        // Check if the length of the string is at least 2 and the substring at the end is "ly"
        return str.length() >= 2 && str.endsWith("ly");
    }
}
