public class _42_Queue_Enqueue {
    public static void main(String args[]) {
        Queue myQueue = new Queue(10);

        System.out.println("\n\n");
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);

        System.out.println("");
        myQueue.printQueue();
        System.out.println("\n\n");
    }
}
