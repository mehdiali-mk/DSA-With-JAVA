public class _41_Queue_Constructor {
    public static void main(String args[]) {
        Queue myQueue = new Queue(10);

        System.out.println("\n\n");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("");
        myQueue.printQueue();
        System.out.println("\n\n");
    }
}
