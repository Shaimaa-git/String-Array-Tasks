             import java.util.Scanner;

                public class Main {
                    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);

                        // Ask the user to input the array elements
                        System.out.print("Enter the elements of the array (comma-separated): ");
                        String input = scanner.nextLine();

                        // Convert the input string to an array of integers
                        String[] elements = input.split(",");
                        int[] nums = new int[elements.length];
                        for (int i = 0; i < elements.length; i++) {
                            nums[i] = Integer.parseInt(elements[i].trim());
                        }

                        // Check if the first and last elements are equal
                        boolean result = firstAndLastEqual(nums);

                        // Display the result
                        System.out.println("Result: " + result);
                    }

                    public static boolean firstAndLastEqual(int[] nums) {
                        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
                    }
                }