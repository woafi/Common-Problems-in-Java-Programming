public class checkingaelemnt {
    public static int first=-1;
    public static int last=-1;
    public static void search(String str, int dex, char element){
        if(dex==str.length()){
            System.out.println(first+"\n"+last);
            return;
        }
        char currchar=str.charAt(dex);
        if (currchar==element){
            if(first==-1){
                first=dex;
            }
                else {
                    last=dex;
                }
        }
        search(str, dex+1, element);
}
    
    public static void main(String[] args) {
        String str="abaacdaefaah";
        search(str, 0, 'a');
        
    }
    
}
