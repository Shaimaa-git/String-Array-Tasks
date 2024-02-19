public class Main {
            public static int[] maxEnd3(int[] nums) {

                int max = Math.max(nums[0], nums[2]);
                
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = max;
                }

                return nums;
            }

            public static void main(String[] args) {
                // Test cases
                int[] result1 = maxEnd3(new int[]{20, 1, 3});
                int[] result2 = maxEnd3(new int[]{11, 5, 23});
                int[] result3 = maxEnd3(new int[]{233, 11, 3});

                // Print the results
                printArray(result1);
                printArray(result2);
                printArray(result3);
            }

            private static void printArray(int[] arr) {
                System.out.print("[");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                    if (i < arr.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }


    


