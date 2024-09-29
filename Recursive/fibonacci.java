public class fibonacci {
    public static void recall(int fst, int sec, int n){
        if (n == 0){
            return;
        }
        int nxtTerm=fst+sec;
        System.out.print(nxtTerm+" ");
        recall(sec, nxtTerm, n-1 );
    }
    public static void main(String[] args) {
        int n = 5;
        int fst = 0;
        int sec = 1;
        System.out.print(fst+" ");
        System.out.print(sec+" ");
        recall(fst, sec, n-2);
    }
    
}
