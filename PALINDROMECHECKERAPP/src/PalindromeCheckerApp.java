import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    static void main() {



                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                Deque<Character> deque = new LinkedList<>();

                // Add characters to deque
                for (int i = 0; i < input.length(); i++) {
                    deque.addLast(input.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare front and rear characters
                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
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