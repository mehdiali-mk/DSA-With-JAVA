package Queue;

public class _03_Queue_With_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        public Boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is already empty.");
                return -1;
            }

            int front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is already empty.");
                return -1;
            }
            return head.data;
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
