import java.util.Scanner;

public class MakeTags {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the HTML tag
        System.out.print("Enter the HTML tag: ");
        String tag = scanner.nextLine();

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Call the makeTags method and print the result
        System.out.println("Result: " + makeTags(tag, word));

        // Close the Scanner
        scanner.close();
    }

    public static String makeTags(String tag, String word) {
        // Return the HTML string with tags around the word
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
