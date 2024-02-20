import java.util.Scanner;

public class MakeOutWord {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the "out" string
        System.out.print("Enter the 'out' string: ");
        String outString = scanner.nextLine();

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Call the makeOutWord method and print the result
        System.out.println("Result: " + makeOutWord(outString, word));

        // Close the Scanner
        scanner.close();
    }

    public static String makeOutWord(String out, String word) {
        // Calculate the index in the middle of the "out" string
        int middleIndex = out.length() / 2;

        // Return the new string where the word is in the middle of the "out" string
        return out.substring(0, middleIndex) + word + out.substring(middleIndex);
    }
}
