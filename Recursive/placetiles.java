public class placetiles {
    public static int placetiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // vertplacement
        int vertplacement = placetiles(n - m, m);
        // horplacement
        int horplacement = placetiles(n - 1, m);

        return vertplacement + horplacement;
    }

    public static void main(String[] args) {
        System.out.println(placetiles(4, 2));
    }

}
