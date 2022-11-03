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

import java.util.Scanner;
import LinkedList.Deque;

public class PalindromeChecker {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check palindrome or not");
    	String str = scanner.next();
        //String str = "madam";
        String revFront = "";
        Deque deque = new Deque(str.length());

        for (int i = 0; i < str.length(); i++) {
            deque.insertFront(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            revFront += deque.getFront();
            deque.deleteFront();
        }

        if(revFront.equals(str)) {
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
        scanner.close();

    }
}
