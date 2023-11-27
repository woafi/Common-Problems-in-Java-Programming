import java.util.*;
//Euclidean algorithm
public class GCD {
    public static int logic(int numb1, int numb2){
        if(numb1==0 || numb2==0){
            return 0;}
            else if(numb1==numb2 ){ return numb1;}
            else if( numb1>numb2){
                return logic(numb1-numb2,numb2);
            }
            else{
                return logic(numb1,numb2-numb1);
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:  ");
        int numb1=sc.nextInt();
        int numb2=sc.nextInt();
        System.out.println("GCD: "+logic(numb1, numb2));
    }
}
