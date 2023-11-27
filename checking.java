import java.util.*;
public class checking {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cp=0, cn=0, zn=0;
    System.out.println("Enter the number of elements: ");
    int n=sc.nextInt();
    System.out.println("Enter the elements: ");
    for(int i=1; i<=n; i++){
        int number=sc.nextInt();
        if (number==0) {zn++; }
        if (number<0) {cn++;}
        if (number>0) {cp++;}       
    }
    System.out.println("positive: "+cp);
    System.out.println("zero: "+zn);
    System.out.println("Negative: "+cn);      
    }
    
}
