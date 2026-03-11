import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {



                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string or number: ");
                String input = sc.nextLine();

                String reversed = "";


                for (int i = input.length() - 1; i >= 0; i--) {
                    reversed = reversed + input.charAt(i);
                }


                if (input.equals(reversed)) {
                    System.out.println("It is a Palindrome.");
                } else {
                    System.out.println("It is NOT a Palindrome.");
                }

                sc.close();
            }
        }

