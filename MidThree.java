import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {8, 6, 7, 5, 3, 0, 9};
        int[] array3 = {1, 2, 3};

        System.out.println(Arrays.toString(midThree(array1))); // Output: [2, 3, 4]
        System.out.println(Arrays.toString(midThree(array2))); // Output: [7, 5, 3]
        System.out.println(Arrays.toString(midThree(array3))); // Output: [1, 2, 3]
    }

    public static int[] midThree(int[] nums) {
        // Calculate the middle index of the array
        int middleIndex = nums.length / 2;

        // Create a new array with the middle three elements
        int[] result = {nums[middleIndex - 1], nums[middleIndex], nums[middleIndex + 1]};
        return result;
    }
}
