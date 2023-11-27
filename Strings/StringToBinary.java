public class StringToBinary {
    public static void main(String args[]) {
        String MESSAGE = "woafi";
        String binaryResult = "";
       /*  for (char c : MESSAGE.toCharArray()){
            binaryResult += Integer.toBinaryString( (int) c);
        }
        */
        for (int i=0; i<MESSAGE.length(); i++){
            binaryResult += Integer.toBinaryString(i);      
        }
        System.out.println(binaryResult);
    }    
}

