import java.util.Deque;
import java.util.LinkedList;

public class _11_Queue_Using_Deque {
    public static class Queue {
        Deque<Integer> myDeque = new LinkedList<>();

        public Boolean isEmpty() {
            return myDeque.isEmpty();
        }

        public void add(int data) {
            myDeque.addLast(data);
        }

        public int remove() {
            if (this.isEmpty()) {
                System.out.println("\nQueue is already empty.");
                return -1;
            }
            return myDeque.removeFirst();
        }

        public int peek() {
            if (this.isEmpty()) {
                System.out.println("\nQueue is already empty.");
                return -1;
            }
            return myDeque.getFirst();
        }
    }

    public static void main(String args[]) {
        Queue myQueue = new Queue();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);

        System.out.print("\n\nQueue = [ ");
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.remove() + " ");
        }
        System.out.println("]\n\n");
    }
}
