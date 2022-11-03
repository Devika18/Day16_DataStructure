/* Simple Balanced Parentheses
a. Desc -> Take an Arithmetic Expression such as
(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
performance of operations. Ensure parentheses must appear in a balanced
fashion.
b. I/P -> read in Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
c. Logic -> Write a Stack Class to push open parenthesis “(“ and pop closed
parenthesis “)”. At the End of the Expression if the Stack is Empty then the
Arithmetic Expression is Balanced. Stack Class Methods are Stack(), push(),
pop(), peak(), isEmpty(), size()
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.
*/

import LinkedList.Stack;
import LinkedList.MyNode;
import java.util.Scanner;

public class BalancedParanthesis {
    static boolean isBalanced(String expression) {

        Stack<Character> stackList = new Stack<Character>();

        char expressionArray[] = expression.toCharArray();
        int lengthOfarray = expression.length();
        int countOfOpenBrackets = 0;
        int countOfClosedBrackets = 0;

        for (int index = 0; index < lengthOfarray; index++) {
            if (expressionArray[index] == '(') {
                MyNode<Character> bracket = new MyNode<Character>(expressionArray[index]);
                stackList.push(bracket);

                countOfOpenBrackets++;
            }
            else if (expressionArray[index] == ')') {
                stackList.pop();
                countOfClosedBrackets++;
            }
        }
        if (countOfOpenBrackets == countOfClosedBrackets) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arithmetic expression :");
        String expression = sc.nextLine();

        if (isBalanced(expression))
            System.out.println("Expression is balanced");
        else {
            System.out.println("Expression is not Balanced");
        }
        sc.close();
    }
}
