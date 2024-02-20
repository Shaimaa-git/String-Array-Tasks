import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {7, 1, 2, 3, 4, 9};
        int[] array3 = {1, 2};

        System.out.println(Arrays.toString(makeMiddle(array1))); // Output: [2, 3]
        System.out.println(Arrays.toString(makeMiddle(array2))); // Output: [2, 3]
        System.out.println(Arrays.toString(makeMiddle(array3))); // Output: [1, 2]
    }

    public static int[] makeMiddle(int[] nums) {
        // Calculate the middle index of the array
        int middleIndex = nums.length / 2;

        // Create a new array with the middle two elements
        int[] result = {nums[middleIndex - 1], nums[middleIndex]};
        return result;
    }
}
