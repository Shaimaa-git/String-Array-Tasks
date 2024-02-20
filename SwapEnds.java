import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3};
        int[] array3 = {8, 6, 7, 9, 5};

        System.out.println(Arrays.toString(swapEnds(array1))); // Output: [4, 2, 3, 1]
        System.out.println(Arrays.toString(swapEnds(array2))); // Output: [3, 2, 1]
        System.out.println(Arrays.toString(swapEnds(array3))); // Output: [5, 6, 7, 9, 8]
    }

    public static int[] swapEnds(int[] nums) {
        // Check if the array has at least one element
        if (nums.length >= 1) {
            // Swap the first and last elements
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        return nums;
    }
}
