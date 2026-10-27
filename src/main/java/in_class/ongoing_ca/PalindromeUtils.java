package in_class.ongoing_ca;

public class PalindromeUtils {

    /**
     * Checks if a string is a palindrome.
     *
     * @param text the string to check
     * @return true if it is a palindrome, otherwise false
     */
    public static boolean checkPalindromeBruteForce(String text) {
        String cleaned = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                c = Character.toLowerCase(c);
                cleaned = cleaned + c;
            }
        }
    }
}