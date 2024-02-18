public class Main {
    public static void main(String[] args) {
        int[] result = makePi();
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }
}


