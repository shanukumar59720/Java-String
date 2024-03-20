public class stringCode2 {
    public static void main(String[] args) {
        String str = "Hello, have a good day";

        String result = removeConsonants(str);
        System.out.println("String after removing consonants: " + result);
    }

    public static String removeConsonants(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
