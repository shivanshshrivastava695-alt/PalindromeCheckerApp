import java.util.Scanner;

public class PalindromeCheckerApp {


        interface PalindromeStrategy {
            boolean isPalindrome(String str);
        }

        // Strategy 1: Reverse String Method
        static class ReversePalindromeStrategy implements PalindromeStrategy {

            public boolean isPalindrome(String str) {
                String reversed = "";

                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i);
                }

                return str.equalsIgnoreCase(reversed);
            }
        }

        // Strategy 2: Two Pointer Method
        static class TwoPointerPalindromeStrategy implements PalindromeStrategy {

            public boolean isPalindrome(String str) {

                int start = 0;
                int end = str.length() - 1;

                while (start < end) {
                    if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                        return false;
                    }
                    start++;
                    end--;
                }

                return true;
            }
        }

        // Context Class
        static class PalindromeContext {

            private PalindromeStrategy strategy;

            public void setStrategy(PalindromeStrategy strategy) {
                this.strategy = strategy;
            }

            public boolean checkPalindrome(String str) {
                return strategy.isPalindrome(str);
            }
        }

        // Main Method
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            System.out.println("Choose Algorithm:");
            System.out.println("1. Reverse String Method");
            System.out.println("2. Two Pointer Method");

            int choice = sc.nextInt();

            PalindromeContext context = new PalindromeContext();

            if (choice == 1) {
                context.setStrategy(new ReversePalindromeStrategy());
            } else {
                context.setStrategy(new TwoPointerPalindromeStrategy());
            }

            boolean result = context.checkPalindrome(input);

            if (result) {
                System.out.println("The given string is a Palindrome");
            } else {
                System.out.println("The given string is NOT a Palindrome");
            }

            sc.close();
        }
    }