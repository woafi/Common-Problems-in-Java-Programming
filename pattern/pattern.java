
public class pattern {
    public static void main(String[] args) {
        int n=4;
       // int m=5;
        for (int i=1; i<=n; i++ ) { 
            //for (int j=1; j<=n; j++){
            for (int j=1; j<=n-i+1; j++) {
                /*if ((i ==1) ||(i==n) || (j==1) ||(j==m)){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }*/
                System.err.print(j+" ");
                }
                System.out.print("\n");
            }
           
            }
    }    

