package Queue;

import java.util.LinkedList;

public class _05_Stack_With_Two_Queues {
    static class Stack {
        LinkedList<Integer> q1 = new LinkedList<>();
        LinkedList<Integer> q2 = new LinkedList<>();

        public Boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void add(int data) {
            if (!q1.isEmpty()) {
                q1.push(data);
            } else {
                q2.push(data);
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("\nStack is Empty.");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("\nStack is Empty.");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.push(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.push(top);
                }
            }

            return top;
        }
    }

    public static void main(String args[]) {
        Stack myStack = new Stack();

        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);
        myStack.add(5);

        System.out.print("\n\nStack = [ ");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.remove() + " ");
        }
        System.out.println("]\n\n");
    }
}
