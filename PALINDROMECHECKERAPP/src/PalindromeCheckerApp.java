import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main() {


                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                // Convert to lowercase and remove spaces
                input = input.toLowerCase().replaceAll("\\s+", "");

                int start = 0;
                int end = input.length() - 1;

                boolean isPalindrome = true;

                while (start < end) {
                    if (input.charAt(start) != input.charAt(end)) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if (isPalindrome) {
                    System.out.println("The given string    is a Palindrome");
                } else {
                    System.out.println("The given string is NOT a Palindrome");
                }

                sc.close();
            }
        }