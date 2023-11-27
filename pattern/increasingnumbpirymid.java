public class increasingnumbpirymid {
    public static void main(String[] args){
        int n=5;
        int numb=1;
        for (int i=1; i<=n; i++){
            //for space print
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // for numbers print
            for (int j=1; j<=i; j++){
                System.out.print(numb+" ");
            }
            numb++;
            System.out.println();
    }
    
}
}
