public class repeated_word {
    static class Simple {
        private String word;
        private String phrase;
        
        Simple(int number, String w) {
            word = w;
            phrase = mystery(number, w);
        }

        private String mystery(int num, String s) {
            StringBuilder answer = new StringBuilder();
            for (int k = 0; k < num; k++) {
                answer.append(s + " ");
            }
            return answer.toString();
        }

        public String toString() {
            return phrase + "is " + word + " repeated";
        }
    }

    public static void main(String[] args) {
        Simple item1 = new Simple(3, "blue");
        System.out.println(item1);
    }
}
