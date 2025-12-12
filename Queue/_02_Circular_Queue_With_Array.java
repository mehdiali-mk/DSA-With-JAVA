package Queue;

public class _02_Circular_Queue_With_Array {
    static class Queue {
        static int array[];
        static int size;
        static int rear;
        static int front;

        Queue(int size) {
            array = new int[size];
            this.size = size;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full.");
                return;
            }

            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            array[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = array[front];

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue.");
                return -1;
            }

            return array[front];
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
        myQueue.add(1);
        myQueue.add(2);

        System.out.print("\n\nQueue = [ ");
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.remove() + " ");
        }
        System.out.println("]\n\n");
    }
}
