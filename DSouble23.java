public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 2};
        int[] array2 = {3, 3};
        int[] array3 = {2, 3};

        System.out.println(double23(array1)); // Output: true
        System.out.println(double23(array2)); // Output: true
        System.out.println(double23(array3)); // Output: false
    }

    public static boolean double23(int[] nums) {
        // Check if the array contains 2 twice or 3 twice
        return (nums.length == 2) && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }
}
