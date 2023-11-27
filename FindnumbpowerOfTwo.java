import java.util.*;
public class FindnumbpowerOfTwo {
    public static boolean powerFunc(int n){
        if (n==0){
            return false;
        }
        while (n != 1){
            if( n%2 != 0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();  //n=input number
        
       System.out.println(powerFunc(n));
        
    }    
    
}
