import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Example word to check for palindrome
        String word = "level";

        // Check if the word is a palindrome using a helper method
        if (isPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully!");
    }

    /**
     * Method to check if a word is a palindrome.
     * @param word the input string
     * @return true if the word is a palindrome, false otherwise
     */
    static boolean isPalindrome(String word) {
        // Convert string to char array
        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        // Compare characters from both ends
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false; // Early exit if mismatch found
            }
            start++;
            end--;
        }

        return true; // Palindrome if all checks passed
    }
}