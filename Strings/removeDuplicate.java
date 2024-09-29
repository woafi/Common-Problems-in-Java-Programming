public class removeDuplicate {
    public static boolean[] map = new boolean[27];

    public static void removeduplicate(String str, int dex, String newStr) {

        if (dex == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(dex);
        if (map[currChar - 'a']) {
            removeduplicate(str, dex + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeduplicate(str, dex + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeduplicate(str, 0, "");

    }

}
