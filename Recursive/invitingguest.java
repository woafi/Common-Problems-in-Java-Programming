public class invitingguest {
    
    public static int callguest(int n) {

        if (n<=1){
            return 1;
        }


        //single call
        int singlecall = callguest(n-1);
        // pair call
        int paircall = (n-1)*callguest(n-2);
        return paircall + singlecall;
        
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callguest(n));
    }
    
}
