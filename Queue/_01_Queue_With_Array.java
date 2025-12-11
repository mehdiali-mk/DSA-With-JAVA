package Queue;

public class _01_Queue_With_Array {
    static class Queue {
        static int array[];
        static int size;
        static int rear;

        Queue(int size) {
            array = new int[size];
            this.size = size;
            rear = -1;
        }

        static boolean isEmpty() {
            return rear == -1;
        }

        static void add(int data) {
            if (rear == size - 1) {
                System.out.println("\nQueue is full.");
            }

            rear++;
            array[rear] = data;
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("\nQueue is already empty");
            }

            int front = array[0];
            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];
            }
            rear--;
            return front;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("\nQueue is empty");
            }

            return array[0];
        }
    }

    public static void main(String args[]) {
        Queue myQueue = new Queue(5);

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.remove();
        myQueue.remove();

        System.out.print("\n\nQueue = [ ");
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.remove() + " ");
        }
        System.out.println("]\n\n");
    }
}
