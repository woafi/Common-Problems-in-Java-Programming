//Linear Search
import java.util.*;
public class SearchingaArrayElement {
    private static int found;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row=sc.nextInt();
        System.out.print("Enter the coloum: ");
        int coloum=sc.nextInt();
        int[][] arrayelement=new int[row][coloum];
        //input element
        System.out.println("Enter the element of Array");
        for(int i=0; i<row; i++){
            for (int j=0; j<coloum; j++){
                arrayelement[i][j]=sc.nextInt();
            }
        }
        //searching part
        System.out.print("Enter the number Element: ");
        int searchingelement=sc.nextInt();
        

        for(int i=0; i<row; i++){
            for (int j=0; j<coloum; j++){
            while (searchingelement == arrayelement[i][j]){
                found = 1;
                System.out.println("Element is found at index: "+(i+1)+(j+1));
                break;
            }
        }
    }           
        if ( found == 1) {
            return;        
        }
        else{
            System.out.println("Element can't be found");
        }
        }      
    }
