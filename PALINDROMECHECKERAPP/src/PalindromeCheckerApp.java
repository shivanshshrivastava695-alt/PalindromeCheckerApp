import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {

        Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                // Convert string to character array
                char[] arr = input.toCharArray();

                boolean isPalindrome = true;

                // Check characters from both ends
                for (int i = 0; i < arr.length / 2; i++) {
                    if (arr[i] != arr[arr.length - 1 - i]) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("The given string is a Palindrome");
                } else {
                    System.out.println("The given string is NOT a Palindrome");
                }

                sc.close();
            }
        }


