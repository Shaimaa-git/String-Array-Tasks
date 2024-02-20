import java.util.Scanner;

public class StartWord {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Call the startWord method and print the result
        System.out.println("Result: " + startWord(str, word));

        // Close the Scanner
        scanner.close();
    }

    public static String startWord(String str, String word) {
        // Check if the word is not empty and the length of the word is less than or equal to the length of the string
        if (!word.isEmpty() && word.length() <= str.length()) {
            // Check if the substring of the string from index 1 matches the substring of the word from index 1
            if (str.substring(1, word.length()).equals(word.substring(1))) {
                // Return the substring of the string up to the length of the word
                return str.substring(0, word.length());
            }
        }

        // If there is no match, return the empty string
        return "";
    }
}
