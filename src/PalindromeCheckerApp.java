/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case: UC1 - Application Entry & Welcome Message
 */

public class PalindromeCheckerApp {

    // Application constants
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    /**
     * Entry point of the application
     * JVM invokes this method automatically
     */
    public static void main(String[] args) {

        displayWelcomeMessage();

        // Application flow continues (future use cases will be added here)
        System.out.println("\nApplication initialized successfully.");
    }

    /**
     * Displays application name and version
     */
    public static void displayWelcomeMessage() {
        System.out.println("=================================");
        System.out.println(" Welcome to " + APP_NAME);
        System.out.println(" " + APP_VERSION);
        System.out.println("=================================");
    }
}