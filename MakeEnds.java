import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 2, 3};
        int[] result1 = makeEnds(array1);
        System.out.println(Arrays.toString(result1));

        int[] array2 = {1, 2, 3, 4};
        int[] result2 = makeEnds(array2);
        System.out.println(Arrays.toString(result2));

        int[] array3 = {7, 4, 6, 2};
        int[] result3 = makeEnds(array3);
        System.out.println(Arrays.toString(result3));

        int[] array4 = {5};
        int[] result4 = makeEnds(array4);
        System.out.println(Arrays.toString(result4));
    }

    public static int[] makeEnds(int[] nums) {
        if (nums.length == 1) {
            // If the array has only one element, return a new array with that element repeated twice
            return new int[]{nums[0], nums[0]};
        } else {
            // For arrays with more than one element, return a new array with the first and last elements
            return new int[]{nums[0], nums[nums.length - 1]};
        }
    }
}
