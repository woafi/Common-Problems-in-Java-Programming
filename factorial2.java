import java.util.*;
public class factorial2 {
    
    public static int logic(int n){
          if (n==0 || n==1){      //if (n<=1){ return 1;}
          return 1;
          }
          int facta= logic(n-1);
          int fact=n*facta;
          return fact;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=logic(n);
        System.out.println(ans);
    }
}
