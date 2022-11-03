/* UnOrdered List
a. Desc -> Read the Text from a file, split it into words and arrange it as Linked List.
Take a user input to search a Word in the List. If the Word is not found then add it
to the list, and if it found then remove the word from the List. In the end save the
list into a file
b. I/P -> Read from file the list of Words and take user input to search a Text
c. Logic -> Create a Unordered Linked List. The Basic Building Block is the Node
Object. Each node object must hold at least two pieces of information. One ref to
the data field and second the ref to the next node object.
d. O/P -> The List of Words to a File.
*/

import java.util.Scanner;
import LinkedList.LinkedList;
import LinkedList.MyNode;

public class UnOrderedList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> wordLinkedList = new LinkedList<String>();

        System.out.println("Enter a sentence : ");
        String sentence = sc.nextLine();

        String[] sentenceArray = sentence.split(" ");

        for(int index = 0; index<sentenceArray.length ; index++) {
            MyNode<String> word = new MyNode<String>(sentenceArray[index]);
            wordLinkedList.add(word);
        }
        wordLinkedList.printLinkedList();

        System.out.println("Enter the Word to be searched : ");
        String wordToBeSearched = sc.next();

        if(wordLinkedList.search(wordToBeSearched) == null) {
            System.out.println(wordToBeSearched+" Not Present!");
            MyNode<String> wordToBeAdded = new MyNode<String>(wordToBeSearched);
            wordLinkedList.add(wordToBeAdded);
            System.out.println("Word Has Been Added !");
            wordLinkedList.printLinkedList();
        }
        else {
            System.out.println(wordToBeSearched+" is Present!");
            wordLinkedList.deleteNodeWithKey(wordToBeSearched);
            System.out.println("Word Has Been Removed !");
            wordLinkedList.printLinkedList();
        }
        sc.close();
    }
}
