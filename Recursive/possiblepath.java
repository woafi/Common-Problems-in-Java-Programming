public class possiblepath {
    public static int countpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // downpath + rightpath

        return countpath(i + 1, j, n, m) + countpath(i, j + 1, n, m);
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countpath(0, 0, n, m));
    }

}
