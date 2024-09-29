import java.util.*;
public class fibonacci2 {
    public static int Fibonacci(int i) {
     if ( i == 0 )
     return 0;                  //if (n<2){return 1;}
     else if ( i == 1 )
     return 1;
     else
     return ( Fibonacci(i-1) + Fibonacci(i-2) );
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         for(int i=0; i<n; i++){
            System.out.print(Fibonacci(i)+"\n");
        }        
    }
}
