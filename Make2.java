import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {4, 5};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4};
        int[] array4 = {1, 2, 3};
        int[] array5 = {};
        int[] array6 = {1, 2};

        System.out.println(Arrays.toString(make2(array1, array2))); // Output: [4, 5]
        System.out.println(Arrays.toString(make2(array3, array4))); // Output: [4, 1]
        System.out.println(Arrays.toString(make2(array5, array6))); // Output: [1, 2]
    }

    public static int[] make2(int[] a, int[] b) {
        // Create a new array of length 2 containing elements from a followed by b
        int[] result = new int[2];

        if (a.length >= 2) {
            result[0] = a[0];
            result[1] = a[1];
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else {
            result[0] = b[0];
            result[1] = b[1];
        }

        return result;
    }
}
