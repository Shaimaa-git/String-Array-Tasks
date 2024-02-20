import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 9, 8};
        int[] array3 = {1};
        int[] array4 = {2};
        int[] array5 = {1, 7};
        int[] array6 = {};

        System.out.println(Arrays.toString(front11(array1, array2))); // Output: [1, 7]
        System.out.println(Arrays.toString(front11(array3, array4))); // Output: [1, 2]
        System.out.println(Arrays.toString(front11(array5, array6))); // Output: [1]
    }

    public static int[] front11(int[] a, int[] b) {
        // Check if either array is not empty and return a new array with their first elements
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }
}
