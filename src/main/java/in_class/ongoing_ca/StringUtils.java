package in_class.ongoing_ca;

public class StringUtils {
    /**
     * reverses the vowels in a string.
     *
     * @param text the string to change
     * @return the string with its vowels reversed
     */
    public static String reverseVowelsBruteForce(String text) {
        String vowels = "";

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u') {
                vowels = vowels + text.charAt(i);
            }
        }

        String reversedVowels = "";
        for (int i = vowels.length() - 1; i >= 0; i--) {
            reversedVowels = reversedVowels + vowels.charAt(i);
        }
        String result = "";
        int vowelIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u') {
                result = result + reversedVowels.charAt(vowelIndex);
                vowelIndex++;
            } else {
                result = result + text.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(StringUtils.reverseVowelsBruteForce("hello"));
        System.out.println(StringUtils.reverseVowelsBruteForce("Katie"));
    }
}