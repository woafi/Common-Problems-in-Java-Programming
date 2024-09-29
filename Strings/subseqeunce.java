public class subseqeunce {
    public static void function(String str, int dex, String newStr) {
        if (dex == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(dex);
        // to be
        function(str, dex + 1, newStr + currchar);
        // Not to be
        function(str, dex + 1, newStr);

    }// function

    public static void main(String[] args) {
        String str = "123";
        function(str, 0, "");
    }
}// class
