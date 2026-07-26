import java.util.Stack;

public class _48_Stack_Queue_Enqueue_Dequeue {
    public static void main(String args[]) {
        Queue myQueue = new Queue(10);

        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);

        System.out.println("\n\n");
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        System.out.println();
        myQueue.printQueue();
        System.out.println("\n\n");
    }
}

class Queue {
    private int top;
    private int length = 0;
    private Stack<Integer> myStack = new Stack<>();

    Queue(int value) {
        myStack.push(value);
        length++;
    }

    public int getTopValue() {
        if (length == 0) {
            System.out.println("Empty Queue");
            return -1;
        }
        return myStack.peek();
    }

    public int getLengthValue() {
        return length;
    }

    public void enqueue(int value) {
        myStack.push(value);
        length++;
    }

    public int dequeue() {
        if (length == 0) {
            System.out.println("Empty Queue");
            return -1;
        }
        if (length == 1) {
            return myStack.pop();
        }

        Stack<Integer> tempStack = new Stack<>();
        while (!myStack.isEmpty()) {
            tempStack.push(myStack.pop());
        }
        int removedValue = tempStack.pop();
        while (!tempStack.isEmpty()) {
            myStack.push(tempStack.pop());
        }

        return removedValue;
    }

    public void printQueue() {
        System.out.println("\nPrint Queue = " + myStack);
    }
}
