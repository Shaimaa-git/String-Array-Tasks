public class main {
    public static void main(String[] args) {
        int[] array1 = {4, 4, 4};
        int[] array2 = {2, 4, 8};
        int[] array3 = {1, 3, 5};

        System.out.println(sum3(array1)); // Output: 12
        System.out.println(sum3(array2)); // Output: 14
        System.out.println(sum3(array3)); // Output: 9
    }

    public static int sum3(int[] nums) {
        // Make sure the array length is 3 before attempting to access elements
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        } else {
            // Handle the case where the array does not have exactly 3 elements
            System.out.println("Array length must be 3.");
            return 0; // You may choose a different way to handle this situation
        }
    }
}


