import java.util.*;
public class sumOfTotalNumber {
    public static void recall(int i, int numb, int sum){
        if (i==numb){
            sum+=i;
            System.out.println(sum);
            return;
        }
        
         sum+=i;
         recall(i+1, numb, sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
        recall(1, numb, 0);
        
    }
    
}
