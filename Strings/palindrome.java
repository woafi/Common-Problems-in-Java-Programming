import java.util.*;

public class test {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String revStr="";
        String reverse[]=new String[A.length()];
        for (int i=0; i<A.length(); i++){
            reverse[i]=String.valueOf(A.charAt(i));
        }
        for (int i=A.length() - 1; i>=0; i--){
            revStr += reverse[i];
        }
        
        //compare
        int n = A.compareTo(revStr);
        if (n==0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
    
}
