public class Main {
    public static void main(String[] args) {
        int[] array1 = {4, 5};
        int[] array2 = {4, 2};
        int[] array3 = {3, 5};

        System.out.println(has23(array1));
        System.out.println(has23(array2));
        System.out.println(has23(array3));
    }

    public static boolean has23(int[] nums) {
        
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }
}

