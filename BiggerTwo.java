import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        int[] array3 = {3, 4};
        int[] array4 = {1, 1};
        int[] array5 = {1, 2};

        System.out.println(Arrays.toString(biggerTwo(array1, array2))); // Output: [3, 4]
        System.out.println(Arrays.toString(biggerTwo(array3, array4))); // Output: [3, 4]
        System.out.println(Arrays.toString(biggerTwo(array4, array5))); // Output: [1, 2]
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        // Calculate the sum of values in each array
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        // Compare sums and return the array with the larger sum
        return (sumA >= sumB) ? a : b;
    }
}
