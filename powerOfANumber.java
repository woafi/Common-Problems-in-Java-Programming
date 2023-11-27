public class powerOfANumber {
    public static int calPower(int x, int n) {
        if (n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int num=calPower(x, n-1);
        int sum=x*num;
        return sum;
    }
    public static void main(String[] args) {
        int x=5;
        int n=2;
       int result= calPower(x, n);
       System.out.println(result);
    }
    
    
}
