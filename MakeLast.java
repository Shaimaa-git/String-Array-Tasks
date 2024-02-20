import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {6, 5, 6};
        int[] array2 = {2, 2};
        int[] array3 = {4};

        System.out.println(Arrays.toString(makeLast(array1))); 
        System.out.println(Arrays.toString(makeLast(array2))); 
        System.out.println(Arrays.toString(makeLast(array3))); 
    }

    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }
}
