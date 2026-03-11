import java.util.Scanner;

public class PalindromeCheckerApp {

    // Service class
    static class PalindromeService {

        public boolean isPalindrome(String str) {

            str = str.toLowerCase().replaceAll("\\s+", "");

            int start = 0;
            int end = str.length() - 1;

            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();

        if (service.isPalindrome(input)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is NOT a Palindrome");
        }

        sc.close();
    }
}