public class backtracking {
    public static void tracking(String str, String permutation, int dex){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            
            tracking(newstr, permutation+currchar, dex+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        tracking(str, "", 0);

    }
    
}
