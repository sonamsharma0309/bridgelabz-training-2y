public class SBReverseString {
    public static String reverseUsingStringBuilder(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseUsingStringBuilder("hello")); // olleh
    }
}
