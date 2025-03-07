import java.util.ArrayList;
import java.util.List;

public class integerToArray {
    public static void main(String[] args) {
        int number = 987654321; 
        List<Integer> digits = new ArrayList<>();

        // Extract digits from the number
        while (number > 0) {
            digits.add(0, number % 10); // Add digit to the beginning of the list
            number /= 10; // Remove the last digit
        }

        // Convert the list to an array
        int[] array = new int[digits.size()];
        for (int i = 0; i < digits.size(); i++) {
            array[i] = digits.get(i);
        }

        // Print the array
        System.out.print("The array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
