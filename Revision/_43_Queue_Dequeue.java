public class _43_Queue_Dequeue {
    public static void main(String args[]) {
        Queue myQueue = new Queue(10);

        System.out.println("\n\n");
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        System.out.println("");
        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();

        System.out.println("");
        myQueue.printQueue();
        System.out.println("\n\n");
    }
}
