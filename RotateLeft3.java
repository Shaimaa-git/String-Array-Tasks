public class main {

    public static int[] rotateLeft3(int[] x) {
        int[] rotatedArray = new int[3];


        if (x.length >= 3) {

            rotatedArray[0] = x[1];
            rotatedArray[1] = x[2];
            rotatedArray[2] = x[0];
        } else {

            System.out.println("Input array should have at least 3 elements.");
        }

        return rotatedArray;
    }

    public static void main(String[] args) {

        int[] array1 = rotateLeft3(new int[]{9, 8, 7});
        int[] array2 = rotateLeft3(new int[]{3, 11, 1});
        int[] array3 = rotateLeft3(new int[]{3, 0, 0});


        printArray(array1);
        printArray(array2);
        printArray(array3);
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

