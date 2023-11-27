import java.util.*;
public class moveAllX {
    public static void function(String str, int dex, int count, String newStr, char a){
        if (dex==str.length()){
           
            for(int i=1; i<=count; i++){
                newStr+=a;
            }
            System.out.println(newStr);
            return;
        }
        char currchar=str.charAt(dex);
        if (currchar==a){
            count++;
            function(str, dex+1, count, newStr, a);
        }else {
            newStr+=currchar;
            function(str, dex+1, count, newStr, a);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="axbcxxxadx";
        char a=sc.next().charAt(0);                  //a=which character
        function(str, 0, 0, "", a);
    }
    
}
