import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2};
        int[] array3 = {1};

        System.out.println(Arrays.toString(frontPiece(array1))); // Output: [1, 2]
        System.out.println(Arrays.toString(frontPiece(array2))); // Output: [1, 2]
        System.out.println(Arrays.toString(frontPiece(array3))); // Output: [1]
    }

    public static int[] frontPiece(int[] nums) {
        // Create a new array containing the first 2 elements or all elements if smaller than 2
        int length = Math.min(nums.length, 2);
        int[] result = new int[length];
        
        for (int i = 0; i < length; i++) {
            result[i] = nums[i];
        }
        
        return result;
    }
}
