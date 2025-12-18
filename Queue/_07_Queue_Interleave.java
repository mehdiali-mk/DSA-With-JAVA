package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _07_Queue_Interleave {
    public static void interleaveQueue(Queue<Integer> originalQueue) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = originalQueue.size();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(originalQueue.remove());
        }

        while (!firstHalf.isEmpty()) {
            originalQueue.add(firstHalf.remove());
            originalQueue.add(originalQueue.remove());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);
        myQueue.add(8);
        myQueue.add(9);
        myQueue.add(10);

        System.out.println("\n\nOriginal Queue:\n" + myQueue);
        interleaveQueue(myQueue);
        System.out.println("\nInterleaved Queue:\n" + myQueue + "\n\n");
    }
}
