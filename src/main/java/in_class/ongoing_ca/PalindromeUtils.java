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
        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindromeBruteForce("racecar"));
        System.out.println(checkPalindromeBruteForce("Kayak"));
        System.out.println(checkPalindromeBruteForce("Katie"));
    }
}