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

    /**
     * Reverses the vowels using two pointers.
     *
     * @param text the string to change
     * @return the string with its vowels reversed
     */
    public static String reverseVowelsTwoPointer(String text) {
        char[] letters = text.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            char c = Character.toLowerCase(letters[left]);
            if (c != 'a' && c != 'e' && c != 'i' &&
                    c != 'o' && c != 'u') {
                left++;
                continue;
            }

            c = Character.toLowerCase(letters[right]);
            if (c != 'a' && c != 'e' && c != 'i' &&
                    c != 'o' && c != 'u') {
                right--;
                continue;
            }

            char temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;
            left++;
            right--;
        }
        return new String(letters);
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.reverseVowelsBruteForce("hello"));
        System.out.println(StringUtils.reverseVowelsBruteForce("Katie"));
        System.out.println(StringUtils.reverseVowelsTwoPointer("hello"));
        System.out.println(StringUtils.reverseVowelsTwoPointer("Katie"));
    }
}