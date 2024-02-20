public class Main {
    public static void main(String[] args) {
        int[] array1 = {10, 2, 3};
        int[] array2 = {1, 5, 3};
        int[] array3 = {5, 2, 8};

        System.out.println(maxTriple(array1)); 
        System.out.println(maxTriple(array2)); 
        System.out.println(maxTriple(array3)); 
    }

    public static int maxTriple(int[] nums) {
        // Calculate the middle index of the array
        int middleIndex = nums.length / 2;

        // Find the maximum of the first, last, and middle values
        int max = Math.max(nums[0], Math.max(nums[middleIndex], nums[nums.length - 1]));

        return max;
    }
}
