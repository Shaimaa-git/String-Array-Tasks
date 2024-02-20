public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5};
        int[] array2 = {2, 1, 3, 4, 5};
        int[] array3 = {1, 1, 1};

        System.out.println(unlucky1(array1)); // Output: true
        System.out.println(unlucky1(array2)); // Output: true
        System.out.println(unlucky1(array3)); // Output: false
    }

    public static boolean unlucky1(int[] nums) {
        // Check for the presence of an "unlucky" 1 in the first 2 or last 2 positions
        return (nums.length >= 2 && nums[0] == 1 && nums[1] == 3) ||
               (nums.length >= 3 && nums[1] == 1 && nums[2] == 3) ||
               (nums.length >= 2 && nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
    }
}
