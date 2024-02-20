public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 3};
        int[] array3 = {7, 3, 2};
        int[] array4 = {1, 3};

        System.out.println(commonEnd(array1, array2)); // Output: true
        System.out.println(commonEnd(array1, array3)); // Output: false
        System.out.println(commonEnd(array1, array4)); // Output: true
    }

    public static boolean commonEnd(int[] a, int[] b) {
        // Check if they have the same first element or the same last element
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
