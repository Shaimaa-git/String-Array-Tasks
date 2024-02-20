import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 3, 5};
        int[] array3 = {1, 2, 3};

        System.out.println(Arrays.toString(fix23(array1))); 
        System.out.println(Arrays.toString(fix23(array2))); 
        System.out.println(Arrays.toString(fix23(array3))); 
    }

    public static int[] fix23(int[] nums) {
        // Check if there is a 2 followed by a 3 and update the array
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }
}
