public class arrayToInteger {
    public static void main(String[] args) {
        int[] array = {4, 2, 4, 5};
        int result = 0;

        for (int num : array) {
            result = result * 10 + num;
        }

        System.out.println("The integer is: " + result);
    }
}