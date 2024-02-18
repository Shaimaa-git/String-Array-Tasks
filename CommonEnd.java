import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter elements for the first array (comma-separated): ");
        int[] array1 = readIntArray(scanner);

        // Input for the second array
        System.out.print("Enter elements for the second array (comma-separated): ");
        int[] array2 = readIntArray(scanner);

        // Input for the third array
        System.out.print("Enter elements for the third array (comma-separated): ");
        int[] array3 = readIntArray(scanner);
        // input for fourth array
        System.out.print("Enter elements for the fourth array (comma-separated): ");
        int[] array4 = readIntArray(scanner);

        // Close the scanner
        scanner.close();

        // Compare the first and second arrays
        System.out.println("Common end between array1 and array2: " + commonEnd(array1, array2));

        // Compare the first and third arrays
        System.out.println("Common end between array3 and array4: " + commonEnd(array3, array4));
    }

    public static boolean commonEnd(int[] a, int[] b) {
        // Check if the arrays have at least one element
        if (a.length > 0 && b.length > 0) {
            // Compare the first and last elements of the arrays
            return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
        } else {
            // Arrays are empty, return false
            return false;
        }
    }

    public static int[] readIntArray(Scanner scanner) {
        // Read comma-separated integers from the user input and store them in an array
        String input = scanner.nextLine();
        String[] strArray = input.split(",");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i].trim());
        }
        return intArray;
    }
}


