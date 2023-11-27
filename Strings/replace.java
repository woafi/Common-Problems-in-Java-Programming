import java.util.*;
public class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String: ");
        String origin=sc.next();
        String result="";

        for(int i=0; i<origin.length(); i++){
            if(origin.charAt(i) == 'e'){
                result+= 'i';
            }
            else{
                result += origin.charAt(i);
            }        
        }
        System.out.println(result);
    }
    
}
