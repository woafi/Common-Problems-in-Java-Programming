import java.util.*;
public class factorial {

    public static long logic(long i, long n, long fact) {
        if (i == n) {
            fact *= i;
            return fact;
        }
        if (n == 0 || n == 1) { // if (n<=1){ return 1;}
            return 1;
        }
        fact *= i;
        return logic(i + 1, n, fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            long n = sc.nextInt();
            System.out.println(logic(1, n, 1));
            
    }
}
