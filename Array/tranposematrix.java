import java.util.*;
public class tranposematrix {
    public static void main(String args[]) {
        int matrix[][] = {{2, 6, 7}, {5, 4, 1}};
        int n = matrix.length;
        int m = matrix[n-1].length;
  
        System.out.println("The transpose is : ");
        //To print transpose
        for(int j=0; j<m ;j++) {
            for(int i=0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
     }
}