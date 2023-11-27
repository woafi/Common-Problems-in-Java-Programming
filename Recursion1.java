import java.util.*;
public class Recursion1 {
    public static int recall(int numb){
        System.out.print(numb+" ");
        if (numb == -5){
            System.out.println("Reached");
            return 0;
        }else {
            
            return recall(numb-1);
        }
    }
         
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:  ");
        int numb=sc.nextInt();
        recall(numb);
        
    }
    
}
