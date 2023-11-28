public class TOWERofHanoi {
    public static void tower(int n, String source, String helper, String dest){
        if (n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+dest );
            return;
        }
        tower(n-1, source, dest, helper);
        System.out.println("Transfer disk "+n+" from "+source+" to "+dest );
        tower(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
        
        tower(3, "S", "H", "D");
    }
    
}
