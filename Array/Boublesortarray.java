//Bouble Sort
import java.util.*;
public class Boublesortarray {
    public static void bubbleSort(int array[], int size){
        for (int i=0; i<size-1; i++){
            for (int j=0; j<size-i-1; j++){
                if( array[j] > array[j+1] ){
                    int swap=array[j];
                    array[j]=array[j+1];
                    array[j+1]=swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        //input
        for (int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        bubbleSort(array, size); //fucnction call
        //output
        System.out.print("Sort Array: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        //System.out.print(array[size-1]+" ");
    }
}
