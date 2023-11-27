public class ReverseString2 {
    public static void reverse(String str, int dex ){
        if(dex == 0){
            System.out.print(str.charAt(dex));
            return;
        }
        System.out.print(str.charAt(dex));
        reverse(str, dex-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        reverse(str, str.length()-1);
    }
    
}
