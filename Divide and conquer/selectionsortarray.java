// Selection array
public class selectionsortarray {
    public static void main(String[] args) {
        int[] number={7,8,9,4,5,2,1};

        for (int i=0; i<number.length-1; i++){
            int smallest=i;
            for (int j=i+1; j<number.length; j++){
                if(number[smallest] > number[j] ){
                    smallest =j;
                }
            }
            int temp=number[smallest];
            number[smallest]=number[i];
            number[i]=temp;
        }
        for (int i=0; i<number.length; i++){
        System.out.print(number[i]+" ");
        }
    }
}