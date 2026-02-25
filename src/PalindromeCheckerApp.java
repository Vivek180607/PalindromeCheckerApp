public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        System.out.println("Palindrome Checker App - UC2");
        System.out.println("---------------------------------");
        System.out.println("Given Word: " + word);

        // Check if the word is a palindrome
        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result using if-else
        if (isPalindrome) {
            System.out.println("Result: The given word is a Palindrome.");
        } else {
            System.out.println("Result: The given word is NOT a Palindrome.");
        }

        System.out.println("\nProgram executed successfully.");
    }
}