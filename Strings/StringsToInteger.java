public class StringsToInteger {
    public static void main(String args[]) {
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        int number2 = Integer.valueOf(str); // Auto-unboxing to int
        System.out.println("Method 2: " + number2);
       
       
    }
 }