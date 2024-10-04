import java.util.*;

public class decimalToBinary {
    public static void decimalToBinary(int n) {
        int remainder;
        if (n <= 1) {
            System.out.print(n);
            return;
        }
        remainder = n % 2;
        decimalToBinary(n >> 1);
        System.out.print(remainder);
    }

    public static void main(String[] args) {
        System.out.println("Decimal Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n=input number
        decimalToBinary(n);
    }
}
