import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        int[] array3 = {4, 4};
        int[] array4 = {2, 2};
        int[] array5 = {9, 2};
        int[] array6 = {3, 4};

        System.out.println(Arrays.toString(plusTwo(array1, array2))); // Output: [1, 2, 3, 4]
        System.out.println(Arrays.toString(plusTwo(array3, array4))); // Output: [4, 4, 2, 2]
        System.out.println(Arrays.toString(plusTwo(array5, array6))); // Output: [9, 2, 3, 4]
    }

    public static int[] plusTwo(int[] a, int[] b) {
        // Create a new array of length 4 containing all elements from both arrays
        int[] result = {a[0], a[1], b[0], b[1]};
        return result;
    }
}
