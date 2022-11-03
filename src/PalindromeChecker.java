/* Palindrome-Checker
a. Desc -> A palindrome is a string that reads the same forward and backward, for
example, radar, toot, and madam. We would like to construct an algorithm to
input a string of characters and check whether it is a palindrome.
b. I/P -> Take a String as an Input
c. Logic -> The solution to this problem will use a deque to store the characters of
the string. We will process the string from left to right and add each character to
the rear of the deque.
d. O/P -> True or False to Show if the String is Palindrome or not.
*/

public class PalindromeChecker {


    public static boolean isPalindrome(String a) {
        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder.reverse();
        String data = stringBuilder.toString();
        if (a.equals(data)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = "madam";
        System.out.println(PalindromeChecker.isPalindrome(a));
    }
}
