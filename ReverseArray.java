public class Main {
            public static void main(String[] args) {
                int[] array1 = {1, 2, 3};
                int[] array2 = {5, 11, 9};
                int[] array3 = {7, 0, 0};

                int[] reversedArray1 = reverse3(array1);
                int[] reversedArray2 = reverse3(array2);
                int[] reversedArray3 = reverse3(array3);

                // Print the results
                printArray(reversedArray1);
                printArray(reversedArray2);
                printArray(reversedArray3);
            }

            public static int[] reverse3(int[] nums) {
                int[] reversedArray = new int[3];
                reversedArray[0] = nums[2];
                reversedArray[1] = nums[1];
                reversedArray[2] = nums[0];
                return reversedArray;
            }

            public static void printArray(int[] array) {
                System.out.print("[");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                    if (i < array.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }

    


