import java.util.Scanner;

public class BankCashCounter {
    private int arr[]; // array to store queue elements
    private int front; // front points to front element in the queue
    private int rear; // rear points to last element in the queue
    private int capacity; // maximum capacity of the queue
    private int count; // current size of the queue
    private static int bankBalance = 50000;
    static Scanner scanner = new Scanner(System.in);

    BankCashCounter(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void dequeue() {
        // check for queue underflow
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        front = (front + 1) % capacity;
        count--;
    }

    public void enqueue(int item) {
        // check for queue overflow
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("For\n1.Withdraw\n2.Deposit\n3.enquiry\n4.Exit");
        int choice = scanner.nextInt();
        int amount;
        switch (choice) {
            case 1:
                System.out.println("how much amount you want to withdraw");
                amount = scanner.nextInt();
                if (amount < bankBalance) {
                    bankBalance = bankBalance - amount;
                } else {
                    System.out.println("Minimum A/c balance should be 5000/-");
                }
                System.out.println("Bank balance is: "+bankBalance);
                break;
            case 2:
                System.out.println("how much amount you want to deposit");
                amount = scanner.nextInt();
                bankBalance = bankBalance + amount;
                System.out.println("Bank balance is: "+bankBalance);
                break;
            case 3:
                System.out.println("Please call to customer care");
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("invalid option");
                break;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }

    public int size() {
        return count;
    }

    public Boolean isEmpty() {
        return (size() == 0);
    }

    public Boolean isFull() {
        return (size() == capacity);
    }

    public static void main(String[] args) {
        // create a queue of capacity 5

        System.out.println("Enter number of Peoples present in the Bank");
        int people = scanner.nextInt();// 5
        BankCashCounter queue = new BankCashCounter(people);
        for (int i = 0; i < people; i++) {
            queue.enqueue(i);
            System.out.println("Customer in row: " + queue.peek());
            queue.dequeue();
        }

        if (queue.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");

        scanner.close();
    }
}

