package LinkedList;

public class Queue<K> {
    private final LinkedList queueLinkedList;

    public Queue() {
        queueLinkedList = new LinkedList();
    }
    public void enqueue(INode element) {
        queueLinkedList.append(element);
    }
    public void printQueue() {
        queueLinkedList.printLinkedList();
    }

    public INode dequeue() {
        return queueLinkedList.deleteFirst();
    }

    public boolean isEmpty() {
        if(queueLinkedList.head != null) {
            return false;
        }
        else {
            return true;
        }
    }
}

