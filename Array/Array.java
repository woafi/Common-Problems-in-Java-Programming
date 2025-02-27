
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size: ");
        // int size = sc.nextInt();
        // int[] sRoll = new int[size];
        // int sRoll[]= {1, 2, 3};
        // int sRoll[] = new int[3];
        // System.out.println(sRoll.length);
        // for (int i = 0; i < size; i++) { // input
        //     sRoll[i] = sc.nextInt();
        // }
        // for (int i = 0; i < sRoll.length; i++) { // output
        //     System.out.print(sRoll[i] + " ");
        // }
        int[] arr = {4, 6, 7, 2, 1};

        // Sort the array using Arrays.sort()
        // Arrays.sort(arr);
        Arrays.sort(arr, 1, 4);
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
        int arr1[];
        arr1 = new int[2];
        arr1[0] = 10;
        System.out.println(arr1[0]);
        int matrix[][] = {{2, 6, 7, 8}, {5, 6, 2}, {7, 0, 1}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
    }

}
