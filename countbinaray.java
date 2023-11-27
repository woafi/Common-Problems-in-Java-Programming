import java.util.*;
public class countbinaray {
   public static int bitcount( int n){
   int count = 0;
    while (n > 0){
        count++;
        n = n & (n-1);
    }
    return count;
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); //n=input number
     System.out.println(bitcount(n));
   }
}
