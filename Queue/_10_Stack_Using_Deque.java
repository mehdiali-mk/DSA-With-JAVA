import java.util.Deque;
import java.util.LinkedList;

public class _10_Stack_Using_Deque {
    public static class Stack {
        Deque<Integer> myDeque = new LinkedList<>();

        public Boolean isEmpty() {
            return myDeque.isEmpty();
        }

        public void push(int data) {
            myDeque.addLast(data);
        }

        public int pop() {
            if (myDeque.isEmpty()) {
                System.out.println("\nStack is already empty.");
                return -1;
            }
            return myDeque.removeLast();
        }

        public int peek() {
            if (myDeque.isEmpty()) {
                System.out.println("\nStack is already empty.");
                return -1;
            }

            return myDeque.getLast();
        }
    }

    public static void main(String args[]) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.print("\n\nStack = [ ");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }
        System.out.println("]\n\n");
    }
}
