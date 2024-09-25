public class bitoperation {
    public static void main(String[] args) {
        int n=5; //0101
        int position=3;
        int bitmask= 1<<position;
        //System.out.println(bitmask);
        if ((bitmask & n) == 0){
            System.out.println("The 2nd position is zero");
        }else {
            System.out.println("The 2nd position is one");
        }
    }
    
}
