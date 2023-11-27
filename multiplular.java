import java.util.*;
public class multiplular {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int numb=sc.nextInt();
    for (int i=1; i<=10; i++){
        
        int sum=numb*i;
        System.out.print(numb);
        System.out.print("*");
        System.out.print(i);
        System.out.print("=");
        System.out.println(sum);
    }        
    }
    
}
