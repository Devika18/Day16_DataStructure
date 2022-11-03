/* Ordered List
a. Desc -> Read .a List of Numbers from a file and arrange it ascending Order in a
Linked List. Take user input for a number, if found then pop the number out of the
list else insert the number in appropriate position
b. I/P -> Read from file the list of Numbers and take user input for a new number
c. Logic -> Create a Ordered Linked List having Numbers in ascending order.
d. O/P -> The List of Numbers to a File.
*/

import java.util.Scanner;
import LinkedList.MyNode;
import LinkedList.SortedLinkedList;

public class OrderedList {
    public static void main(String[] args) {
        System.out.println("Welcome to Ordered List Search Program");

        Scanner sc = new Scanner(System.in);
        SortedLinkedList<Integer> numberLinkedList = new SortedLinkedList<Integer>();

        System.out.println("Enter the length of list : ");
        int size = sc.nextInt();

        System.out.println("Enter the numbers : ");
        for (int index = 0; index < size; index++) {
            MyNode<Integer> number = new MyNode<Integer>(sc.nextInt());
            numberLinkedList.add(number);
        }
        numberLinkedList.printSortedLinkedList();

        System.out.println("Enter the Number to be searched : ");
        Integer numberToBeSearched = sc.nextInt();

        if (numberLinkedList.search(numberToBeSearched) == false) {
            System.out.println(numberToBeSearched + " Not Present!");
            MyNode<Integer> numberToBeAdded = new MyNode<Integer>(numberToBeSearched);
            numberLinkedList.add(numberToBeAdded);
            System.out.println("Number Has Been Added !");
            numberLinkedList.printSortedLinkedList();
        } else {
            System.out.println(numberToBeSearched + " is Present!");
            numberLinkedList.remove(numberToBeSearched);
            System.out.println("Number Has Been Removed !");
            numberLinkedList.printSortedLinkedList();
        }

        sc.close();
    }
}
