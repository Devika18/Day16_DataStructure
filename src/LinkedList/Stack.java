package LinkedList;

public class Stack <K>{
        public final LinkedList stackLinkedList;
        public Stack() {
            stackLinkedList = new LinkedList();
        }

        public void push(INode element) {
            stackLinkedList.add(element);
        }
        public INode peek() {
            return stackLinkedList.head;
        }

        public INode pop() {
            return stackLinkedList.deleteFirst();
        }

        public boolean isEmpty() {
            if(stackLinkedList.head != null) {
                return false;
            }
            else {
                return true;
            }
        }

        public int size() {
            return stackLinkedList.size();
        }
        public void printStack() {
            stackLinkedList.printLinkedList();
        }
}

