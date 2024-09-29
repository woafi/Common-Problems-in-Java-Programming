public class mobilecode {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int dex, String combination) {
        if (dex == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(dex);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, dex + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "12";
        printComb(str, 0, "");
    }

}
