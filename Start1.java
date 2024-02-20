public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 3};
        int[] array3 = {7, 2, 3};
        int[] array4 = {1};
        int[] array5 = {1, 2};
        int[] array6 = {};

        System.out.println(start1(array1, array2)); // Output: 2
        System.out.println(start1(array3, array4)); // Output: 1
        System.out.println(start1(array5, array6)); // Output: 1
    }

    public static int start1(int[] a, int[] b) {
        // Initialize counters for arrays starting with 1
        int count = 0;

        // Check if array a starts with 1
        if (a.length > 0 && a[0] == 1) {
            count++;
        }

        // Check if array b starts with 1
        if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
    }
}
