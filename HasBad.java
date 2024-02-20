import java.util.Scanner;

public class HasBad {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the hasBad method and print the result
        System.out.println("Result: " + hasBad(inputString));

        // Close the Scanner
        scanner.close();
    }

    public static boolean hasBad(String str) {
        // Check if "bad" appears starting at index 0 or 1 in the string
        return str.length() >= 3 && (str.substring(0, 3).equals("bad") || (str.length() >= 4 && str.substring(1, 4).equals("bad")));
    }
}
