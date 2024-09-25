import java.util.*;
public class factorial {

    public static void logic(long i, long n, long fact) {
        if (i == n) {
            fact *= i;
            System.out.println(fact);
            return;
        }
        fact *= i;
        logic(i + 1, n, fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t = sc.nextInt(); t > 0; t--) {
            long n = sc.nextInt();
            logic(1, n, 1);
        }
    }
}
