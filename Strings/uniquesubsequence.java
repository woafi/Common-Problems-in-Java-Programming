import java.util.HashSet;

public class uniquesubsequence {
    public static void function(String str, int dex, String newStr, HashSet<String> set) {
        if (dex == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currchar = str.charAt(dex);
        // to be
        function(str, dex + 1, newStr + currchar, set);
        // Not to be
        function(str, dex + 1, newStr, set);

    }// function

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        function(str, 0, "", set);
    }
}
