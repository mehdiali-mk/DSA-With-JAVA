package Queue;

import java.util.Stack;

public class _04_Queue_With_Two_Stacks {
    public static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public Boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("\nQueue is empty");
                return -1;
            }

            return s1.pop();
        }

        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("\nQueue is empty");
                return -1;
            }

            return s1.peek();
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
