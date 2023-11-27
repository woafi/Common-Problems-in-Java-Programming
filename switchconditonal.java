import java.util.*;
public class switchconditonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int variable=sc.nextInt();
        switch(variable){
            case 1: System.out.println("statement 1-20"); break;
            case 2: System.out.println("statement 21-30"); break;
            case 3: System.out.println("statement 31-40"); break;
            default: System.out.println("Invaild");
        }
    }
    
}
