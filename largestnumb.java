import java.util.*;
public class largestnumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numb1=sc.nextInt();
        int numb2=sc.nextInt();
        if (numb1!=numb2){
            if (numb1>numb2) {
                System.out.print("largest: ");
                System.out.println(numb1);
            }
            else {
                System.out.print("largest: ");
                System.out.println(numb2);
            }
        }
        else{
            System.out.println("Equal");
        }
    }
}