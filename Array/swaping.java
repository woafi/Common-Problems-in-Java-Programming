public class swaping {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4};
        swap(arr, 0, 1);
        System.out.println(arr[0]);  // Output: 4
        System.out.println(arr[1]);  // Output: 5
    }
}
