import java.util.*;
public class sumOfAllOddNumbs {
    public static void logic(int n){
        if (n<0){
        System.out.println("Invalid Input");
        return;
        }
        else {
        int sum=0;
        for (int i=1; i<=n; i++) {
        sum+=((2*i)-2); 
        }
            System.out.println(sum);
            return;
    }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        logic(n);  
    }
    
}



