package Arrays_Strings.Stack;

class RemoveConsecutiveWords {

    public static String removeWords(String str) {

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        String prev = "";

        for (String word : words) {
            if (!word.equals(prev)) {
                result.append(word).append(" ");
                prev = word;
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str = "hey hey you you are are good";

        System.out.println(removeWords(str));
    }
}