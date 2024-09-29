import java.util.*;
public class Recursion {
    public static int recall(int numb){
        if (numb == 0){
            return 0;
        } 
        System.out.println(numb);
            
        int newNum = recall(numb-1);

        System.out.println(newNum);
        return newNum + 2;

    }
         
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = 5;
        recall(numb);
        
    }
    
}
