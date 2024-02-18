public class Main {

            public static void main(String[] args) {
                int[] array1 = {6, 1, 8};
                int[] array2 = {4, 1, 2, 6};
                int[] array3 = {1, 6, 1, 2, 10};

                System.out.println(firstLast6(array1)); // Output: true
                System.out.println(firstLast6(array2)); // Output: true
                System.out.println(firstLast6(array3)); // Output: false
            }

            public static boolean firstLast6(int[] x) {
                return x[0] == 6 || x[x.length - 1] == 6;
            }
        }

