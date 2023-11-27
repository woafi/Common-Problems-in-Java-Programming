import java.util.*;
public class naturalnumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop =sc.nextInt();
        int sum = 0;
        for (int i=1; i<=loop; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
