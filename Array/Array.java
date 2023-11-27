
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=sc.nextInt();
        int[] sRoll = new int[size];
        // int sRoll[]= {1, 2, 3};
        // int sRoll[] = new int[3];
        //System.out.println(sRoll.length);
        for (int i=0; i<size; i++){     //input
            sRoll[i] = sc.nextInt();
        }
        for(int i=0; i<sRoll.length; i++){      //output
            System.out.print(sRoll[i]+" ");
        }
    }
    
}
