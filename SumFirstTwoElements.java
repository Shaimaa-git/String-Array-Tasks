public class SumFirstTwoElements {
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {7, 2, 3};
        int[] array2 = {1, 0};
        int[] array3 = {11, 8, 1, 1};

        System.out.println(sum(array1));
        System.out.println(sum(array2));
        System.out.println(sum(array3)); 
    }

    public static int sum(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }
}


    


