public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed using equals()
        boolean isPalindrome = input.equals(reversed);

        // Display results
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}